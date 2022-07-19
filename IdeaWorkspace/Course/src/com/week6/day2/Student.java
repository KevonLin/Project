package com.week6.day2;

import java.util.Scanner;

/**
 * @author Lin
 */
public class Student {
    private String name;
    private int sex;
    private boolean monitor;
    private double math;
    private double chinese;
    private double english;

    public Student() {
    }

    public Student(String name, int sex, boolean monitor, int math, int chinese, int english) {
        this.name = name;
        this.sex = sex;
        this.monitor = monitor;
        this.math = math;
        this.chinese = chinese;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public boolean isMonitor() {
        return monitor;
    }

    public void setMonitor(boolean monitor) {
        this.monitor = monitor;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public static void Sum(Student stu) {
        double result = stu.getChinese() + stu.getMath() + stu.getEnglish();
        System.out.println("Sum = " + " " + result);
    }

    public static void Avg(Student stu) {
        double result = (stu.getChinese() + stu.getMath() + stu.getEnglish()) / 3;
        System.out.println("Avg = " + " " + result);
    }

    public static void main(String[] args) {
        Student stu = new Student();
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("请输入三门成绩:");
            System.out.println("语文:");
            stu.setChinese(s.nextDouble());
            System.out.println("数学:");
            stu.setMath(s.nextDouble());
            System.out.println("英语:");
            stu.setEnglish(s.nextDouble());
        } catch (Exception e) {
        }
        Sum(stu);
        Avg(stu);
    }
}
