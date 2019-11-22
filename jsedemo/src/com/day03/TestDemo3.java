package com.day03;

import java.util.Scanner;

public class TestDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0&&a<8){
            if (a == 1) {
                System.out.println("星期一");
            }
            if (a == 2) {
                System.out.println("星期二");
            }
            if (a == 3) {
                System.out.println("星期三");
            }
            if (a == 4) {
                System.out.println("星期四");
            }
            if (a == 5) {
                System.out.println("星期五");
            }
            if (a == 6) {
                System.out.println("星期六");
            }
            if(a == 7) {
                System.out.println("星期七");
            }
        }
        else{
            System.out.println("输入有误");
        }
    }
}
