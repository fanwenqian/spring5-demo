package com.fan.spring5.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 增强类
 */
@Component
@Aspect
@Order(2)
public class PersonProxy {

    /**
     * 相同切入点抽取
     **/
    @Pointcut("execution(* com.fan.spring5.aop.annotation.User.add(..))")
    public void pointDemo() {

    }

    /**
     * 前置通知
     */
    @Before("pointDemo()")
    public void before() {
        System.out.println("person before .....");
    }
}
