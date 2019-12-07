package com.day06.Demo2;

class Teacher {
    public int num=10;
    public static  int num2=20;
    public void show(){
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(num2);
    }
    public static void method(){
//        System.out.println(num);
        System.out.println(num2);
//        fun();
        fun2();
    }
    public void fun(){}
    public static void fun2(){}
}
