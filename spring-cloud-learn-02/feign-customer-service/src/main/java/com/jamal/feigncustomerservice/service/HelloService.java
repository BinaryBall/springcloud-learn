package com.jamal.feigncustomerservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xiaoxiang
 * @title: HelloService
 * @projectName spring-cloud-learn-02
 * @description: TODO
 * @date 2019/7/1915:21
 */
@FeignClient(value = "hello-provider-service")
public interface HelloService {

    @GetMapping(path = "/hello")
    String hello();
}
