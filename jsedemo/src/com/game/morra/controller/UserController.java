package com.game.morra.controller;
import com.game.morra.service.UserService;
public class UserController {
    private UserService us=new UserService();
    public String register(String uname,String psd){
        String s = us.register(uname, psd);
        return s;
    }
}
