package com.game.runeland.pojo;

public class Epigraph {
    protected String name;//符文名字
    protected String color;//符文颜色
    protected int level;//符文等级
    protected String categore;//符文类型
    //无参构造
    public Epigraph(){}
    //有参构造
    public Epigraph(String name, String color, int level, String categore) {
        this.name = name;
        this.color = color;
        this.level = level;
        this.categore = categore;
    }
    //set get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCategore() {
        return categore;
    }

    public void setCategore(String categore) {
        this.categore = categore;
    }
}
