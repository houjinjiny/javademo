package com.game.mountains.pojo;

public class Users {
    private String uname;//用户名
    private String password;//密码
    private String talent;//天赋
    private double experience=0;//经验值
    private boolean pass;
    public Users(){}
    public Users(String uname, String password, String talent) {
        this.uname = uname;
        this.password = password;
        this.talent = talent;
    }
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
    public String getTalent() {
        return talent;
    }
    public void setTalent(String talent) {
        this.talent = talent;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public boolean getPass() {
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }
}
