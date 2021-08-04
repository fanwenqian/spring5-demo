package com.fan.spring5.jdbctemplate.test2.dao;

import com.fan.spring5.jdbctemplate.test2.entity.User;

public interface UserDao {

    void add(User user);

    void update(User user);

    void delete(String id);
}
