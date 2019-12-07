package com.WeekenTest;

public final class HomeCar extends Car {
    int num;
    public HomeCar(int num) {
        super("紫色", "孙二娘");
        this.num = num;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public void display(){
        System.out.println(userName+"拥有的"+color+"颜色的私家车有"+num+"座位");
    }
    public void display(int num){
        System.out.println("家用汽车大多有"+num+"个座位");
    }
}
