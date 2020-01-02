package com.itdr.controller;

import com.itdr.pojo.Users;
import com.itdr.services.UsersService;
import com.itdr.services.UsersServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class UsersController {
    UsersService us=new UsersServiceImpl();
    public int register(String username, String password) {
        int register = us.register(username, password);
        return register;
    }
    //查询所有用户
    public List<Users> getAll(){
        List<Users> li= us.getAll();
        return li;
    }
}
