package com.fan.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 完全注解开发
 * 将当前类作为spring配置类
 * @author fans
 */
@Configuration
@ComponentScan(basePackages = "com.fan.spring5")
public class SpringConfig {
}
