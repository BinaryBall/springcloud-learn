package com.jamal.ribboncustomerservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author xiaoxiang
 * @title: HelloService
 * @projectName spring-cloud-learn-02
 * @description: TODO
 * @date 2019/7/1914:57
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String hello(){
        return restTemplate.getForObject("http://hello-provider-service/hello",String.class);
    }
}
