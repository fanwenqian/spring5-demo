package com.fan.spring5.annotation.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fans
 */
public class DeptTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationbean.xml");
        DeptService deptService = context.getBean("deptService", DeptService.class);
        deptService.add();
    }
}
