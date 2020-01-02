package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");
//        ArrayList newList = setArrays(list);
        ArrayList list2=getArray(list);
//        System.out.println(newList);
        System.out.println(list2);
    }

    public static ArrayList setArrays(ArrayList list) {
        ArrayList newList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!newList.contains(it.next())) {
                newList.add(it.next());
            }
        }
        return newList;
    }

    public static ArrayList getArray(ArrayList list) {
        LinkedHashSet hs=new LinkedHashSet();
        hs.addAll(list);
        list.clear();
        list.addAll(hs);
        return list;
    }
}