package com.fan.spring5.aop.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 等价于
 *    <!--1.开启注解扫描-->
 *    <context:component-scan base-package="com.fan.spring5.aop.annotation"/>
 *
 *    <!--开启aspectj生成代理对象-->
 *    <aop:aspectj-autoproxy/>
 */
@Configuration
@ComponentScan(basePackages = {"com.fan"})
@EnableAspectJAutoProxy
public class ConfigAop {
}
