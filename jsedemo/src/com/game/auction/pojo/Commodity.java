package com.game.auction.pojo;

public class Commodity {
    private int ordinal;//序号
    private String cname;//名称
    private double price;//价格
    private int num;//数量
    private String describe;//描述
    public Commodity(){}
    public Commodity(int ordinal, String cname, double price, int num, String describe) {
        this.ordinal = ordinal;
        this.cname = cname;
        this.price = price;
        this.num = num;
        this.describe = describe;
    }
    public int getOrdinal() {
        return ordinal;
    }
    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getDescribe() {
        return describe;
    }
    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
