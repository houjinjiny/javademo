package com.day03;

import java.util.Scanner;

public class TestDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0&a<4){
            System.out.println("春季");
        }
        if(a>3&a<7){
            System.out.println("夏季");
        }
        if(a>6&a<10){
            System.out.println("秋季");
        }
        if(a>8&a<=12){
            System.out.println("冬季");
        }
    }
}
