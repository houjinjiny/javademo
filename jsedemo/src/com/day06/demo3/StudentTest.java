package com.day06.demo3;

import com.day05.Demo3.Student;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StudentTest {
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1.hashCode());
        Student s2=new Student();
        System.out.println(s2.hashCode());
        Student s3=new Student();
        System.out.println(s3.hashCode());
        System.out.println("----------");
        Student s=new Student();
        Class c= s1.getClass();
        String str=c.getName();
        System.out.println(str);
        String str2=s.getClass().getName();
        System.out.println(str2);
    }
}
