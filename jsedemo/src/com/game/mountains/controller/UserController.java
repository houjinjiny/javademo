package com.game.mountains.controller;

import com.game.mountains.service.UserService;

public class UserController {
    private static UserService us=new UserService();
    //注册
    public String register(String uname,String psd){
        String s=us.register(uname,psd);
        return s;
    }
    //登录
    public String login(String uname,String psd){
        String s=us.login(uname,psd);
        return s;
    }
    //获得天赋
    public String getTalent(){
        String tf=us.getTalent();
        return tf;
    }
    //开启试炼之路
    public String startOff(){
        String s1=us.startOff();
        return s1;
    }
    // 获得奖励
    public void getAward(){
        us.getAward();
    }
    //展示用户信息
    public String show(){
        String s2=us.show();
        return s2;
    }
    //判断是否有通关证
    public boolean isPass(){
        boolean b=us.isPass();
        return b;
    }
}
