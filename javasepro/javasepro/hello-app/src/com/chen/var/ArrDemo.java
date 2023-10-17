package com.chen.var;

public class ArrDemo {
    public static void main(String[] args) {
        int[] arr1 = {11,22,33};
        int[] arr2 = arr1;
        System.out.println(arr1);
        System.out.println(arr2);
        //改的是地址里面的值,所以arr1和arr2的值都会改变
        arr2[0] = 44;
        System.out.println(arr1[0]);

    }
}
