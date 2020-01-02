package com.collection;

import java.util.HashSet;
import java.util.Random;

/**
 * 获取10个1到20的随机数
 */
public class Test1 {
    public static void main(String[] args) {
        Random r=new Random();
        HashSet<Integer> hs=new HashSet<>();
        while (hs.size()<10){
            hs.add(r.nextInt(20)+1);
        }
        for(Integer i: hs){
            System.out.println(i);
        }
    }
}
