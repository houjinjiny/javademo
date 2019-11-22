package com.day04;

import java.util.Scanner;

public class TestDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数：");
        int x = sc.nextInt();
        System.out.println("输入第二个数：");
        int y=sc.nextInt();
        add(x,y);
        del(x,y);
        ch(x,y);
        chu(x,y);
        qm(x,y);
    }
    public static void add(int a,int b){
        int c=a+b;
        System.out.println("和为"+c);
    }
    public static void del(int a,int b){
        int c=a-b;
        System.out.println("差为"+c);
    }
    public static void ch(int a,int b){
        int c=a*b;
        System.out.println("积为"+c);
    }
    public static void chu(int a,int b){
        int c=a/b;
        System.out.println("除为"+c);
    }
    public static void qm(int a,int b){
        int c=a%b;
        System.out.println("取模为"+c);
    }
}
