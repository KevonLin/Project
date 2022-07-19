package com.week10.day1.as2;

interface Common {


    /**
     * Calculate
     *
     * @return Rate
     */
    double getSpeed(double a, double b, double c);
}

class Plane implements Common{
    @Override
    public double getSpeed(double a, double b, double c) {
        return a+b+c;
    }
}

class Car007 implements Common{
    @Override
    public double getSpeed(double a, double b, double c) {
        return a*b/c;
    }
}