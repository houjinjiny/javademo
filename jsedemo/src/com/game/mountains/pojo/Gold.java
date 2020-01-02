package com.game.mountains.pojo;

import java.util.Random;
import java.util.Scanner;

public class Gold extends Test {
    Random r=new Random();
    Scanner sc=new Scanner(System.in);
    private String category="金";

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String startTest() {
        int a=r.nextInt(3)+1;
        System.out.println("欢迎来到金元素试炼之地！");
        if(a==1){
            System.out.println("面向对象的三大特征包括封装吗？1. 包括  2.不包括");
            int b=sc.nextInt();
            if(b==1){
                return "回答正确";
            }else {
                return "回答错误";
            }
        }
        if(a==2){
            System.out.println("面向对象的三大特征包括继承吗？1. 包括  2.不包括");
            int b=sc.nextInt();
            if(b==1){
                return "回答正确";
            }else {
                return "回答错误";
            }
        }
        if(a==3){
            System.out.println("面向对象的三大特征包括多态吗？1. 包括  2.不包括");
            int b=sc.nextInt();
            if(b==1){
                return "回答正确";
            }else {
                return "回答错误";
            }
        }
        return null;
    }
}
