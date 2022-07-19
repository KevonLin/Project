package com.week8.day2.as2;

/**
 * @author Lin
 */
public class Box {
    private double width;
    private double height;
    private double depth;

    public Box() {
        width = 0.0;
        height = 0.0;
        depth = 0.0;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double volume() {
        return width * height * depth;
    }
}
