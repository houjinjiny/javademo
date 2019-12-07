package com.game.auction.service;

import com.game.auction.dao.UserDao;
import com.game.auction.pojo.Commodity;
import com.game.auction.pojo.Users;
public class UserService {
    private static UserDao ud=new UserDao();
    //注册
    public String register(String uname,String psd){
        //非空判断
        //查看用户是否存在
        Users users=new Users();
        users=ud.selectByuname(uname);
        if(users!=null){
            return "用户已存在";
        }
        //如果用户不存在，把用户存入数组中
        Users u=new Users();
        u.setUname(uname);
        u.setPassword(psd);
        int i=ud.addUsers(u);
        if(i<=0){
            return "注册失败";
        }
        return "注册成功";
    }
    //登录
    public String login(String uname,String psd){
        Users users=new Users();
        users=ud.login(uname,psd);
        if(users!=null){
            return "登录成功";
        }else {
            return "登录失败,请重新登录";
        }

    }
    //充值
    public double reCharge(double recharge){
        double i=ud.reCharge(recharge);
        if(i!=-1){
            return i;
        }
        return -1;
    }
    //展示用户信息
    public void showUsers(){
        ud.showUsers();
    }
    //展示所有商品
    public void showAll(){
        ud.showAll();
    }
    //查看商品详情
    public String showDescribe(int index){
        String s=ud.showDescribe(index);
        return s;
    }
    //搜索商品
    public String search(String cname){
        String s2=ud.search(cname);
        return s2;
    }
    //加入购物车
    public int shoppingCar(int index2){
        int i=ud.shoppingCar(index2);
        return i;
    }
    //展示购物车
    public int  showCar(){
        int i=ud.showCar();
        return i;
    }
    //结算模块
//    public double payment(){
//        double i=ud.payment();
//        return i;
//    }
    public int spend(){
        int r=ud.spend();
        return r;
    }
    //展示百宝箱
    public void showGraBag(){
        ud.showGraBag();
    }
    //上架商品
    public void putaway(){
        ud.putaway();
    }
    //排行榜
    public void sort(){
        ud.sort();
    }
    public void showRankList(){
        ud.showRankList();
    }
}
