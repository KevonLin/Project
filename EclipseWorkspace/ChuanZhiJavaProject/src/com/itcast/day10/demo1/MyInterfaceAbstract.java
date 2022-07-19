package com.itcast.day10.demo1;

/*
 * 在任何版本的Java中，接口都能定义抽象方法。
 * 格式：
 * public abtract 返回值类型 方法名称(参数列表);
 * 
 * 注意：
 * 1、接口中的抽象方法，修饰符必须是两个固定关键字：public abstract
 * 2、关机子修饰符可以选择性省略
 * 3、方法的三要素，可以随意定义
 */
public interface MyInterfaceAbstract {

	public abstract void methodAbs1();
	
	abstract void methodAbs2();
	
	public void methodAbs3();
	
	void methodAbs4();
}
