package com.game.garbagesorting;

public class Users {
    String name;
    int integral=0;
    public Users(){}
    public Users(String name, int integral) {
        this.name = name;
        this.integral = integral;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }
}
