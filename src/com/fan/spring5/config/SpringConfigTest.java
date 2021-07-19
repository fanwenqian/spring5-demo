package com.fan.spring5.config;

import com.fan.spring5.annotation.service.DeptService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author fans
 */
public class SpringConfigTest {

    @Test
    public void test(){
        //加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        DeptService deptService = context.getBean("deptService", DeptService.class);
        deptService.add();
    }
}
