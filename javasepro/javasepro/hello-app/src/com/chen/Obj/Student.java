package com.chen.Obj;

public class Student {
    
    public Student(String name, double chinese, double math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    public void printTotalScore() {
        System.out.println(name + "的总分是" + (chinese + math));
    }

    public void printAverageScore() {
        System.out.println(name + "的平均分是" + (chinese + math) / 2);
    }



}
