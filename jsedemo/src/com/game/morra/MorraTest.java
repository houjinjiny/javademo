package com.game.morra;

import com.game.morra.pojo.Users;
import com.game.morra.controller.UserController;
import java.util.Scanner;

public class MorraTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String uname=sc.next();
        System.out.println("请输入密码：");
        String password=sc.next();
        UserController uc=new UserController();
        //用户注册
        String register=uc.register(uname,password);
        System.out.println(register);
    }
}
