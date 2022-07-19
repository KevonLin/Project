package com.week8.day2.as1;

/**
 * @author Lin
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person("张三", "河北");
        Person t = new Teacher("李四", "电子系");
        System.out.println(p.info());
        System.out.println(t.info());
    }
}
