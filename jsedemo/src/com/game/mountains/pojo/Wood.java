package com.game.mountains.pojo;

import java.util.Random;
import java.util.Scanner;

public class Wood extends Test {
    Random r=new Random();
    Scanner sc=new Scanner(System.in);
    private String category="木";

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String startTest() {
        int a=r.nextInt(3)+1;
        System.out.println("欢迎来到木元素试炼之地！");
        if(a==1){
            System.out.println("select属于那种分类？1. DQL  2.DCL");
            int b=sc.nextInt();
            if(b==1){
                return "回答正确";
            }else {
                return "回答错误";
            }
        }
        if(a==2){
            System.out.println("from属于那种分类？1. DQL  2.DML");
            int b=sc.nextInt();
            if(b==1){
                return "回答正确";
            }else {
                return "回答错误";
            }
        }
        if(a==3){
            System.out.println("delete属于那种分类？1. DML  2.DQL");
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
