package com.fan.spring5.aop.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("xmlProxy.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
