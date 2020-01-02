package com.game.mountains.dao;

import com.game.mountains.pojo.*;

import java.util.Random;
import java.util.Scanner;

public class UserDao {
    Random r=new Random();
    Scanner sc=new Scanner(System.in);
    private static Users u;//用户对象
    private static Users[] users;//存放用户
    private static Talent t;//天赋
    private static Gold g;//金
    private static Wood w;//木
    private static Water wa;//水
    private static Fire f;//火
    private static Soil s;//土
    private static Empty e;//空
    private static Award award;//奖励
    static {
        users=new Users[10];
        u=new Users();
        t=new Talent();
        g=new Gold();
        w=new Wood();
        wa=new Water();
        f=new Fire();
        s=new Soil();
        e=new Empty();
        award=new Award();
    }
    //查看当前用户是否存在
    public Users selectByuname(String uname){
        for (int i = 0; i <users.length ; i++) {
            if(users[i]!=null){
                if(users[i].getUname().equals(uname)){
                    return users[i];
                }
            }
        }
        return null;
    }
    //存储用户
    public int addUsers(Users u){
        for (int i = 0; i <users.length ; i++) {
            if(users[i]==null){
                users[i]=u;
                return 1;
            }
        }
        return 0;
    }
    //登录
    public Users login(String uname,String psd) {
        for (int i = 0; i <users.length ; i++) {
            if(users[i]!=null){
                if(users[i].getUname().equals(uname)&&users[i].getPassword().equals(psd)){
                    return users[i];
                }
            }
        }
        return null;
    }
    //获得天赋
    public String getTalent(){
        String tf=t.kindlly();
        u.setTalent(tf);
        return tf;
    }
    //开启试炼之路
    public String startOff(){
        int a=r.nextInt(6);
        switch (a){
            case 1:
                if(t.getCategory().equals(g.getCategory())||t.getCategory().equals("空")){
                    System.out.println("运气极佳，找到了适合自己的路");
                    return "恭喜完成试炼！";
                }else{
                    String s1=g.startTest();
                    if(s1.equals("回答正确")){
                        return "恭喜完成试炼！";
                    }else {
                        return "未完成试炼......";
                    }
                }
            case 2:
                if(t.getCategory().equals(w.getCategory())||t.getCategory().equals("空")){
                    System.out.println("运气极佳，找到了适合自己的路");
                    return "恭喜完成试炼！";
                }else{
                    String s1=w.startTest();
                    if(s1.equals("回答正确")){
                        return "恭喜完成试炼！";
                    }else {
                        return "未完成试炼......";
                    }
                }
            case 3:
                if(t.getCategory().equals(wa.getCategory())||t.getCategory().equals("空")){
                    System.out.println("运气极佳，找到了适合自己的路");
                    return "恭喜完成试炼！";
                }else{
                    String s1=wa.startTest();
                    if(s1.equals("回答正确")){
                        return "恭喜完成试炼！";
                    }else {
                        return "未完成试炼......";
                    }
                }
            case 4:
                if(t.getCategory().equals(f.getCategory())||t.getCategory().equals("空")){
                    System.out.println("运气极佳，找到了适合自己的路");
                    return "恭喜完成试炼！";
                }else{
                    String s1=f.startTest();
                    if(s1.equals("回答正确")){
                        return "恭喜完成试炼！";
                    }else {
                        return "未完成试炼......";
                    }
                }
            case 5:
                if(t.getCategory().equals(s.getCategory())||t.getCategory().equals("空")){
                    System.out.println("运气极佳，找到了适合自己的路");
                    return "恭喜完成试炼！";
                }else{
                    String s1=s.startTest();
                    if(s1.equals("回答正确")){
                        return "恭喜完成试炼！";
                    }else {
                        return "未完成试炼......";
                    }
                }
            case 6:
                if(t.getCategory().equals(e.getCategory())||t.getCategory().equals("空")){
                    System.out.println("运气极佳，找到了适合自己的路");
                    return "恭喜完成试炼！";
                }else{
                    System.out.println("是否继续此路凶险万分，一旦失败，就会失去天赋 1.继续 2.放弃");
                    int c=sc.nextInt();
                    if(c==1){
                        String s1=e.startTest();
                        if(s1.equals("回答正确")){
                            return "恭喜完成试炼！";
                        }else {
                            t.setCategory("无");
                            return "未完成试炼......";
                        }
                    }else {
                       break;
                    }

                }
        }
        return null;
    }
    // 获得奖励
    public void getAward(){
        double c=award.getAward();
        u.setExperience(u.getExperience()+c);
    }
    //展示用户信息
    public String show(){
        for (int i = 0; i < users.length; i++) {
            String a=users[i].getUname();
            u.setPass(true);
            return "用户名:"+a+"   "+u.getTalent()+"   "+"经验值："+u.getExperience();
        }
        return null;
    }
    //判断是否有通关证
    public boolean isPass(){
        if(u.getPass()){
            return true;
        }else {
            return false;
        }
    }
}
