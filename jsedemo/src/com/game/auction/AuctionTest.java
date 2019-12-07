package com.game.auction;

import com.game.auction.controller.UserController;
import com.game.auction.pojo.Commodity;

import java.util.Scanner;

public class AuctionTest {
    private static UserController uc = new UserController();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int m = 0;
            bj:
            while (m != 9) {
                System.out.println("欢迎来到星空拍卖场 请根据序号选择功能");
                System.out.println("1.登录  2.注册  9.退出星空拍卖场");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        //用户登录
                        System.out.println("请输入用户名：");
                        String uname2 = sc.next();
                        System.out.println("请输入密码：");
                        String psd2 = sc.next();
                        String login = uc.login(uname2, psd2);
                        System.out.println(login);
                        String str1 = "登录失败,请重新登录";
                        String str2 = "登录成功";
                        if (login.equals(str1)) {
                            break;
                        }
                        if (login.equals(str2)) {
                            uc.showUsers();
                            break bj;
                        }
                    case 2:
                        //用户注册
                        System.out.println("请输入用户名");
                        String uname = sc.next();
                        System.out.println("请输入密码");
                        String psd = sc.next();
                        String register = uc.register(uname, psd);
                        System.out.println(register);
                        break;
                    case 9:
                        return;
                }
            }
            //充值中心 商品模块
            int n = 0;
            bj2:
            while (n != 9) {
                System.out.println("欢迎来到星空拍卖场 请根据序号选择功能");
                System.out.println("1.充值  2.查询所有商品 3.查看商品详情 4.搜索商品  " +
                        "5.上架商品  6.商品排行榜  7.加购物车  8.查看购物车 9.退出星空拍卖场 11.再次登录");
                n = sc.nextInt();
                switch (n) {
                    //充值
                    case 1:
                        System.out.println("请输入充值金额（金额不能大于100)");
                        int money = sc.nextInt();
                        if (money > 100 || money < 0) {
                            System.out.println("输入金额错误，请重新输入");
                            break;
                        }
                        double recharge = uc.reCharge(money);
                        System.out.println("当前金额为：" + recharge);
                        break;
                    case 2:
                        uc.showAll();
                        break;
                    case 3:
                        System.out.println("请输入需要查看的商品序号：");
                        int index = sc.nextInt();
                        String s = uc.showDescribe(index);
                        if (s == null) {
                            System.out.println("该商品不存在，请重新输入");
                        } else {
                            System.out.println(s);
                        }
                        break;
                    case 4:
                        System.out.println("请输入需要搜索的商品名称：");
                        String cname = sc.next();
                        String s2 = uc.search(cname);
                        if (s2 == null) {
                            System.out.println("该商品不存在，请重新输入");
                        } else {
                            System.out.println(s2);
                        }
                        break;
                    case 5:
                        System.out.println("百宝箱为：");
                        uc.showGraBag();
                        System.out.println("是否上架商品 1.上架 2.不上架");
                        int s3 = sc.nextInt();
                        if (s3 == 1) {
                            uc.putaway();
                            System.out.println("现在的商品为：");
                            uc.showAll();
                        }
                        break;
                    case 6:
                        uc.sort();
                        uc.showRankList();
                        break;
                    case 7:
                        int o = 0;
                        while (o != 2) {
                            System.out.println("请输入需要加购的商品序号：");
                            int index2 = sc.nextInt();
                            int i = uc.shoppingCar(index2);
                            if (i == 1) {
                                System.out.println("加入购物车成功");
                                System.out.println(" 是否继续加购商品：1：是  2：否");
                                o = sc.nextInt();
                            }
                        }
                        break;
                    case 8:
                        System.out.println("您的购物车有以下商品：");
                        while (true) {
                            int i = uc.showCar();
//                            if (i == 0) {
//                                break;
//                            }
                            System.out.println("是否结算： 1.结算 2.不结算");
                            int p = sc.nextInt();
                            if (p == 1) {
                                int r = uc.spend();
                                if (r == 1) {
                                    System.out.println("是否展示百宝箱 1.展示 2.不展示");
                                    int q = sc.nextInt();
                                    if (q == 1) {
                                        uc.showGraBag();
                                        break ;
                                    }
                                }
                                if (r == 0) {
                                    break;
                                }
                            }
                        }

                        break;
                    case 9:
                        return;
                    case 11:
                        break bj2;
                }
            }
        }
    }
}
