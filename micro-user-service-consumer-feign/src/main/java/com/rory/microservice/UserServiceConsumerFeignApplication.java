package com.rory.microservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by RoryGao on 2017/7/14.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class UserServiceConsumerFeignApplication {

    public static void main(String[] args) {
       new SpringApplicationBuilder(UserServiceConsumerFeignApplication.class).web(true).run(args);
    }
}
