package com.h;

public class InterfaceDemo {
    public static void main(String[] args) {
        Father f=new Son();
        f.show();
//        f.show2();
        Mother m=new Son();
//        m.show();
        m.show2();
    }
}
