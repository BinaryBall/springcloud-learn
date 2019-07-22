package com.jamal.ribboncustomerserver.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author xiaoxiang
 * @title: HelloService
 * @projectName spring-cloud-learn-03
 * @description: TODO
 * @date 2019/7/229:39
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String hello(){
        return restTemplate.getForObject("http://hello-provider-service/hello",String.class);
    }

    public String helloError(){
        return "服务器繁忙，请稍后再试！";
    }
}
