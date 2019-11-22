package com.day06.Demo1;

import com.game.demo3.User;

public class Users {
    private String userName;
    private String passWord;
    public Users(){}
    public String getUserName(){
        return this.userName;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public String getPassWord(){
        return this.passWord;
    }
    public void setPassWord(String passWord){
        this.passWord=passWord;
    }
    public String show(){
        String s="用户名："+this.userName+" "+"密码:"+this.passWord;
        return s;
    }

}
