package com.itdr.services;

import com.itdr.dao.UsersDao;
import com.itdr.pojo.Users;

import java.util.ArrayList;
import java.util.List;

public class UsersServiceImpl implements UsersService {
    UsersDao ud=new UsersDao();

    @Override
    public int register(String username, String password) {
        if(username==null||"".equals(username)){
            return 0;
        }
        if(password==null||"".equals(password)){
            return 0;
        }
        //用户名是否存在
        Users users=ud.selectByUsername(username);
        if(users!=null){
            return 0;
        }
        //不存在保存
        return 0;
    }

    @Override
    public List<Users> getAll() {
        List<Users> li=ud.selectAll();
        return li;
    }
}
