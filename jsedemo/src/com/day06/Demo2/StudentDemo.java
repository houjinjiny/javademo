package com.day06.Demo2;

public class StudentDemo {
    public static void main(String[] args) {
        Student s=new Student();
        s.show();
        s.name="小白";
        s.age=27;
        s.setAge(27);
        s.show();
        s.age=-27;
        s.setAge(-27);
        s.show();
    }
}
