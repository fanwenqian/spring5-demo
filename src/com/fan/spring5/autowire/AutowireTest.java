package com.fan.spring5.autowire;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fans
 */
public class AutowireTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireBean.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
