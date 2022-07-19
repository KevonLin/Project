package com.week7.day2;

/**
 * @author Lin
 */
class Circle {
    public static double pi = Math.PI;
    private double radius;
    private double area;
    private double circle;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void disp(Circle c) {
        System.out.println(
                "Circle{" +
                        "radius=" + radius +
                        ", area=" + getArea(c) +
                        ", circle=" + getCircle(c) +
                        '}');
    }

    public double getArea(Circle c) {
        return pi * Math.pow(c.getRadius(), 2);
    }

    public double getCircle(Circle c) {
        return 2 * pi * c.getRadius();
    }

//    public double getArea(Circle c) {
//        return c.area;
//    }
//
//    public void setArea(Circle c) {
//        this.area = pi * Math.pow(c.getRadius(), 2);
//    }
//
//    public double getCircle(Circle c) {
//        return c.circle;
//    }
//
//    public void setCircle(Circle c) {
//        this.circle = 2 * pi * c.getRadius();
//    }
}

/**
 * @author Lin
 */
public class CircleTest {
    public static void main(String[] args) {
        System.out.println("Pi = " + Circle.pi);
        Circle c1 = new Circle();
        c1.setRadius(3.0);
        c1.disp(c1);
        Circle c2 = new Circle(5.2);
        c2.disp(c2);
    }
}