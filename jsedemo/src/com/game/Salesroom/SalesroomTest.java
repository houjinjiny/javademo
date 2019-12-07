package com.game.Salesroom;

import com.game.demo3.User;

import java.util.Scanner;

public class SalesroomTest {
    static Users[] users;//保证每次都是同一个用户数组
    static Users us;
    static {
        //初始化存放用户信息
        users=new Users[100];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //用户登陆注册
        int m=0;
        int nu=0;
        while (m!=9){
            SceneUtils.home(us);
            m=sc.nextInt();
            switch (m){
                case 1:
                    System.out.println("请输入用户名：");
                    String uname=sc.next();
                    System.out.println("请输入密码");
                    String password=sc.next();
                    us=login(uname,password,users);
                    break;
                case 2:
                    System.out.println("请输入用户名：");
                    String uname2=sc.next();
                    System.out.println("请输入密码");
                    String password2=sc.next();
                    nu=register(uname2,password2,users);
                    if (nu == 1) {
                        System.out.println("注册成功，请登录");
                    }else {
                        System.out.println("注册失败，请重新登录");
                    }
                    break;
                case 9:
                    return;
            }
        }
    }
    //用户注册
    public static int register(String uname,String password,Users[] users){
        //创建用户对象
        Users u=new Users();
        u.setUname(uname);
        u.setPassword(password);
        //判断用户是否存在
        int a=userExit(u,users);
        if(a==1){
            for (int i = 0; i <users.length ; i++) {
                if(users[i]==null){
                    users[i]=u;
                    return a;
                }
            }
        }
        return a;
    }
    //判断用户是否存在,不存在返回1，存在返回-1
    public static int userExit(Users u,Users[] users){
        for (int i = 0; i <users.length; i++) {
            if(users[i]!=null){
                if(!users[i].getUname().equals(u.getUname())){
                    return 1;
                }
            }else if (i == users.length - 1) {
                return 1;
            }
        }
        return -1;
    }
    //用户登录
    public static Users login(String uname,String password,Users[] users){
        //判断用户是否存在
        for (int i = 0; i <users.length; i++) {
            if(users[i]!=null){
                if(users[i].getUname().equals(uname)&&users[i].getPassword().equals(password)){
                    return users[i];
                }
            }
        }
        return null;
    }
}
