package com.fan.spring5.transaction.test1.dao;

import com.fan.spring5.jdbctemplate.test2.entity.User;
import com.fan.spring5.transaction.test1.entity.Account;

/**
 * @author fans
 */
public interface UserDao {

    void update(Account account);

    Account select(String id);
}
