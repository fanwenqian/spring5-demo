package com.fan.spring5.transaction.test1.dao;

import com.fan.spring5.transaction.test1.entity.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author fans
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public void update(Account account) {
        String sql = "update account set money = ? where id = ?";
        Object[] args = {account.getMoney(), account.getId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println("影响了" + update + "行！");
    }

    @Override
    public Account select(String id) {
        String sql = "select * from account where id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Account.class), id);
    }
}
