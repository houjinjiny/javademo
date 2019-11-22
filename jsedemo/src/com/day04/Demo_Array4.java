package com.day04;

public class Demo_Array4 {
    public static void main(String[] args) {
        int[] arr={22,33,44,55,11};
        int value=44;
        int m=checkArray(arr,value);
        System.out.println(m);

    }
    public static int checkArray(int[] arr,int value){  //根据值找出索引
        for(int i=0;i<arr.length;i++){
            if(value==arr[i]){
                return i;
            }
        }
        return -1;
    }

}
