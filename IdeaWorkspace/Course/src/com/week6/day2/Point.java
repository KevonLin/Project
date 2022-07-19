package com.week6.day2;

import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * @author Lin
 */
public class Point {
    private int x;
    private int y;
    private int z;

    public Point() {
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public static void Distance(Point poi) {
        double x = poi.getX();
        double y = poi.getY();
        double z = poi.getZ();

        double result = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));

        System.out.println("(x,y,z)到坐标原点的距离是:" + result);
    }

    public static void main(String[] args) {
        Point poi = new Point();
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("获取坐标:");
            System.out.println("X轴:");
            poi.setX(s.nextInt());
            System.out.println("Y轴:");
            poi.setY(s.nextInt());
            System.out.println("Z轴:");
            poi.setZ(s.nextInt());
        } catch (Exception e) {
        }
        Distance(poi);
    }
}
