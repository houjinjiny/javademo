package com.itdr.services;

import com.itdr.pojo.Users;

import java.util.List;

public interface UsersService {
    int register(String username,String password);

    List<Users> getAll();
}
