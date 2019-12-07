package com.game.auction.controller;

import com.game.auction.pojo.Commodity;
import com.game.auction.service.UserService;

public class UserController {
    private static UserService us=new UserService();
    //注册
    public String register(String uname,String psd){
        String s=us.register(uname,psd);
        return s;
    }
    //登录
    public String login(String uname,String psd){
        String s=us.login(uname,psd);
        return s;
    }
    //充值
    public double reCharge(double rechanrge){
        double money=us.reCharge(rechanrge);
        return money;
    }
    //展示用户信息
    public void showUsers(){
        us.showUsers();
    }
    //展示所有商品
    public void showAll(){
        us.showAll();
    }
    //查看商品详情
    public String showDescribe(int index){
        String s=us.showDescribe(index);
        return s;
    }
    //搜索商品
    public String search(String cname){
        String s2=us.search(cname);
        return s2;
    }
    //加入购物车
    public int shoppingCar(int index2){
        int i=us.shoppingCar(index2);
        return i;
    }
    //展示购物车
    public int showCar(){
        int i=us.showCar();
        return i;
    }
    public int spend(){
        int r=us.spend();
        return r;
    }
    //展示百宝箱
    public void showGraBag(){
        us.showGraBag();
    }
    //上架商品
    public void putaway(){
        us.putaway();
    }
    //排行榜
    public void sort(){
        us.sort();
    }
    public void showRankList(){
        us.showRankList();
    }
}
