package com.day03;

import java.util.Scanner;

public class TestDemo6 {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("这个数是偶数");
        }else{
            System.out.println("这个数是奇数");
        }
    }
}
