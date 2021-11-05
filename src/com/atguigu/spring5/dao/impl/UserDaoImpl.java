package com.atguigu.spring5.dao.impl;

import com.atguigu.spring5.dao.UserDao;

/**
 * @author zhf
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Date 2021/10/10 21:49
 **/
public class UserDaoImpl implements UserDao {
    @Override
    public void update() {
        System.out.println("impl的方法");
    }
}
