package com.itdr.controller;

import com.itdr.pojo.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "IndexServlet",value = "/index")
public class IndexServlet extends HttpServlet {
    static QueryRunner qr=new QueryRunner(new ComboPooledDataSource());
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //登录
        //1.获取用户名和密码
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        //2.从数据库中验证用户名密码是否存在
        User u=SelectByUsername(username,password);
        if(u!=null){
            response.getWriter().write("ok");
        }else {
            response.getWriter().write("no");
        }
        //注册
        insertByUsernameAndPassword(username, password);

    }
    private User SelectByUsername(String username,String password){
        String sql="SELECT * FROM users WHERE username=? AND password=?";
        User u=null;
        try {
            u=qr.query(sql, new BeanHandler<User>(User.class),username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }
    private static void insertByUsernameAndPassword(String username, String password) {
        String sql="INSERT INTO users VALUES(null,?,?)";
        int i=0;
        try {
            i = qr.update(sql, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
