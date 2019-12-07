package com.day06.Demo2;

public class Student {
    String name;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        if(a<0||age>120){
            System.out.println("有问题");
        }else{
            age=a;
        }
    }
    public void show(){
        System.out.println(name);
        System.out.println(age);
    }
}
