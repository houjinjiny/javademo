package com.day05.Demo3;

public class Z extends X {
    Y y=new Y();
    Z(){
        System.out.println("z");
    }

    public static void main(String[] args) {
        new Z();
    }
}
