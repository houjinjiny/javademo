package com.day03;

public class TestDemo13 {
    public static void main(String[] args) {
        int num=9999;
        int count=0;
        for(int i=0;i<10;i++){
            if(num/10>0){
                count+=1;
                num=num/10;
            }
        }
        System.out.println("它是个"+(count+1)+"位的数");
    }
}
