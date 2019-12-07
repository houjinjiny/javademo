package com.day04;

public class Demo_Array1 {
    public static void main(String[] args) {
        for(int i=100;i<1000;i++){
            int a=i%10;
            int b=i/10%10;
            int c=i/100%10;
            int d=a*a*a+b*b*b+c*c*c;
            if(i==d){
                System.out.println(d);
            }
        }
    }
}
