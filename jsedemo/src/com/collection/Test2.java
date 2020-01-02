package com.collection;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test2 {
    /**
     * 输入一个字符串 去掉重复字符
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s=sc.next();
        char[] arr=s.toCharArray();
        LinkedHashSet<Character> ls=new LinkedHashSet();
        for (int i = 0; i < arr.length; i++) {
            ls.add(arr[i]);
        }
        for(Character ch: ls){
            System.out.println(ch);
        }
    }
}
