package com.jamal.ribboncustomerserver.web;

import com.jamal.ribboncustomerserver.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoxiang
 * @title: HelloController
 * @projectName spring-cloud-learn-03
 * @description: TODO
 * @date 2019/7/229:39
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
