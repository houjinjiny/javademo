package com.day04;

public class Demo_Array2 {
    public static void main(String[] args) {
        int[] arr={22,33,44,55,11};
        getMax(arr);
        }
    public static void getMax(int[] arr) {             //获取最值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                }
        }
        System.out.println(max);
    }

}
