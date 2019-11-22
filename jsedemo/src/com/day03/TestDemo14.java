package com.day03;

public class TestDemo14 {
    public static void main(String[] args) {
        int score=53;
        int count=0;
        System.out.println("加分前的成绩："+score);
        for (;score<60;score++){
            count+=1;
        }
        System.out.println("最后成绩："+score);
        System.out.println("加分次数："+count);
    }
}
