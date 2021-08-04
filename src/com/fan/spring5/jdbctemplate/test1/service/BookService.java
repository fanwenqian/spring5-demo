package com.fan.spring5.jdbctemplate.test1.service;

import com.fan.spring5.jdbctemplate.test1.dao.BookDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookService {

    @Resource
    private BookDao bookDao;
}
