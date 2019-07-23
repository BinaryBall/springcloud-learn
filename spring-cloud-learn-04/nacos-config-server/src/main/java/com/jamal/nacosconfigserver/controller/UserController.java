package com.jamal.nacosconfigserver.controller;

import com.jamal.nacosconfigserver.domain.User;
import com.jamal.nacosconfigserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RefreshScope
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/user")
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping(path = "/user")
    public String addUser(@RequestBody User user){
        String result = "success";
        try {
            userService.insertUser(user);
        }catch (Exception e){
            result = "fail";
        }
        return result;
    }


}
