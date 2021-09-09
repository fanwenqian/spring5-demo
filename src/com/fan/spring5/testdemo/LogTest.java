package com.fan.spring5.testdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author fans
 * @date 2021/9/9
 */
public class LogTest {

    private static final Logger logger = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {
        String me = "范文谦";
        logger.info("{}学java", me);
    }
}
