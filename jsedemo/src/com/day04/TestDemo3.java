package com.day04;

import java.util.Scanner;

public class TestDemo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        px(x,y);


    }
    public static void px(int a,int b){
        for(int i=0;i<=a;i++){
            for(int j=0;j<b;j++){
                System.out.print("*");
            }
            System.out.println();
            System.out.print(" ");

            }
    }
}
