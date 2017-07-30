package com.rory.microservice.controller;

import com.rory.microservice.entity.UserEntity;
import com.rory.microservice.service.UserServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by RoryGao on 2017/7/14.
 */
@RestController
public class MyController {

    @Autowired
    private UserServiceFeignClient userServiceFeignClient;

    @GetMapping("/myservice/users/{id}")
    public UserEntity getUserById(@PathVariable Long id) {
        return userServiceFeignClient.findUserByIdService(id);
    }
}
