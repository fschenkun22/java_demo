package com.chen.Obj;

public class Test {
    public static void main(String[] args) {

        Student s1 = new Student("小明",90,80);
        s1.printTotalScore();
        s1.printAverageScore();

        Student s2 = new Student("小红",80,90);
        s2.printTotalScore();
        s2.printAverageScore();
    }

}
