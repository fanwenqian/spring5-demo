package com.fan.spring5.jdbctemplate.test2.service;

import com.fan.spring5.jdbctemplate.test2.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class UserTest {

    @Test
    public void testAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user = new User();
        user.setId("2");
        user.setName("fan.wenqian");
        user.setStatus("studying");
        userService.add(user);
    }

    @Test
    public void testUpdate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user = new User();
        user.setId("1");
        user.setName("fan.wenqian");
        user.setStatus("learning");
        userService.update(user);
    }

    @Test
    public void testDelete() {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.delete("1");
    }

    @Test
    public void testSelectCount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        UserService userService = context.getBean("userService", UserService.class);
        int i = userService.selectCount();
        System.out.println("user表共" + i + "条数据");
    }

    @Test
    public void testSelectUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user = userService.selectUser("1");
        System.out.println(user.toString());
    }

    @Test
    public void testSelectAllUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        UserService userService = context.getBean("userService", UserService.class);
        List<User> users = userService.selectAllUser();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testBatchAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        UserService userService = context.getBean("userService", UserService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"5","fan","study1"};
        Object[] o2 = {"6","wen","study2"};
        Object[] o3 = {"7","qian","study3"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        userService.batchAdd(batchArgs);
    }
}
