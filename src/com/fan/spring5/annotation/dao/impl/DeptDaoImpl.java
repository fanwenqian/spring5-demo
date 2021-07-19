package com.fan.spring5.annotation.dao.impl;

import com.fan.spring5.annotation.dao.IDeptDao;
import org.springframework.stereotype.Repository;

/**
 * @author fans
 */
@Repository(value = "deptDaoImpl1")
public class DeptDaoImpl implements IDeptDao {

    @Override
    public void add(){
        System.out.println("deptDao add ...");
    }
}
