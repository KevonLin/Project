package com.week8.day2.as1;

/**
 * @author Lin
 */
public class Person {
        private String name;
        private String location;

    public Person() {
    }

    public Person(String location) {
        this.location = location;
    }

    public Person(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String info() {
        return "Person:" +
                "name='" + name + '\'' +
                ", location='" + location + '\'';
    }
}
