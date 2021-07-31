package com.fan.spring5.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 增强类
 */
@Component
@Aspect
@Order(1)
public class UserProxy {

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
        System.out.println("before .....");
    }

    /**
     * 最终通知(被增强的方法出现异常仍然执行)
     */
    @After("pointDemo()")
    public void after() {
        System.out.println("after .....");
    }

    /**
     * 后置通知（返回通知）(被增强的方法出现异常，则不执行)
     */
    @AfterReturning("pointDemo()")
    public void afterReturning() {
        System.out.println("afterReturning .....");
    }

    /**
     * 环绕通知
     */
    @Around("pointDemo()")
    public void Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Around 之前执行.....");
        //被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("Around 之后执行.....");
    }

    /**
     * 异常通知
     */
    @AfterThrowing("pointDemo()")
    public void AfterThrowing() {
        System.out.println("AfterThrowing .....");
    }
}
