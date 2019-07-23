package com.jamal.nacosconfigserver.service;

import com.jamal.nacosconfigserver.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void insertUser(User user);
}
