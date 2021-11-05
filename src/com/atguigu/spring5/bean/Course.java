package com.atguigu.spring5.bean;

/**
 * @author zhf
 * @ClassName Course
 * @Description TODO
 * @Date 2021/10/11 10:48
 **/
public class Course {
    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
