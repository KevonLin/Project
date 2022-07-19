package com.week8.day2.as3;

/**
 * @author Lin
 */
public class Vehicle {
    private double speed;
    private double weight;

    public Vehicle() {
    }

    public Vehicle(double speed, double weight) {
        this.speed = speed;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle:" +
                "speed=" + speed +
                ", weight=" + weight;
    }
}
