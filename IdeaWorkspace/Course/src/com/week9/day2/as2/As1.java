package com.week9.day2.as2;

import java.awt.*;

/**
 * @author Lin
 */

abstract class Shapes {
    private double width, height, area, perimeter;

    public Shapes() {
    }

    public Shapes(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Shapes{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }

    /**
     * @return Area
     */
    abstract double getArea();

    /**
     * @return Perimeter
     */
    abstract double getPerimeter();
}

class Circle extends Shapes {
    final double pi = 3.14;
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public Circle(double width, double height) {
        super(width, height);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    double getArea() {
        return (pi * Math.pow(getR(), 2));
    }

    @Override
    double getPerimeter() {
        return (2 * pi * getR());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "pi=" + pi +
                ", r=" + r +
                ", area=" + getArea() +
                ", perimerter=" + getPerimeter() +
                '}';
    }
}

class Rectangle extends Shapes {

    public Rectangle(double width, double height) {
        super(width, height);
    }

    @Override
    double getArea() {
        return (getWidth() * getHeight());
    }

    @Override
    double getPerimeter() {
        return (2 * (getWidth() + getHeight()));
    }


}

/**
 * @author Lin
 */
public class As1 {
    public static void main(String[] args) {
        Shapes s1 = new Circle(2.0);
        System.out.println(s1.toString());
        Shapes s2 = new Rectangle(5,6);
        System.out.println(s2.toString());
    }
}
