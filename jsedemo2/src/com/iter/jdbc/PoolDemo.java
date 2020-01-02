//package com.iter.jdbc;
//
//import java.sql.Connection;
//import java.util.ArrayList;
//
//public class PoolDemo {
//    static ArrayList<Connection> li1=new ArrayList<>();
//    static {
//        for(int i=0;i<5;i++){
//            li1.add(JDBCUtil.getCon());
//        }
//    }
//    ArrayList<Connection> li2=new ArrayList<>();
//    public PoolDemo(){
//        for (int i = 0; i < 5; i++) {
//            li1.add(JDBCUtil.getCon());
//        }
//    }
//
//    public ArrayList<Connection> getLi2() {
//        return li2;
//    }
//
//    public void setLi2(ArrayList<Connection> li2) {
//        this.li2 = li2;
//    }
//
//    public Connection getCon(){
//       Connection remove=null;
//       if(li1.size()==0){
//           for(int i=0;i<5;i++){
//               li1.add(JDBCUtil.getCon());
//           }
//       }
//       for(int i=0;i<li1.size();i++){
//           remove=li1.remove(i);
//           break;;
//       }
//       return remove;
//    }
//    public Connection getCon2(){
//        PoolDemo p=new PoolDemo();
//        ArrayList<Connection> li2=p.getLi2();
//        Connection remove=null;
//        if(li2.size()==0){
//            for(int i=0;i<5;i++){
//                li2.add(JDBCUtil.getCon());
//            }
//        }
//        for(int i=0;i<li2.size();i++){
//            remove=li2.remove(i);
//            break;;
//        }
//        return remove;
//    }
//    public void addBack(Connection con){
//        li1.add(con);
//    }
//    public void addBack2(Connection con){
//        li2.add(con);
//    }
//}
