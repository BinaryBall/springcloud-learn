package com.jamal.helloproviderservice.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoxiang
 * @title: HelloController
 * @projectName spring-cloud-learn-02
 * @description: TODO
 * @date 2019/7/1914:16
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @GetMapping(path = "/hello")
    public String hello() {
        return "hello spring cloud ,i am port :" + port;
    }
}
