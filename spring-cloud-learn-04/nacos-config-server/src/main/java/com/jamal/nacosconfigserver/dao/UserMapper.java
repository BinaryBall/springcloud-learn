package com.jamal.nacosconfigserver.dao;


import com.jamal.nacosconfigserver.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

//@Mapper
public interface UserMapper {
//    @Select("select * from user")
    List<User> findAll();

    void insertUser(User user);

    void updateUser(User user);
}
