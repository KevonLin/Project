package com.lin.javase.day11.test001;

//毛磊
public class Cat extends Animal {

	public void move() {
		System.out.println("猫在走猫步!");
	}

	//不是从父类中继承的方法
	//是子类对象特有的行为
	public void catchMouse() {
		System.out.println("猫抓老鼠");
	}
}
