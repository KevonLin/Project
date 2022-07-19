package com.lin.javase.day11.test002;

/**
 * 主人类
 * 
 *
 */

//这种方式没有使用Java语言中的多态机制，存在的缺点，一旦加一个
/*
public class Master {

	*//**
	 * 喂养宠物的方法
	 *//*
	public void feed(Cat c) {
		c.eat();
	}

	public void feed(Dog d) {
		d.eat();
	}
}
//Master和Cat、Dog的
*/

//降低程序的耦合度【解耦合】，提高程序的扩展里【如那件开发的一个重要目标]
public class Master {

	/**
	 * Master主人类面向的是一个抽象的Pet，不在面向具体的宠物
	 * 体长：面向抽象编程，不要面向具体变成
	 * 面向抽象编程的好处是：耦合度低，扩展力强。
	 */
	public void feed(Pet pet) {//Pet pet是一个父类型的引用
		pet.eat();
	}
}