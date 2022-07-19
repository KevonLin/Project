package com.week10.day1.as2;

public class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    void SpeedException(double input) throws MyException {
        if (input < 0) {
            throw new MyException("速度小于0");
        }
    }
}