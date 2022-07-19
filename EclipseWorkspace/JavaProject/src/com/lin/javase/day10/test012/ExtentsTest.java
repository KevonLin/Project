package com.lin.javase.day10.test012;

/**
 * 关于Java语言中的继承
 * 	1、继承是面向对象三大特征之一，三大特征分别是：封装/继承/多态
 * 
 * 	2、继承基本的作用是：代码复用。但是继承最“重要”的作用是：有了继承才有了以后的“方法的覆盖”和“多态机制”。
 * 
 * 	3、继承的语法格式：
 * 		[修饰符列表] class 类名 extends 父类名{
 * 			类体 = 属性 + 方法
 * 		}
 * 
 * 	4、Java语言中的继承只支持单继承，一个类不能同时继承多个类，在C++中支持
 * 
 * 	5、关于继承中的属于：
 * 		B类 继承 A类，其中：
 * 			A类：父类、基类、超类、superclass
 * 			B类：子类、派生类、subclass
 * 
 * 	6、在Java语言中子类继承父类都继承哪些数据？
 * 		- 私有的不支持继承
 * 		- 构造方法不支持继承
 * 		- 其他数据都可以被继承
 * 
 *	7、虽然Java语言中支支持单继承，但一个类也可以间接继承其他类，例如：
 *		C extends B{
 *		}
 *		B extends A{
 *		}
 *		A extends T{
 *		}
 *		C直接继承B也简介继承T、A
 *
 * 	8、Java语言中假设一个类没有显示的继承任何类，该类默认继承javase库中提供的java.lang.Object类。
 * 		java语言中任何一个类都有Object类的特征
 * 
 */
public class ExtentsTest {
	
	//查找类型【Open Type】Ctrl + Shift + T
	//查找资源【Open Resource】Ctrl + Shift + R
	public static void main(String[] args) {
		ExtentsTest et = new ExtentsTest();
		String s = et.toString();
		System.out.println(s);
		
		CreditAccount act = new CreditAccount();
		act.setActno("act-001");
		act.setBalance(-1000.0);
		act.setCredit(0.99);
		
		System.out.println(act.getActno() + "," + act.getBalance() + "," + act.getCredit());
	}
}
