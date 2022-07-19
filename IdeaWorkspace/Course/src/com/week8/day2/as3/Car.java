package com.week8.day2.as3;

/**
 * @author Lin
 */
public class Car extends Vehicle{
    private int seatnum;

    public Car(int seatnum) {
        this.seatnum = seatnum;
    }

    public Car(double speed, double weight, int seatnum) {
        super(speed, weight);
        this.seatnum = seatnum;
    }

    @Override
    public String toString() {
        return "Car is " + super.toString() + ", seatnum=" + seatnum;
    }
}
