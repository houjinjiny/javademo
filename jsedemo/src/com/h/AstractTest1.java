package com.h;

public class AstractTest1 {
    public static void main(String[] args) {
        Employee emp=new Programmer();
        emp.setName("小白");
        emp.setId("czbk001");
        emp.setSalary(18000);
        System.out.println(emp.getName()+"...."+emp.getId()+"...."+emp.getSalary());
        emp.work();
        System.out.println("----------------");
        emp=new Programmer("小红","czbk001",18000);
        System.out.println(emp.getName()+"...."+emp.getId()+"...."+emp.getSalary());
        emp.work();
        System.out.println("----------------");
        Manager m=new Manager();
        m.setName("小蓝");
        m.setId("czbk002");
        m.setSalary(18000);
        m.setMoney(2000);
        System.out.println(m.getName()+"...."+m.getId()+"...."+m.getSalary()+"...."+m.getMoney());
        emp.work();
        System.out.println("----------------");
        m=new Manager("小蓝","czbk002",8000,2000);
        System.out.println(m.getName()+"...."+m.getId()+"...."+m.getSalary()+"...."+m.getMoney());
        emp.work();
        System.out.println("----------------");
    }
}
