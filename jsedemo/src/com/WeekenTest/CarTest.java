package com.WeekenTest;

public class CarTest {
    public static void main(String[] args) {
        Car c1=new Car("蓝色","张三");
        Car c2=new Car("蓝色","张三");
        c1.use();
        System.out.println("Car1与Car2的引用比较："+c1.equals(c2));
        System.out.println("======================================");
        Taxi t=new Taxi("长生");
        t.ride();
        t.use();
        System.out.println(t.toString());
        System.out.println("======================================");
        HomeCar hc=new HomeCar(7);
        hc.display();
        hc.display(5);
    }
}
