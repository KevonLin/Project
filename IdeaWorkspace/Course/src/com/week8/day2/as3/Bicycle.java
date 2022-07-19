package com.week8.day2.as3;

/**
 * @author Lin
 */
public class Bicycle extends Vehicle{
    private double high;

    public Bicycle(double high) {
        this.high = high;
    }

    public Bicycle(double speed, double weight, double high) {
        super(speed, weight);
        this.high = high;
    }

    @Override
    public String toString() {
        return "Bicycle is " + super.toString() + ", high=" + high;
    }
}
