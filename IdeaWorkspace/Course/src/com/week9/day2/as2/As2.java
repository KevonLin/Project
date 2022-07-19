package com.week9.day2.as2;

interface Common {


    /**
     * Calculate
     *
     * @return Rate
     */
    double getRate();
}

class Plane implements Common {
    int a = 0;
    int b = 0;
    int c = 0;

    public Plane(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getRate() {
        return a * b / c;
    }
}

class Car implements Common {
    int a = 0;
    int b = 0;
    int c = 0;

    public Car(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getRate() {
        return a + b + c;
    }
}

class Ship implements Common {
    int a = 0;
    int b = 0;
    int c = 0;

    public Ship(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getRate() {
        return (a + b + c) / 10;
    }
}

class ComputeTime {
    public void test() {
        Plane p = new Plane(10, 20, 30);
        System.out.println(p.getRate());
        Car c = new Car(10, 20, 30);
        System.out.println(c.getRate());
        Ship s = new Ship(10, 20, 30);
        System.out.println(s.getRate());
    }
}

/**
 * @author Lin
 */
public class As2 {
    public static void main(String[] args) {
        new ComputeTime().test();
    }
}
