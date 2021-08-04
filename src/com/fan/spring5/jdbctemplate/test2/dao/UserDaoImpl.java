package com.fan.spring5.jdbctemplate.test2.dao;

import com.fan.spring5.jdbctemplate.test2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(User user) {
        String sql = "insert into user values (?,?,?)";
        Object[] args = {user.getId(), user.getName(), user.getStatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println("影响了" + update + "行！");
    }

    @Override
    public void update(User user) {
        String sql = "update user set name = ?,status = ? where id = ?";
        Object[] args = {user.getName(), user.getStatus(), user.getId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println("影响了" + update + "行！");
    }

    @Override
    public void delete(String id) {
        String sql = "delete from user where id = ?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println("影响了" + update + "行！");
    }

    @Override
    public int selectCount() {
        String sql = "select count(1) from user";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public User selectUser(String id) {
        String sql = "select * from user where id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), id);
    }

    @Override
    public List<User> selectAllUser() {
        String sql = "select * from user";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
    }

    @Override
    public void batchAdd(List<Object[]> batchArgs) {
        String sql = "insert into user values (?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        String sql = "update user set name = ?,status = ? where id = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}
