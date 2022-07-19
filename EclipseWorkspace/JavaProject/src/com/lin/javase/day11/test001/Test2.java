package com.lin.javase.day11.test001;

public class Test2 {

	public static void main(String[] args) {
		
		//夫类型引用指向子类型对象
		Animal a1 = new Cat();
		Animal a2 = new Bird();
		
		//向下转型【只有当访问子类对象中特有的方法】
		if(a1 instanceof Cat) {
			Cat c1 = (Cat)a1;
			c1.catchMouse();
		}
		if(a2 instanceof Bird) {
			Bird b1 = (Bird)a2;
			b1.fly();
		}
	}
}
