package com.rory.microservice.service;

import com.rory.microservice.entity.UserEntity;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by RoryGao on 2017/7/14.
 */
@FeignClient("micro-user-service")
public interface UserServiceFeignClient {

    @GetMapping("/simple/users/{id}")
    UserEntity findUserByIdService(@PathVariable("id") Long id);
}
