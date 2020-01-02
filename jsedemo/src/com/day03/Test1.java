package com.day03;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Father> list=new ArrayList();
        Father f1=new Father("张三",23);
        list.add(f1);
        Father f2=new Father("李四",23);
        list.add(f2);
        Father f3=new Father("王五",23);
        list.add(f3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
    }
}
