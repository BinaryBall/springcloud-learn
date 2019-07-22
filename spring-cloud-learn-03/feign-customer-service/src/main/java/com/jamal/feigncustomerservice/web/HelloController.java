package com.jamal.feigncustomerservice.web;

import com.jamal.feigncustomerservice.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoxiang
 * @title: HelloController
 * @projectName spring-cloud-learn-02
 * @description: TODO
 * @date 2019/7/1915:23
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping(path = "/hello")
    public String hello(){
        return helloService.hello();
    }
}
