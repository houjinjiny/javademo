package com.game.mountains.pojo;

import java.util.Random;

public class Talent implements Kind{
    Random r=new Random();
    private String category;
    public Talent(){}
    public Talent(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String kindlly() {
        int k = r.nextInt(6);
        if (k == 0){
            this.category="金";
            return "你的天赋为:金";
        }else if (k == 1){
            this.category="木";
            return "你的天赋为:木";
        }else if (k == 2){
            this.category="水";
            return "你的天赋为:水";
        }else if (k == 3){
            this.category="火";
            return "你的天赋为:火";
        }else if (k == 4){
            this.category="土";
            return "你的天赋为:土";
        }else if (k == 5){
            this.category="空";
            return "你的天赋为:空\n\"你的元素亲和为:金，木，水，火，土\"";
        }
        return "获取失败";
    }
}
