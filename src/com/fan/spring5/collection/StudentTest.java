package com.fan.spring5.collection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fans
 */
public class StudentTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionBean.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}
