package com.day03;

public class TestDemo19 {
    public static void main(String[] args) {
        int age=25;
        if(age>60){
            System.out.println("老年");
        } else if(age>40&&age<=60){
            System.out.println("中年");
        } else if(age>=18&&age<=40){
            System.out.println("少年");
        }else if(age<18&&age>=0){
            System.out.println("童年");
        }
        else {
            System.out.printf("输入错误");
        }
    }
}
