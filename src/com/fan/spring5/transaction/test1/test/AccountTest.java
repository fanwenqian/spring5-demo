package com.fan.spring5.transaction.test1.test;

import com.fan.spring5.User;
import com.fan.spring5.transaction.test1.config.TxConfig;
import com.fan.spring5.transaction.test1.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.function.Supplier;

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

    @Test
    public void test3(){
        //1.创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        //2.调用GenericApplicationContext对象注册对象
        context.refresh();
        context.registerBean("user", User.class , (Supplier<User>) User::new);
        //3.获取在spring中注册的对象
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
