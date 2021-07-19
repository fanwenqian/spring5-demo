package com.fan.spring5.annotation.service;

import com.fan.spring5.annotation.dao.IDeptDao;
import com.fan.spring5.annotation.dao.impl.DeptDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author fans
 */
//此注解里的value属性可以不写
// 默认值是类名称的小驼峰写法
@Service(value="deptService")  //<bean id="deptService" class="...">
public class DeptService {

    //定义dao类型属性
    //不需要添加set方法
    //添加注入属性注解
//    @Autowired   //根据类型进行注入
//    @Qualifier(value = "deptDaoImpl1")  //根据名称进行注入
//    private DeptDao deptDao;


    @Value(value = "abc")
    private String name;

    //默认按照类型注入，加上name属性则按照名称注入
    @Resource(name = "deptDaoImpl1")
    private IDeptDao deptDao;

    public void add(){
        System.out.println("service add  ....");
        System.out.println(name);
        deptDao.add();
    }
}
