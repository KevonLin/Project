package com.week8.day1;

class Animal {
    private String name = "无名氏";
    private double weight = 0.0;

    public Animal() {
    }

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void eat() {
        System.out.println(name + "在吃饭");
    }

    public void sleep() {
        System.out.println(name + "在睡觉");
    }

    public void breath() {
        System.out.println(name + "在呼吸");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

class Sheep extends Animal {

    public Sheep() {
    }

    public Sheep(String name, double weight) {
        super(name, weight);
    }

    public void sheepEat() {
        System.out.println("羊在吃草");
    }
}

class Wolf extends Animal {
    public Wolf() {
    }

    public Wolf(String name, double weight) {
        super(name, weight);
    }

    public void wolfEat() {
        System.out.println("狼在吃肉");
    }
}

class WolfJiao extends Wolf {
    public WolfJiao(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println("蕉太狼在吃香蕉");
    }
}

/**
 * @author Lin
 */
public class ExtendTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.sleep();
        a.breath();
        a.toString();

        Animal b = new Sheep("喜羊羊", 20.0);
        b.eat();
        b.sleep();
        b.breath();
        b.toString();

        Animal c = new Wolf("灰太狼", 30.0);
        c.eat();
        c.sleep();
        c.breath();
        c.toString();

        Animal j = new Wolf("蕉太狼", 50.0);
        if (j instanceof Wolf) {
            Wolf wj = (WolfJiao)j;
            wj.eat();
            System.out.println(wj.toString());
        }

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

    }
}
