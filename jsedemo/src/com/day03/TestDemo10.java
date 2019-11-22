package com.day03;
public class TestDemo10 {
    public static void main(String[] args) {
        int age1=24;
        int age2=18;
        int age3=36;
        int age4=27;
        int sum=age1+age2+age3+age4;
        int avg=sum/4;
        int miusn=age1-age2;
        int newAge=--age1;
        System.out.println("年龄总和："+sum);
        System.out.println("平均年龄："+avg);
        System.out.println("年龄差值："+miusn);
        System.out.println("自减后的年龄："+newAge);
    }
}
