package com.day05.Demo3;

public class Father {
    String name;
    public Father(){
        System.out.println("父类空参构造");
    }
    public Father(String name){
        this.name=name;
        System.out.println("父类有参构造");
    }
    static {
        System.out.println("父类静态代码块");
    }
    {
        System.out.println("父类代码块");
    }
}
class Son extends Father {
    String name;
    public Son(){
        super();
        System.out.println("子类空参构造");
    }
    public Son(String name){
        super(name);
        System.out.println("子类有参构造");
    }
    static {
        System.out.println("子类静态代码块");
    }
    {
        System.out.println("子类代码块");
    }
}
