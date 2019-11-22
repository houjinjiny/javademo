package com.game.demo2;

import com.game.demo2.Datas;
import com.game.demo2.Users;

import java.util.Scanner;

public class TestDemo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Users[] uarr=new Users[10];
        Datas[] das=new Datas[36];
        Datas d1=new Datas("生肖","鸡","苏");
        das[0]=d1;
        Datas d2=new Datas("生肖","马","顾");
        das[1]=d2;
        Datas d3=new Datas("生肖","羊","夏");
        das[2]=d3;
        Datas d4=new Datas("生肖","兔","陌");
        das[3]=d4;
        Datas d5=new Datas("生肖","龙","夜");
        das[4]=d5;
        Datas d6=new Datas("生肖","鼠","上官");
        das[5]=d6;
        Datas d7=new Datas("生肖","猪","慕");
        das[6]=d7;
        Datas d8=new Datas("生肖","猴","楚");
        das[7]=d8;
        Datas d9=new Datas("生肖","蛇","陆");
        das[8]=d9;
        Datas d10=new Datas("生肖","狗","程");
        das[9]=d10;
        Datas d11=new Datas("生肖","牛","浴");
        das[10]=d11;
        Datas d12=new Datas("生肖","虎","玉");
        das[11]=d12;
        Datas d13=new Datas("月份","1","小");
        das[12]=d13;
        Datas d14=new Datas("月份","2","棂");
        das[13]=d14;
        Datas d15=new Datas("月份","3","玥");
        das[14]=d15;
        Datas d16=new Datas("月份","4","浅");
        das[15]=d16;
        Datas d17=new Datas("月份","5","瑾");
        das[16]=d17;
        Datas d18=new Datas("月份","6","颜");
        das[17]=d18;
        Datas d19=new Datas("月份","7","曦");
        das[18]=d19;
        Datas d20=new Datas("月份","8","夭");
        das[19]=d20;
        Datas d21=new Datas("月份","9","眠");
        das[20]=d21;
        Datas d22=new Datas("月份","10","晴");
        das[21]=d22;
        Datas d23=new Datas("月份","11","莹");
        das[22]=d23;
        Datas d24=new Datas("月份","12","瑶");
        das[23]=d24;
        Datas d25=new Datas("星座","白羊座","浅");
        das[24]=d25;
        Datas d26=new Datas("星座","金牛座","姬");
        das[25]=d26;
        Datas d27=new Datas("星座","巨蟹座","盈");
        das[26]=d27;
        Datas d28=new Datas("星座","天蝎座","晞");
        das[27]=d28;
        Datas d29=new Datas("星座","双子座","儿");
        das[28]=d29;
        Datas d30=new Datas("星座","射手座","璃");
        das[29]=d30;
        Datas d31=new Datas("星座","狮子座","衣");
        das[30]=d31;
        Datas d32=new Datas("星座","处女座","仪");
        das[31]=d32;
        Datas d33=new Datas("星座","天秤座","之");
        das[32]=d33;
        Datas d34=new Datas("星座","双鱼座","绯");
        das[33]=d34;
        Datas d35=new Datas("星座","水瓶座","色");
        das[34]=d35;
        Datas d36=new Datas("星座","魔羯座","蓉");
        das[35]=d36;
        //注册
        String uname=sc.next();
        int psd=sc.nextInt();
        String sx=sc.next();
        int month=sc.nextInt();
        String xz=sc.next();
        int m= register(uname,psd,sx,month,xz,uarr);
        if(m==-1){
            System.out.println("注册失败，请重新注册");
        }if(m==1){
            System.out.println("注册成功");
        }
        while(m==1){
            //登录
            System.out.println("请登录");
            String uname2=sc.next();
            int psd2=sc.nextInt();
            int n=login(uname2,psd2,uarr);
            if(n==-1){
                System.out.println("登录失败,请重新登录");
            }
            if(n==1){
                System.out.println("登录成功");
            }
            while(n==1){
                //测试
                System.out.println("请输入生肖、月份、星座");
                String sx2=sc.next();
                String month2=sc.next();
                String xz2=sc.next();
                String newName=starGame(sx2,month2,xz2,das);
                System.out.println(newName);
            }

        }


    }
    //用户注册
    public static int register(String uname,int psd,String sx,int month,String xz,Users[] ua){
        //创建一个对象
        Users u=new Users();
        //给对象赋值
        u.uname=uname;
        u.psd=psd;
        u.sx=sx;
        u.month=month;
        u.xz=xz;
        //保存对象（在数组中）
        for(int i=0;i<ua.length;i++){
            if(ua[i]==null){
                ua[i]=u;
                return 1;
            }
        }
        return -1;
    }
    //用户登录
    public  static int login(String uname,int psd,Users[] ua){
        for(int i=0;i<ua.length;i++){
            if(ua[i]!=null){
                if(ua[i].uname.equals(uname)&&ua[i].psd==psd){
                    return 1;
                }
            }
        }
        return -1;
    }
    //开始测试
    public static String starGame(String sx,String month,String xz,Datas[] das){
        String newName = "";
        for(int i=0;i<das.length;i++){
            if(das[i]!=null){
                if(das[i].categat.equals("生肖")){
                    if(das[i].yz.equals(sx)){
                        newName=newName+das[i].xz;
                    }
                }
                if(das[i].categat.equals("月份")){
                    if(das[i].yz.equals(month)){
                        newName=newName+das[i].xz;
                    }
                }
                if(das[i].categat.equals("星座")){
                    if(das[i].yz.equals(xz)){
                        newName=newName+das[i].xz;
                    }
                }
            }
        }
        return newName;
    }
}
