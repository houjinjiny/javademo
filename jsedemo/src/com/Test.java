package com;

import java.util.Scanner;

//class Base {
//    public void methodOne() { System.out.print("A"); methodTwo(); }
//    public void methodTwo() { System.out.print("B"); } }
//    class Derived extends Base { public void methodOne()
//    { super.methodOne(); System.out.print("C"); }
//    public void methodTwo() { super.methodTwo(); System.out.print("D"); } }
public class Test{
    public static Test t1 = new Test();
    { System.out.println("blockA"); }
    static { System.out.println("blockB"); }
    public static void main(String[] args) { Test t2 = new Test();
        System.out.println(10%3*2);
    }
}


//    public static void main(String[] argv){
//        int i = 0;
//        for(out('A');out('B') && (i<2);out('C')){
//            i++;
//            out('D');
//        }
//    }
//    public static void main(String[] args) {
//        mystery(1234);
//    }
//    public static void mystery (int x) {
//        System.out.print(x % 10);
//        if ((x / 10) != 0) {
//            mystery(x / 10);
//        }
//        System.out.print(x % 10); }
//     public static void main(String[] args) {
//         System.out.println("return value of getValue(): " + getValue());
//     }
//     public static int getValue() {
//         try { return 0; }
//         finally { return 1; }
//     } }
//class Demo {
//    class Super {
//        int flag = 1;
//
//        Super() {
//            test();
//        }
//
//        void test() {
//            System.out.println("Super.test() flag=" + flag);
//        }
//    }
//
//    class Sub extends Super {
//        Sub(int i) {
//            flag = i;
//            System.out.println("Sub.Sub()flag=" + flag);
//        }
//
//        void test() {
//            System.out.println("Sub.test()flag=" + flag);
//        }
//    }
//}
