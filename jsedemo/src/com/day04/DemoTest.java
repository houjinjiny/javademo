package com.day04;

import java.util.Scanner;

public class DemoTest {
    public static void main(String[] args) {
        String s="JavaSE";
        byte[] bys=s.getBytes();
        for (int x = 0; x < bys.length; x++) {
            System.out.println(bys[x]);
        }
        char[] chs=s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
        String ss=String.valueOf(chs);
        System.out.println(ss);
        int i=100;
        String sss=String.valueOf(i);
        System.out.println(sss);
        System.out.println(s.toLowerCase());
        System.out.println(s);
        System.out.println(s.toUpperCase());
        String s1="hel   lo";
        String s2="world";
        String s3=s1+s2;
        String s4=s1.concat(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s3==s4);
        System.out.println(s1.trim());//首尾的空格
        }
    }
