package com.atguigu.spring5.bean;

/**
 * @author zhf
 * @ClassName Booke
 * @Description TODO
 * @Date 2021/10/10 21:24
 **/
public class Booke {
    private String bookName;
    private String author;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void show(){
        System.out.println(bookName+":"+author);
    }
}
