package com.fan.spring5.jdbctemplate.test2.dao;

import com.fan.spring5.jdbctemplate.test2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(User user) {
        String sql = "insert into user values (?,?,?)";
        int update = jdbcTemplate.update(sql, user.getId(), user.getName(), user.getStatus());
        System.out.println("影响了" + update + "行！");
    }
}
