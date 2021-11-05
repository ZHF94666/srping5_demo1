package com.atguigu.spring5.test;

import com.atguigu.spring5.bean.*;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhf
 * @ClassName TestSpring
 * @Description TODO
 * @Date 2021/10/10 17:43
 **/
public class TestSpring {
    @Test
    public void test(){
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //获取对象
        User user = context.getBean("user", User.class);
        user.add();
    }
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Booke book = context.getBean("book", Booke.class);
        book.show();
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Car car = context.getBean("car", Car.class);
        car.show();
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }
    @Test
    public void test5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Book book = context.getBean("book", Book.class);
        book.test();
    }
}
