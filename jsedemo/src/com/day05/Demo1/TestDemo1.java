package com.day05.Demo1;

import java.util.Scanner;

public class TestDemo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        pen p1=new pen();
        p1.color="红色";
        p1.price=111;
        pen p2=new pen();
        p2.color="黑色";
        p2.price=222;
        pen p3=new pen();
        p3.color="蓝色";
        p3.price=333;
        pen[] arr={p1,p2,p3};
        System.out.println("欢迎光临！");
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null){
                System.out.println("商品序号："+i+"钢笔颜色："+arr[i].color+"  "+"价格："+arr[i].price);
            }
        }
        do{
            System.out.println("请输入商品序号：");
            int a=sc.nextInt();

            if(a>=0&&a<arr.length){
                System.out.println("请输入商品序号："+a+"钢笔颜色："+arr[a].color+"  "+"价格："+arr[a].price);
            }else {

                System.out.println("该商品不存在！");
            }
            System.out.println("请输入是否继续：继续输入1 退出输入2");
        }while (sc.nextInt()==1);
        }
    }
class pen{
    String color;
    double price;
    public pen(){}
    public pen(String color,double price){
        this.color=color;
        this.price=price;
    }
    public void write(){
        System.out.println("写字");
    }
}