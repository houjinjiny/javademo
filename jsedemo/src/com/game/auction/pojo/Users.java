package com.game.auction.pojo;

public class Users {
    private String uname;//用户名
    private String password;//密码
    private double capital=0;//初始资金
    private String identity="小白";//初始级别
    Commodity[] grabBag=new Commodity[100];//百宝囊
    public Commodity[] getGrabBag() {
        return grabBag;
    }
    public void setGrabBag(Commodity[] grabBag) {
        this.grabBag = grabBag;
    }
    public Users(){}
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public double getCapital() {
        return capital;
    }
    public void setCapital(double capital) {
        this.capital = capital;
    }

    public String getIdentity() {
        return identity;
    }
    public void setIdentity(String identity) {
        this.identity = identity;
    }
}
