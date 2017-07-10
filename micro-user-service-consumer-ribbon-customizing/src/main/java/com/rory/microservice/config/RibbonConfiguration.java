package com.rory.microservice.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by RoryGao on 2017/7/9.
 */
@Configuration
public class RibbonConfiguration {

    public RibbonConfiguration() {
        System.out.println("Init");
    }
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
