package com.game.mountains.pojo;

import java.util.Random;

public class TestProblem extends Test{
    Random r=new Random();
    @Override
    public String startTest() {
        int a=r.nextInt(6);
        if(a==1){
            return "抽象类有成员方法吗？";
        }
        return null;
    }
}
