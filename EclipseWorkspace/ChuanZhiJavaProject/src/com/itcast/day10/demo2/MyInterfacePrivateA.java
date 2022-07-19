package com.itcast.day10.demo2;

/*
 *问题描述：
 *抽取一个共有方法，用来解决两个默认方法之间重复代码问题
 *但是这个共有方法不应该让实现类使用，应该是私有化的。
 *
 * 解决方案：
 * 从Java 9开始，接口中允许定义私有方法
 * 1.普通私有方法，解决多个默认方法之间重复代码问题
 * private 返回值类型 方法名称(参数列表){}
 * 2.静态私有方法，解决多个静态方法之间重复问题
 * private static 返回值类型 方法名称(参数列表){}
 */
public interface MyInterfacePrivateA {

	public default void methodDefault1() {
		System.out.println("默认方法1");
	}
	public default void methodDefault2() {
		System.out.println("默认方法2");
	}
	//jdk 9以上才可以使用private
/*	private void methodCommon() {
		
	}*/
}
