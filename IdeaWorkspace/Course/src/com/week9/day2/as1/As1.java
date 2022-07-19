package com.week9.day2.as1;

class Employee {
    private String name;
    private String id;
    private double pay;

    public Employee(String name, String id, double pay) {
        super();
        this.name = name;
        this.id = id;
        this.pay = pay;
    }
}

class Programmer extends Employee {
    public Programmer(String name, String id, double pay) {
        super(name, id, pay);
    }

    public void work() {
        System.out.println("Coding...");
    }
}

class Manager extends Employee {
    private int bonus;

    public Manager(String name, String id, double pay, int bonus) {
        super(name, id, pay);
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("Managing...");
    }
}

/**
 * @author Lin
 */
public class As1 {
    public static void main(String[] args) {
        Employee work = new Programmer("Kevonlin", "01", 80000);
        if (work instanceof Programmer) {
            ((Programmer) work).work();
        }
        Employee manage = new Manager("Harry", "02", 120000, 12);
        if (manage instanceof Manager) {
            ((Manager) manage).work();
        }
    }
}
