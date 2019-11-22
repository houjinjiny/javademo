package com.day04;

public class Demo_Array1 {
    public static void main(String[] args) {
        int[] arr={22,33,44,55,11};
        getArray(arr);
        change(arr);
        getArray(arr);
    }
    public static void getArray(int[] arr){         //遍历数组
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void change(int[] arr){              //反转
        for (int j=0;j<arr.length/2;j++){
            int t=arr[j];
            arr[j]=arr[arr.length-1-j];
            arr[arr.length-1-j]=t;
        }
        System.out.println();
    }
}
