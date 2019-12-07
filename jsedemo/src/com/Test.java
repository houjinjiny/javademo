package com;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line=sc.nextLine();
        String s=myReserse(line);
        System.out.println(s);
    }
    public static String myReserse(String s){
        String result="";
        char[] chs=s.toCharArray();
        for(int i=chs.length-1;i>=0;i--){
            result+=chs[i];
        }
        return result;
    }
}
