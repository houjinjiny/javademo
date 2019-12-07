package com.h;

public class Manager extends Employee {
    private int money;

    public Manager() {}

    public Manager(String name, String id, int salary, int money) {
        super(name, id, salary);
        this.money = money;
    }
    public void work(){
        System.out.println("跟客户谈需求");
    }
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
