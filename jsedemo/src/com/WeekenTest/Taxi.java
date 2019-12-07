package com.WeekenTest;
public class Taxi extends Car{
    private String company;
    public Taxi(String company) {
        super("蓝色", "张小泉");
        this.company = company;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public final void ride(){
        System.out.println(userName+"的出租车是属于"+company+"公司的");
    }

    @Override
    public void use() {
        System.out.println("出租车是提高市民生活质量的重要条件之一");
    }

    @Override
    public String toString() {
        return "Taxi的信息是:" +userName +"拥有一辆"+color+"的出租车";
    }
}

