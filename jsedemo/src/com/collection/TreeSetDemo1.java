package com.collection;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Person> ts=new TreeSet<>();
        ts.add(new Person("张三",23));
        ts.add(new Person("李四",33));
        ts.add(new Person("赵六",53));
        ts.add(new Person("王五",43));
        ts.add(new Person("张三",13));
        System.out.println(ts);
    }
}
