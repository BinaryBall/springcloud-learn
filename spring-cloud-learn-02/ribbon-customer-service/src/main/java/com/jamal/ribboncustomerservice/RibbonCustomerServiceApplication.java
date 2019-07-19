package com.jamal.ribboncustomerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class RibbonCustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonCustomerServiceApplication.class, args);
    }

    @Bean
    @LoadBalanced // 开启负载均衡
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
