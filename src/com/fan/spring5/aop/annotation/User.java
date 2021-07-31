package com.fan.spring5.aop.annotation;

import org.springframework.stereotype.Component;

/**
 * 被增强的一个类
 */
@Component
public class User {

      public void add(){
//          int i = 1/0;
          System.out.println("add ....");
      }
}
