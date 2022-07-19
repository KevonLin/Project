package com.week8.day2.as3;

/**
 * @author Lin
 */
public class Test {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(120.0, 800.0);
        Vehicle b = new Bicycle(40.0, 50.0, 75.5);
        Vehicle c = new Car(150.0, 1200.0,5);
        System.out.println(v.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
    }
}