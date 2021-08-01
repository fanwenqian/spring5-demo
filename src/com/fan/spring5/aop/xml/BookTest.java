package com.fan.spring5.aop.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DecimalFormat;

public class BookTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("xmlProxy.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }

//    @Test
//    public void test2(){
//        DecimalFormat decimalFormat = new DecimalFormat("0.000");
//        String format = decimalFormat.format(121.111);
//        System.out.println(format);
//    }
}
