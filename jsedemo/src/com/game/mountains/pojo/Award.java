package com.game.mountains.pojo;

import java.util.Scanner;

public class Award {
    Scanner sc=new Scanner(System.in);
    private double experience;

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }
    public double getAward(){
        System.out.println("请输入宝箱密码");
        String s=sc.next();
        if(s.equals("我爱java")){
            return 100;
        }
        return 0;
    }
}
