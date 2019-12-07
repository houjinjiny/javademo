package com.day06;

import java.util.Scanner;

public class ArgsTest {
    public static void main(String[] args) {
        byte[] bys={97,98,99,100,101};
        String s1=new String(bys);
        System.out.println(s1);
        System.out.println(s1.length());
        String s2=new String(bys,1,3);
        System.out.println(s2);
        System.out.println(s2.length());
        char[] c={'a','b','c','d','e','爱','林','亲'};
        String s3=new String(c);
        System.out.println(s3);
        System.out.println(s3.length());
        String s4=new String(c,2,4);
        System.out.println(s4);
        System.out.println(s4.length());
        String t1=new String("hello");
        String t2=new String("hello");
        System.out.println(t1==t2);
        System.out.println(t1.equals(t2));
        String t3=new String("hello");
        String t4="hello";
        System.out.println(t3==t4);
        System.out.println(t3.equals(t4));
        String t5="hello";
        String t6="hello";
        System.out.println(t5==t6);
        System.out.println(t5.equals(t6));
    }
}
