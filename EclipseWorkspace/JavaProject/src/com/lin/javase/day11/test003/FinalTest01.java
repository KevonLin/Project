package com.lin.javase.day11.test003;

/**
 * 关于Java中的final关键字
 * 	1、final是一个关键字，表示最终的，不可变的
 * 	2、final修饰无法被继承
 * 	3、final修饰的方法无法被覆盖
 * 	4、final修饰的变量一旦赋值，不可被重新赋值
 * 	5、final修饰的实例变量必须手动赋值，不能采用系统默认值
 * 	6、final修饰的引用一旦指向某个对象之后，不能再指向其他对象，那么被指向的对象无法被垃圾回收器回收
 * 		final修饰的引用虽然指向某个对象之后不能指向其他对象，但是被指向对象内部的内存是可以修改的
 *	7、final修饰的实例变量，一般和static联合使用，被称为常量
 */
public class FinalTest01 {
	public static void main(String[] args) {
		
	}
}
