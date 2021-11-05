package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;

/**
 * @author zhf
 * @ClassName UserService
 * @Description TODO
 * @Date 2021/10/10 21:51
 **/
public class UserService {
    //创建userDAO模型，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service的add()方法");
        userDao.update();
    }
}
