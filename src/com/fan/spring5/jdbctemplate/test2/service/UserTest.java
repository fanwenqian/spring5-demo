package com.fan.spring5.jdbctemplate.test2.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
