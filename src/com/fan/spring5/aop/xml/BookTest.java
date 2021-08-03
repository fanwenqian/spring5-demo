package com.fan.spring5.aop.xml;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

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

    @Test
    public void test3(){
        List<String> list = Arrays.asList("0", "1", "2");
        String str = StringUtils.join(list);
        System.out.println(str.substring(1,str.length()-1));
    }
}
