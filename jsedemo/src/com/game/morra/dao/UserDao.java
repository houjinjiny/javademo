package com.game.morra.dao;
import com.game.morra.pojo.Users;
public class UserDao {
    //用户数据数组
    private static Users[] users;
    static {
        users = new Users[10];
    }
    //根据用户名查找一个用户
    public Users selectByUname(String uname){
        //遍历用户数组，查看非空空间内的对象和传进来的用户名是否同名
        for (int i = 0; i < users.length; i++) {
            if(users[i] != null){
                if(users[i].getUname().equals(uname)){
                    return users[i];
                }
            }
        }
        return null;
    }
    //存储用户信息
    public int addUsers(Users u){
        for(int i=0;i<users.length;i++){
            if(users[i]==null){
                users[i]=u;
                return 1;
            }
        }
        return 0;
    }
}
