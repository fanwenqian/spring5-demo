package com.fan.spring5.jdbctemplate.test2.service;

import com.fan.spring5.jdbctemplate.test2.dao.UserDao;
import com.fan.spring5.jdbctemplate.test2.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public void add(User user) {
        userDao.add(user);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public void delete(String id) {
        userDao.delete(id);
    }

    public int selectCount() {
        return userDao.selectCount();
    }

    public User selectUser(String id) {
        return userDao.selectUser(id);
    }

    public List<User> selectAllUser() {
        return userDao.selectAllUser();
    }

    public void batchAdd(List<Object[]> batchArgs){
        userDao.batchAdd(batchArgs);
    }

    public void batchUpdate(List<Object[]> batchArgs){
        userDao.batchUpdate(batchArgs);
    }
}
