package com.day06;

import javax.xml.bind.SchemaOutputResolver;

public class VaribleDemo {
    public static void main(String[] args) {
        Varible v=new Varible();
        System.out.println(v.num);
        v.show();
    }
}
class Varible{
    int nus=10;
    int num;
    public void show(){
        int num2=20;
        int num3=30;
        System.out.println(num2);
        System.out.println(num3);
        int num=100;
        System.out.println(num);
    }
}
