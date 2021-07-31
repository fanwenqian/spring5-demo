package com.fan.spring5.aop.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationProxy.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
