package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_demo2 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add("hello");
        c.add("word");
        c.add("java");
        Object[] obj=c.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
//            System.out.println(obj[i]+"..."+obj[i].length());
            String s= (String) obj[i];
            System.out.println(s+"..."+s.length());
        }
    }
}
