package com.fan.spring5.transaction.test1.test;

import com.fan.spring5.transaction.test1.config.TxConfig;
import com.fan.spring5.transaction.test1.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fans
 */
public class AccountTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("transaction.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.change();
    }

    @Test
    public void test2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.change();
    }
}
