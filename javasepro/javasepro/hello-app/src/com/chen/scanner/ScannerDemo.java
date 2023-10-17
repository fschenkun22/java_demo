package com.chen.scanner;

import java.util.Random;
import java.util.Scanner;

public class ScannerDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        System.out.println("输入的整数是：" + num);
        paper(args);
        random(args);
    }

    public static void paper(String[] args) {
        double peakHeight = 8848.43;
        double paperHeight = 0.1;
        int count = 0;
        while (paperHeight <= peakHeight) {
            paperHeight *= 2;
            count++;
        }
        System.out.println("需要折叠" + count + "次");
    }
    public static void random(String[] args) {
        int num = (int) (Math.random() * 100) + 1;
        System.out.println("随机数是：" + num);
        Random r = new Random();
        r.setSeed(10);
        System.out.println(r.nextInt(100));
    }
}
