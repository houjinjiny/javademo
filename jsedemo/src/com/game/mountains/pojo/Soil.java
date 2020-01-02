package com.game.mountains.pojo;

import java.util.Random;
import java.util.Scanner;

public class Soil extends Test {
    Random r=new Random();
    Scanner sc=new Scanner(System.in);
    private String category="土";

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String startTest() {
        int a=r.nextInt(3)+1;
        System.out.println("欢迎来到土元素试炼之地！");
        if(a==1){
            System.out.println("int类型对应的包装类为：1. integer  2.int");
            int b=sc.nextInt();
            if(b==1){
                return "回答正确";
            }else {
                return "回答错误";
            }
        }
        if(a==2){
            System.out.println("char类型对应的包装类为:1. character  2.char");
            int b=sc.nextInt();
            if(b==1){
                return "回答正确";
            }else {
                return "回答错误";
            }
        }
        if(a==3){
            System.out.println("byte类型对应的包装类为:1. Byte  2.Byter");
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
