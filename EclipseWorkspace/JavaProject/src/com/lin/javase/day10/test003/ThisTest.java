package com.lin.javase.day10.test003;
/**
 * 结论：
 * 		带有static的方法中不能直接访问实例变量和实例方法
 * 		实例变量和实例方法都需要对象的存在
 * 		static方法中没有this，当前对象不存在
 * 		
 * @author Lin
 *
 */
public class ThisTest {

	public static void main(String[] args) {
		
		//调用doSome方法
		ThisTest.doSome();
		
		//调用doSome方法
		doSome();
		
		//调用doOther方法
		//doOther是实例方法
		//调用必须有对象的存在
		//以下代码表示的含义：调用当前对象的doOther方法
		//doOther();
		//this.doOther();
		
		ThisTest t = new ThisTest();
		t.doOther();
		t.run();
	}
	
	public static void doSome() {
		System.out.println("do some!");
	}
	
	public void doOther() {
		System.out.println("do other!");
	}
	
	//run是实例方法，调用run方法一定是有对象存在的
	//先创建一个对象才能调用run方法
	public void run() {
		//再大括号中代码执行的过程中一定是存在“当前对象”的
		//也就是说一定有“this”
		System.out.println("run execute!");
		
		//调用当前对象的doOther
		this.doOther();
	}
	
}
