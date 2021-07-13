package com.fan.spring5.bean;

/**
 * @author fans
 */
public class Dept {
    /**部门名称**/
    private String dname;
    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
