package com.day04;

public class Demo_Animal {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.setColor("red");
        String color=c.getColor();
        System.out.println(color);
        c.catchMouse();
        Animal a=new Cat();
        a.eat();
    }
}
class Animal{
    private  String color;
    private int leg;
    public Animal(){}
    public Animal(String color,int leg){
        this.color=color;
        this.leg=leg;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setLeg(int leg){
        this.leg=leg;
    }
    public int getLeg(){
        return leg;
    }
    public void eat(){
        System.out.println("吃饭");
    }

}
class Cat extends Animal{
    public Cat(){
        super();
    }
    public Cat(String color,int leg){
        super(color,leg);
    }

    public void eat() {
        System.out.println("吃鱼");
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
class Dog extends Animal{
    public Dog(){
        super();
    }
    public Dog(String color,int leg){
        super(color,leg);
    }
    public void lookHome(){
        System.out.println("看家");
    }
}
