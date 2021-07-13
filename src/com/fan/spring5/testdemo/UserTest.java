package com.fan.spring5.testdemo;

import com.fan.spring5.User;
import com.fan.spring5.bean.Emp;
import com.fan.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fans
 */
public class UserTest {

    @Test
    public void userTest() {
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }

    @Test
    public void userServiceTest() {
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        //2.获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }

    @Test
    public void empTest() {
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        //2.获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);
    }

    @Test
    public void empTest2() {
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        //2.获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);
    }
}
