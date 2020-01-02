package com.game.mountains.pojo;

import java.util.Random;
import java.util.Scanner;

public class Fire extends Test {
    Random r=new Random();
    Scanner sc=new Scanner(System.in);
    private String category="火";

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String startTest() {
        int a=r.nextInt(3)+1;
        System.out.println("欢迎来到火元素试炼之地！");
        if(a==1){
            System.out.println("抽象类有成员方法吗？1. 有 2.没有");
            int b=sc.nextInt();
            if(b==1){
                return "回答正确";
            }else {
                return "回答错误";
            }
        }
        if(a==2){
            System.out.println("抽象类有成员变量吗？1. 有 2.没有");
            int b=sc.nextInt();
            if(b==1){
                return "回答正确";
            }else {
                return "回答错误";
            }
        }
        if(a==3){
            System.out.println("抽象类有构造方法吗？1. 有 2.没有");
            int b=sc.nextInt();
            if(b==2){
                return "回答正确";
            }else {
                return "回答错误";
            }
        }
        return null;
    }
}
