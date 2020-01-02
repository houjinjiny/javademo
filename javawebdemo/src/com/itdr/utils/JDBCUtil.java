package com.itdr.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
//    static String driverClass;
//    static String url;
//    static String user;
//    static String password;
//
//    static {
//        Properties p = new Properties();
//        InputStream in = JDBCUtil.class.getClassLoader().getResourceAsStream("db.properties");
//        try {
//            p.load(in);
//            driverClass = p.getProperty("driverClass");
//            url = p.getProperty("url");
//            user = p.getProperty("user");
//            password = p.getProperty("password");
//            Class.forName(driverClass);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    //创建连接
//    public static Connection getCon() throws SQLException {
//        Connection con=DriverManager.getConnection(url,user,password);
//        return con;
//    }
    public static Connection getCon() throws SQLException {
        ComboPooledDataSource cd=new ComboPooledDataSource();
        Connection con=cd.getConnection();
        return con;
    }
}
