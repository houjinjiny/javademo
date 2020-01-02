package com.iter.jdbc;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil2 {
    static String driverClass;
    static String url;
    static String user;
    static String password;
    static {
        Properties p=new Properties();
        InputStream in=JDBCUtil2.class.getClassLoader().getResourceAsStream("db.properties");
        try {
            p.load(in);
            driverClass=p.getProperty("driverClass");
            url=p.getProperty("url");
            user=p.getProperty("username");
            password=p.getProperty("password");
            Class.forName(driverClass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private JDBCUtil2(){}
    //创建连接
    public static Connection getCon() throws SQLException {
        Connection con=DriverManager.getConnection(url,user,password);
        return con;
    }
    //查询关闭连接
    public static void close(Connection con, Statement st, ResultSet rs) throws SQLException {
        closeResultSet(rs);
        closeStatement(st);
        closeConnection(con);
    }
    //关闭连接
    public static void close(Connection con, Statement st) throws SQLException {
        closeStatement(st);
        closeConnection(con);
    }
    private static void closeConnection(Connection con){
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    private static void closeStatement(Statement st){
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    private static void closeResultSet(ResultSet rs){
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
