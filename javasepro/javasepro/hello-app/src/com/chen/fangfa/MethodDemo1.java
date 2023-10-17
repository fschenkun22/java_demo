package com.chen.fangfa;

public class MethodDemo1 {
    public static void main(String[] args) {
        // 调用方法
        printHelloWorld();
        int sum = sum(100);
        System.out.println(sum);
        boolean isOdd = isOdd(9);
        System.out.println(isOdd);
    }

    // 定义方法
    public static void printHelloWorld() {
        System.out.println("Hello World!");
    }


    // 求1到n的和
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i ++) {
            sum += i;
        }
        return sum;
    }
    //判断是基数还是偶数
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

}
