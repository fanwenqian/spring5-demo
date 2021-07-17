package com.fan.spring5.beanlifecycle;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fans
 */
public class OrderTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle.xml");
        Order orders = context.getBean("orders", Order.class);
        System.out.println("第四步  获取bean的实例对象");
        System.out.println(orders);

        //手动让bean实例销毁
        context.close();

        //未添加后置处理器时：
        //第一步 执行无参构造创建实例对象
        //第一步 执行set方法设置属性值
        //第三步 执行bean创建的初始化方法
        //第四步  获取bean的实例对象
        //com.fan.spring5.beanlifecycle.Order@22eeefeb
        //第五步 执行bean的销毁方法

        //添加后置处理器时：
        //第一步 执行无参构造创建实例对象
        //第一步 执行set方法设置属性值
        //在初始化之前执行的方法
        //第三步 执行bean创建的初始化方法
        //在初始化之后执行的方法
        //第四步  获取bean的实例对象
        //com.fan.spring5.beanlifecycle.Order@2de8284b
        //第五步 执行bean的销毁方法
    }
}
