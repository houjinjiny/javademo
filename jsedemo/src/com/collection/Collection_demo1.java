package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_demo1 {
    public static void main(String[] args) {
        Collection c1=new ArrayList();
        c1.add("abc1");
        c1.add("abc2");
        c1.add("abc3");
        c1.add("abc4");
        Collection c2=new ArrayList();
        c2.add("abc5");
        c2.add("abc6");
        c2.add("abc7");
        System.out.println("addAll"+((ArrayList) c1).addAll(c2));
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("removeAll"+((ArrayList) c1).removeAll(c2));
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Contains"+((ArrayList) c1).contains(c2));
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(((ArrayList) c1).retainAll(c2));
        System.out.println(c1);
        System.out.println(c2);
    }
}
