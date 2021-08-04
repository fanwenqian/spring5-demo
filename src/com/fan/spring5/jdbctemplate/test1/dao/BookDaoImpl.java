package com.fan.spring5.jdbctemplate.test1.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class BookDaoImpl implements BookDao{

    @Resource
    private JdbcTemplate jdbcTemplate;
}
