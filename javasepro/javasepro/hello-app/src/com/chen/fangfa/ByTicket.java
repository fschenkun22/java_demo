package com.chen.fangfa;

public class ByTicket {
    public static void main(String[] args) {
        calculate(100, 1, "student");
        calculate(100, 1, "normal");
        calculate(100, 4, "student");
        calculate(100, 4, "normal");
        System.out.println(generateVerifyCode(6));
    }
    public static void calculate(double price, int month, String type) {
        double total = 0;
        if (month == 1) {
            total = price * 0.8;
        } else if (month == 2) {
            total = price * 0.7;
        } else if (month == 3) {
            total = price * 0.6;
        } else {
            total = price * 0.5;
        }
        if (type.equals("student")) {
            total = total * 0.8;
        }
        System.out.println("Total: " + total);
    }

    //生成验证码
    public static String generateVerifyCode(int length) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int n = (int) (Math.random() * 100);
            int ch = n % 3;
            switch (ch) {
                case 0:
                    s.append((char) ('0' + (n % 10)));
                    break;
                case 1:
                    s.append((char) ('a' + (n % 26)));
                    break;
                case 2:
                    s.append((char) ('A' + (n % 26)));
                    break;
            }
        }
        return s.toString();
    }

}

