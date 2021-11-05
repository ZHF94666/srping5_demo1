package com.atguigu.spring5.bean;

import java.util.List;

/**
 * @author zhf
 * @ClassName Book
 * @Description TODO
 * @Date 2021/10/11 10:59
 **/
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }
    public void test(){
        System.out.println(list);
        System.out.println("------");
    }
}
