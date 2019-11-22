package com.day03;

public class TestDemo15 {
    public static void main(String[] args) {
        int score=68;
        String str1="及格";
        String str2="不及格";
        String mark=(score>=60)?str1:str2;
        System.out.println("考试成绩如何："+mark);
    }
}
