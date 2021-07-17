package com.fan.spring5.beanlifecycle;

/**
 * @author fans
 */
public class Order {

    private String oname;

    public void setOname(String oname) {
        System.out.println("第一步 执行set方法设置属性值");
        this.oname = oname;
    }

    public Order() {
        System.out.println("第一步 执行无参构造创建实例对象");
    }

    /**创建bean的初始化方法**/
    public void initMethod(){
        System.out.println("第三步 执行bean创建的初始化方法");
    }

    /**创建bean的销毁方法**/
    public void destroyMethod(){
        System.out.println("第五步 执行bean的销毁方法");
    }
}
