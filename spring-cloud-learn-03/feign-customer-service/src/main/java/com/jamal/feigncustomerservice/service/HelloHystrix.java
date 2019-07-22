package com.jamal.feigncustomerservice.service;

import org.springframework.stereotype.Component;

/**
 * @author xiaoxiang
 * @title: HelloHystrix
 * @projectName spring-cloud-learn-03
 * @description: TODO
 * @date 2019/7/2210:28
 */
@Component
public class HelloHystrix implements HelloService {

    @Override
    public String hello() {
        return "系统繁忙，请稍后再试!!!";
    }
}
