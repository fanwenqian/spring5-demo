package com.fan.spring5;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author fans
 */
@SpringJUnitConfig(locations = "classpath:bean2.xml")
public class JTest {

    @Autowired
    private com.fan.spring5.service.UserService userService;

    @Test
    public void test() {
        userService.add();
    }
}
