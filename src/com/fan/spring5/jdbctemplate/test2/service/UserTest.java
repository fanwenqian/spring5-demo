package com.fan.spring5.jdbctemplate.test2.service;

import com.fan.spring5.jdbctemplate.test2.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user = new User();
        user.setId("1");
        user.setName("fans");
        user.setStatus("study");
        userService.add(user);
    }

    @Test
    public void testUpdate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user = new User();
        user.setId("1");
        user.setName("fan.wenqian");
        user.setStatus("learning");
        userService.update(user);
    }

    @Test
    public void testDelete(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.delete("1");
    }
}
