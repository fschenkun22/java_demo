package com.chen.literal;

public class LiteralDemo {
    public static void main(String[] args) {
        // 整数
        int a = 10;
        int b = 010;
        int c = 0x10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // 浮点数
        double d = 3.14;
        double e = 3.14e2;
        System.out.println(d);
        System.out.println(e);
        // 字符
        char f = 'a';
        char g = '\u0061';
        System.out.println(f);
        System.out.println(g);
        // 字符串
        String h = "Hello World!";
        System.out.println(h);
        // 布尔
        boolean i = true;
        boolean j = false;
        System.out.println(i);
        System.out.println(j);

        System.out.println('单');
        System.out.println("双双双");
    }
}
