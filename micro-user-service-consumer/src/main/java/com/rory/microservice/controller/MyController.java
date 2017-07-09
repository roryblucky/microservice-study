package com.rory.microservice.controller;

import com.rory.microservice.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${service.user.path}")
    private String servicePath;

    @GetMapping("/myservice/users/{id}")
    public ResponseEntity<UserEntity> gerUserById(@PathVariable String id) {
        return restTemplate.getForEntity(servicePath + id, UserEntity.class);
    }

}
