package com.game.garbagesorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static Random r=new Random();
    public static List<Rubblish> rubblishes=new ArrayList<>();
    public static List<KitchenGarbage> kitchenGarbages=new ArrayList<>();
    public static List<RecoverableGarbage> recoverableGarbages=new ArrayList<>();
    public static List<OtherWaste> otherWastes=new ArrayList<>();
    public static List<HazardousWaste> hazardousWastes=new ArrayList<>();
    public static HazardousWaste ha=new HazardousWaste();
    public static HwContainer hw=new HwContainer();
    public static KgContainer kg=new KgContainer();
    public static RgContainer rg=new RgContainer();
    public static OwContainer ow=new OwContainer();
    public  static Users u=new Users();
    static {
        HazardousWaste h1=new HazardousWaste("电池","有害垃圾",5);
        HazardousWaste h2=new HazardousWaste("废灯管","有害垃圾",4);
        HazardousWaste h3=new HazardousWaste("过期药品","有害垃圾",3);
        hazardousWastes.add(h1);
        hazardousWastes.add(h2);
        hazardousWastes.add(h3);
        for (int i=0;i<hazardousWastes.size();i++){
            HazardousWaste h=hazardousWastes.get(i);
            if(r.nextInt(100)>=70){
                rubblishes.add(h);
            }

        }
        KitchenGarbage k1=new KitchenGarbage("剩饭","厨余垃圾",3);
        KitchenGarbage k2=new KitchenGarbage("菜叶","厨余垃圾",3);
        KitchenGarbage k3=new KitchenGarbage("果皮","厨余垃圾",3);
        kitchenGarbages.add(k1);
        kitchenGarbages.add(k2);
        kitchenGarbages.add(k3);
        for (int i=0;i<kitchenGarbages.size();i++){
            KitchenGarbage k=kitchenGarbages.get(i);
            if(r.nextInt(100)>=70){
                rubblishes.add(k);
            }
        }
        RecoverableGarbage r1=new RecoverableGarbage("塑料","可回收垃圾",1);
        RecoverableGarbage r2=new RecoverableGarbage("金属","可回收垃圾",1);
        RecoverableGarbage r3=new RecoverableGarbage("玻璃","可回收垃圾",1);
        recoverableGarbages.add(r1);
        recoverableGarbages.add(r2);
        recoverableGarbages.add(r3);
        for (int i=0;i<recoverableGarbages.size();i++){
            RecoverableGarbage re=recoverableGarbages.get(i);
            if(r.nextInt(100)>=70){
                rubblishes.add(re);
            }
        }
        OtherWaste o1=new OtherWaste("砖瓦陶瓷","其他垃圾",2);
        OtherWaste o2=new OtherWaste("渣土","其他垃圾",2);
        OtherWaste o3=new OtherWaste("瓷器碎片","其他垃圾",2);
        otherWastes.add(o1);
        otherWastes.add(o2);
        otherWastes.add(o3);
        for (int i=0;i<otherWastes.size();i++){
            OtherWaste o=otherWastes.get(i);
            if(r.nextInt(100)>=70){
                rubblishes.add(o);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("山烟涵树色，江水映霞晖”，保护环境人人有责，垃圾分类从你做起，一起来动手来创造美好家园吧！");
            System.out.println("1：开始游戏  2:查看积分 3:退出");
            int a=sc.nextInt();
            switch (a){
                case 1:
                    int d=0;
                    int c=rubblishes.size();
                    while (d<c){
                        System.out.println("获取垃圾：");
                        for (int i = 0; i < rubblishes.size(); i++) {
                            System.out.print(rubblishes.get(i).name+"  ");
                        }
                        System.out.println();
                        System.out.println("请选择你想放的垃圾：");
                        String s=sc.next();
                        System.out.println("请选择合适的垃圾桶：");
                        System.out.println("1:有害垃圾  2：厨余垃圾  3：可回收垃圾  4：其他垃圾");
                        int b=sc.nextInt();
                        switch (b){
                            case 1:
                                for (int i = 0; i < rubblishes.size(); i++) {
                                    if(s.equals(rubblishes.get(i).name)){
                                        String s2=rubblishes.get(i).category;
                                        if(s2.equals(hw.ccategory)){
                                            u.setIntegral(u.getIntegral()+1);
                                        }else {
                                            u.setIntegral(u.getIntegral()-1);
                                        }
                                        rubblishes.remove(rubblishes.get(i));

                                    }

                                }
                                d++;
                                break;
                            case 2:
                                for (int i = 0; i < rubblishes.size(); i++) {
                                    if(s.equals(rubblishes.get(i).name)){
                                        String s2=rubblishes.get(i).category;
                                        if(s2.equals(kg.ccategory)){
                                            u.setIntegral(u.getIntegral()+1);
                                        }else {
                                            u.setIntegral(u.getIntegral()-1);
                                        }
                                        rubblishes.remove(rubblishes.get(i));
                                    }
                                }
                                d++;
                                break;
                            case 3:
                                for (int i = 0; i < rubblishes.size(); i++) {
                                    if(s.equals(rubblishes.get(i).name)){
                                        String s2=rubblishes.get(i).category;
                                        if(s2.equals(rg.ccategory)){
                                            u.setIntegral(u.getIntegral()+1);
                                        }else {
                                            u.setIntegral(u.getIntegral()-1);
                                        }
                                        rubblishes.remove(rubblishes.get(i));
                                    }
                                }
                                d++;
                                break;
                            case 4:
                                for (int i = 0; i < rubblishes.size(); i++) {
                                    if(s.equals(rubblishes.get(i).name)){
                                        String s2=rubblishes.get(i).category;
                                        if(s2.equals(ow.ccategory)){
                                            u.setIntegral(u.getIntegral()+1);
                                        }else {
                                            u.setIntegral(u.getIntegral()-1);
                                        }
                                        rubblishes.remove(rubblishes.get(i));
                                    }
                                }
                                d++;
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println(u.getIntegral());
                    break;
                case 3:
                    System.exit(0);
            }
            }
        }
    }