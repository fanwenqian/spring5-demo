package com.fan.spring5.service;

import com.fan.spring5.dao.UserDao;

/**
 * @author fans
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("UserService add.........");
        userDao.update();
    }
}
