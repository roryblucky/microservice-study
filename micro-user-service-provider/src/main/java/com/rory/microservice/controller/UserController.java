package com.rory.microservice.controller;

import com.rory.microservice.repository.UserRepository;
import com.rory.microservice.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by RoryGao on 2017/7/9.
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/simple/users/{id}")
    public UserEntity getUserById(@PathVariable Long id) {
        return userRepository.findOne(id);
    }
}
