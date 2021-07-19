package com.fan.spring5.aop.proxy.impl;

import com.fan.spring5.aop.proxy.UserDao;

/**
 *
 * @author fans
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String update(String id) {
       System.out.println(id);
       return id;
    }
}
