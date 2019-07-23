package com.jamal.nacosconfigserver.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoxiang
 * @title: ConfigController
 * @projectName spring-cloud-learn-04
 * @description: TODO
 * @date 2019/7/2213:37
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${prod.value:1}")
    String mastValue;

    @Value("${extValue:''}")
    String extValue;

    @GetMapping("/prod-config")
    public String test(){
        return mastValue;
    }

    @GetMapping("/ext-config")
    public String extValue(){
        return extValue;
    }
}
