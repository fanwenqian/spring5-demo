package com.fan.spring5.transaction.test1.service;

import com.fan.spring5.transaction.test1.dao.UserDao;
import com.fan.spring5.transaction.test1.entity.Account;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author fans
 */
@Service
@Transactional(propagation= Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
public class UserService {

    @Resource
    private UserDao userDao;

    /**
     * A转账100给B
     */
    public void change() {
        //第一步，开启事务
        //try {
        //第二步，进行业务操作
        //A少100
        Account a = userDao.select("1");
        a.setMoney(a.getMoney() - 100);
        userDao.update(a);

        //模拟异常
        int i = 10 / 0;

        //B多100
        Account b = userDao.select("2");
        b.setMoney(b.getMoney() + 100);
        userDao.update(b);
        //第三步，没有发生异常，提交事务
        //} catch (Exception e) {
        //第四步，出现异常，事务回滚
        //e.getStackTrace();
        //}
    }
}
