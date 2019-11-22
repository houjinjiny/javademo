package com.h;

import java.util.Scanner;

public class jys {
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
        System.out.println("请输入商品序号：");
        int[] arr2=new int[6];
        arr2[0]=sc.nextInt();
        System.out.println("请输入是否继续：继续输入1 退出输入2");
        arr2[1]=sc.nextInt();
        arr2[2]=sc.nextInt();
        arr2[3]=sc.nextInt();
        arr2[4]=sc.nextInt();
        arr2[5]=sc.nextInt();

        int b=sc.nextInt();

        for(int j=0;j<arr2.length;j++){
            if(b==1){
                continue;
            }
            if(b==2){
                if(arr2[j]>=0&&arr2[j]<arr2.length){
                    System.out.println("请输入商品序号："+arr2[j]+"钢笔颜色："+arr[arr2[j]].color+"  "+"价格："+arr[arr2[j]].price);
                }else {
                    System.out.println("该商品不存在！");
                }
                break;
            }
        }
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