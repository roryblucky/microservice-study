package com.rory.microservice.controller;

import com.rory.microservice.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by RoryGao on 2017/7/9.
 */
@RestController
public class MyController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/myservice/users/{id}")
    public ResponseEntity<UserEntity> gerUserById(@PathVariable String id) {
        return restTemplate.getForEntity("http://micro-user-service/simple/users/"+ id, UserEntity.class);
    }

    @GetMapping("/loadbalances/")
    public String printLoadBalanceResult() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("micro-user-service");
        ServiceInstance serviceInstance2 = loadBalancerClient.choose("micro-user-service2");
        System.out.println(serviceInstance.getServiceId() + ":" + serviceInstance.getPort());
        System.out.println(serviceInstance2.getServiceId() + ":" + serviceInstance2.getPort());
        return "1";
    }


}
