package com.game.mountains.service;

import com.game.mountains.dao.UserDao;
import com.game.mountains.pojo.Users;

public class UserService {
    private static UserDao ud=new UserDao();
    //注册
    public String register(String uname,String psd){
        //非空判断
        //查看用户是否存在
        Users users=new Users();
        users=ud.selectByuname(uname);
        if(users!=null){
            return "用户已存在";
        }
        //如果用户不存在，把用户存入数组中
        Users u=new Users();
        u.setUname(uname);
        u.setPassword(psd);
        int i=ud.addUsers(u);
        if(i<=0){
            return "注册失败";
        }
        return "注册成功";
    }
    //登录
    public String login(String uname,String psd){
        Users users=new Users();
        users=ud.login(uname,psd);
        if(users!=null){
            return "登录成功";
        }else {
            return "登录失败,请重新登录";
        }

    }
    //获得天赋
    public String getTalent(){
        String tf=ud.getTalent();
        return tf;
    }
    //开启试炼之路
    public String startOff(){
        String s1=ud.startOff();
        return s1;
    }
    // 获得奖励
    public void getAward(){
        ud.getAward();
    }
    //展示用户信息
    public String show(){
        String s2=ud.show();
        return s2;
    }
    //判断是否有通关证
    public boolean isPass(){
        boolean b=ud.isPass();
        return b;
    }
}
