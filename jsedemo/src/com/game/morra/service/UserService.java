package com.game.morra.service;
import com.game.morra.dao.UserDao;
import com.game.morra.pojo.Users;
public class UserService {
    private UserDao ud=new UserDao();
    //用户注册
    public String register(String uname,String password){
        //非空判断
        //判断用户是否存在
        Users users=ud.selectByUname(uname);
        if(users!=null){
            return "此用户已存在";
        }
        Users u=new Users();
        u.setUname(uname);
        u.setPassword(password);
        int i=ud.addUsers(u);
        if(i<=0){
            return "注册失败";
        }else{
            return "注册成功";
        }
    }
    //用户登录
    public String login(String uname,String password){
        //非空判断
        //判断用户是否为空
        Users users=ud.selectByUname(uname);
        if(users!=null){

        }
        return null;
    }
}
