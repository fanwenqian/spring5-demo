package com.fan.spring5.jdbctemplate.test2.dao;

import com.fan.spring5.jdbctemplate.test2.entity.User;

import java.util.List;

public interface UserDao {

    void add(User user);

    void update(User user);

    void delete(String id);

    int selectCount();

    User selectUser(String id);

    List<User> selectAllUser();

    void batchAdd(List<Object[]> batchArgs);

    void batchUpdate(List<Object[]> batchArgs);

    void batchDelete(List<Object[]> batchArgs);
}
