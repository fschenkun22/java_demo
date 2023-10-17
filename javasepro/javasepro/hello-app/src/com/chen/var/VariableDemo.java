package com.chen.var;

import java.util.Arrays;
import java.util.Scanner;

public class VariableDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;

        System.out.println(c);
        int[] arr = {11, 22, 33};
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

        for (int j : arr) {
            System.out.println(j);
        }
        //华丽的分割线
        System.out.println("华丽的分割线");

        int[] money = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int j : money) {
            sum += j;
        }
        System.out.println(sum);

        Scanner sc = new Scanner(System.in);
            double[] scores = new double[6];
            for (int i = 0; i < scores.length; i++) {
                double score = sc.nextDouble();
                scores[i] = score;
            }
        System.out.println(Arrays.toString(scores));
            double max = scores[0];
            for (int i = 1; i < scores.length; i++) {
                if (scores[i] > max) {
                    max = scores[i];
                }
            }
        System.out.println(max);

    }
}
