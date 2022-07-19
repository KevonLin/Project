package com.week8.day2.as2;

/**
 * @author Lin
 */
public class Test {
    public static void main(String[] args) {
        Box b = new Box(2, 2, 2);
        System.out.println(b.volume());
        BoxWeight bw = new BoxWeight(b, 4);
        System.out.println(bw.Weight());
    }
}
