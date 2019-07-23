package com.jamal.nacosconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class NacosConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigServerApplication.class, args);
    }

}
