package com.day04;

import java.util.Scanner;

public class Demo_Array3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        char m=getDay(value);
        System.out.println("星期"+m);
    }
    public static char getDay(int value){
        char[] week={' ','一','二','三','四','五','六','日'};
        return week[value];
    }
}
