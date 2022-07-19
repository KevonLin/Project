package com.week7.day1;
/**
 * @author Lin
 */
public class Test1 {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Test1() {
    }

    public Test1(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
        Test1 t = new Test1(18);
        System.out.println("Age:" + t.getAge());
    }
}