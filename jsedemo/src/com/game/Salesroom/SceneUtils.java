package com.game.Salesroom;

public class SceneUtils {
    public static void home(Users users){
        if(users!=null){
            System.out.println("当前用户为："+users.getUname());
            System.out.println("当前用户级别为："+users.getCapital());
            System.out.println("当前用户身份为："+users.getIdentity());
        }
        System.out.println("欢迎来到星空拍卖场 请根据序号选择功能");
        System.out.println("1.登录  2.注册  9.退出星空拍卖场");
    }
}
