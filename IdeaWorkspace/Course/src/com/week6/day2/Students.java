package com.week6.day2;

/**
 * @author Lin
 */
public class Students {
    String name;
    int age;

    public Students() {
        System.out.println("Students()构造方法被调用");
    }

    public Students(String name) {
        this.name = name;
        System.out.println("Students(String name)构造方法被调用");
    }

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Students(String name, int age)构造方法被调用");
    }

    public static void main(String[] args) {
        Students stu1 = new Students();
        Students stu2 = new Students("张三");
        Students stu3 = new Students("李四", 21);
    }
}
