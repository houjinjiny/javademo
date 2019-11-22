package com.day06.Demo1;

import java.util.Scanner;

public class UsersTest {
    public static void main(String[] args) {
        Users chaoji=new Users();
        chaoji.setUserName("hjj");
        chaoji.setPassWord("123");
        //用户登录过程
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String a=sc.next();
        System.out.println("请输入密码：");
        String b=sc.next();
        //登录方法
        Users u=login(a,b,chaoji);
        if(u!=null){
            System.out.println(u.show());
        }else {
            System.out.println("登录失败");
        }

    }
    //用户登录
    public static Users login(String uname,String passWord,Users chaoji){
        //判断用户是否存在
        if(uname.equals(chaoji.getUserName())&& passWord.equals(chaoji.getPassWord())){
            return chaoji;
        }else {
            return null;
        }
    }
}
