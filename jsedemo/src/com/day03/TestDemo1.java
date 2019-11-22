package com.day03;

import java.util.Scanner;

public class TestDemo1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println((a>b)?a:b);
        int c=sc.nextInt();
        System.out.print((a>b)?((a>c)?a:c):((b>c)?b:c));
    }
}
