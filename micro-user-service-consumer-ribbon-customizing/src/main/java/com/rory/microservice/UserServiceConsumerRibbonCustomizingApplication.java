package com.rory.microservice;

import com.rory.microservice.config.RibbonConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

/**
 * Created by RoryGao on 2017/7/9.
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "micro-user-service", configuration = RibbonConfiguration.class)
@ComponentScan(excludeFilters = { @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = RibbonConfiguration.class) })
public class UserServiceConsumerRibbonCustomizingApplication {
    @Autowired
    private RestTemplateBuilder templateBuilder;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return templateBuilder.build();
    }

    public static void main(String[] args) {
        SpringApplication.run(UserServiceConsumerRibbonCustomizingApplication.class, args);
    }
}
