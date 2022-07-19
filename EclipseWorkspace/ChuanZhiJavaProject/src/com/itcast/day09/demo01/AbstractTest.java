package com.itcast.day09.demo01;

/*
 * 抽象方法使用：
 * 1、不能直接创建抽象类对象
 * 2、必须用一个字累继承抽象父类
 * 3、子类必须覆盖重写抽象父类中所有的抽象方法
 * 覆盖重写（实现）：子类去掉抽象放啊的abstract关键字，补上方法体大括号。
 * 4、创建子类对象使用
 * 
 * 一个抽象类不一定含有抽象方法
 * 只要保证抽象方法所在的类是抽象类即可
 */
public abstract class AbstractTest {

	//抽象方法
	public abstract void eat();
	
	//普通成员方法
	public void normalMethod() {
		
	}
}
