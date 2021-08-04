package com.fan.spring5.jdbctemplate.test2.service;

import com.fan.spring5.jdbctemplate.test2.dao.UserDao;
import com.fan.spring5.jdbctemplate.test2.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public void add(){
        User user = new User();
        user.setId("1");
        user.setName("fans");
        user.setStatus("study");
        userDao.add(user);
    }
}
