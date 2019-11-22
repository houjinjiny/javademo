package com.day04;
/* 需求：定义一个员工类Employee
 * 自己分析出几个成员，然后给出成员变量
 * 姓名name,工号id,工资salary
 * 构造方法，
 * 空参和有参的
 * getXxx()setXxx()方法，
 * 以及一个显示所有成员信息的方法。并测试。
 * work
 */
public class Demo_Employee {
    public static void main(String[] args) {
        Employess e=new Employess();
        e.setName("ddd");
        e.setId("00000");
        e.setSalary(99999);
        e.work();
    }

}
class Employess{
    private String name;
    private String id;
    private double salary;
    public Employess(){}
    public Employess(String name,String id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public void work(){
        System.out.println(name+"..."+id+"..."+salary);
    }
}