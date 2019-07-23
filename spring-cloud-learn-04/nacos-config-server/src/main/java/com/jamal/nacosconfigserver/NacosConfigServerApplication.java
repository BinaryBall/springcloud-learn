package com.jamal.nacosconfigserver;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.jamal.nacosconfigserver.dao")
public class NacosConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigServerApplication.class, args);
    }

}
