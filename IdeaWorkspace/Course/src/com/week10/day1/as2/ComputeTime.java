package com.week10.day1.as2;

public class ComputeTime {
    public static void main(String[] args) throws MyException {
        Car007 car = new Car007();
        double speed = car.getSpeed(30, -12, 0);
        new MyException().SpeedException(speed);
        System.out.println("该交通工具的速度为：" + speed);
        System.out.println("运行1000km时间：" + 1000 / speed);
    }
}
