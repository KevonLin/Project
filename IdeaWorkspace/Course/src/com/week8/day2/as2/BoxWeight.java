package com.week8.day2.as2;

/**
 * @author Lin
 */
public class BoxWeight extends Box {
    private double density;

    public BoxWeight() {
        super();
        density = 0.0;
    }

    public BoxWeight(Box b, double density) {
        super(b.getWidth(), b.getHeight(), b.getDepth());
        this.density = density;
    }

    public double Weight() {
        return density * volume();
    }
}
