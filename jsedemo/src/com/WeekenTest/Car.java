package com.WeekenTest;

import java.util.Objects;

public class Car {
    protected String color;
    protected String userName;
    public Car(String color, String userName) {
        this.color = color;
        this.userName = userName;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void use(){
        System.out.println("我是机动车！");
    }
    @Override
    public boolean equals(Object o) {
        Car car = (Car) o;
        return this.color.equals(car.color) &&
                this.userName.equals(car.userName);
    }

}
