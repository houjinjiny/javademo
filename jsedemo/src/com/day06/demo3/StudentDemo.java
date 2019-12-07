package com.day06.demo3;
import com.day05.Demo3.Student;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StudentDemo {
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s.hashCode());
        System.out.println(s.getClass().getName());
        System.out.println("----------------");
        System.out.println(s.toString());
        System.out.println("----------------");
        System.out.println(s.getClass().getName()+'@'+Integer.toHexString(s.hashCode()));
        System.out.println(s.toString());
        System.out.println(s);
    }
}
