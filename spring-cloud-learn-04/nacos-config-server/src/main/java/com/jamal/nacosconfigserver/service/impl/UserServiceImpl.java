package com.jamal.nacosconfigserver.service.impl;

import com.jamal.nacosconfigserver.dao.UserMapper;
import com.jamal.nacosconfigserver.domain.User;
import com.jamal.nacosconfigserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }
}
