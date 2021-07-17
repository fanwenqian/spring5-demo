package com.fan.spring5.factorybean;

import com.fan.spring5.collection.Course;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fans
 */
public class MybeanTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("factorybean.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("factorybean.xml");
        Course course = context.getBean("myBean", Course.class);
        Course course2 = context.getBean("myBean", Course.class);

        //true  说明是spring默认为单例
        System.out.println(course == course2);
    }
}
