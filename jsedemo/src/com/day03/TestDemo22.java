package com.day03;

public class TestDemo22 {
    public static void main(String[] args) {
        int sum=0;
        int num=2;
        do{
            num=num+2;
            sum+=num;
        }while (num<=50);
        System.out.println("50以内的偶数和为："+sum);
    }
}
