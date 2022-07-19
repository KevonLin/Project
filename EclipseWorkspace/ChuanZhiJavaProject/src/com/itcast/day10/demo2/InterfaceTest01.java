package com.itcast.day10.demo2;

/*
 * 不能通过接口实现类的对象来调用接口中的静态方法
 * 
 */
public class InterfaceTest01 {

	public static void main(String[] args) {
		// 创建实现类对象
		InterfaceStaticImpl impl = new InterfaceStaticImpl();
		// 错误写法
		// impl.methodStatic();
		// 直接通过接口名称调用静态方法
		InterfaceStatic.methodStatic();
	}
}
