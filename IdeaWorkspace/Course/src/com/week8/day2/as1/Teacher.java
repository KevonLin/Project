package com.week8.day2.as1;

/**
 * @author Lin
 */
public class Teacher extends Person {
    private String captical;

    public Teacher(String name, String captical) {
        super(name, "河南");
        this.captical = captical;
    }

    @Override
    public String info() {
        return super.info() + "captical=" + captical;
    }
}
