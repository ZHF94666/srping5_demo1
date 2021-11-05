package com.atguigu.spring5.bean;

/**
 * @author zhf
 * @ClassName Car
 * @Description TODO
 * @Date 2021/10/10 21:29
 **/
public class Car {
    private String carName;
    private int price;

    public Car(String carName, int price) {
        this.carName = carName;
        this.price = price;
    }
    public void show(){
        System.out.println(carName+":"+price);
    }
}
