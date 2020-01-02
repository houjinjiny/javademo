package com.game.mountains;
import com.game.mountains.controller.UserController;
import com.game.mountains.pojo.Users;

import java.util.Scanner;
public class MountainsTest {
    private static UserController uc = new UserController();
    private static Users u=new Users();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            int m = 0;
            bj:
            while (m != 9) {
                System.out.println("求道之路，天赋，能力，运气缺一不可，每一条道都精彩万分，也满是艰难险阻");
                System.out.println("1.登录  2.注册  9.退出");
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
            //开始试炼
            if(uc.isPass()){
                System.out.println("您已获得通行证，请好好欣赏风景吧！");
                return;
            }else {
                System.out.println("求道之路，天赋，能力，运气缺一不可，每一条道都精彩万分，也满是艰难险阻");
                System.out.println("恭喜你获得天赋");
                String s1=uc.getTalent();
                System.out.println(s1);
                System.out.println("试炼之路开启");
                String s2=uc.startOff();
                System.out.println(s2);
                if(s2.equals("恭喜完成试炼！")){
                    System.out.println("========欢迎进入终极试炼========");
                    uc.getAward();
                    String s3=uc.show();
                    System.out.println(s3);
                }else {
                    System.out.println("试炼失败，下次再来");
                }
            }
        }

    }
}
