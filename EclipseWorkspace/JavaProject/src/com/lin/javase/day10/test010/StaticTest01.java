package com.lin.javase.day10.test010;

/**
 * 可以使用static关键字来帝国一“静态代码块” 
 * 
 * 	1、语法格式： static{ java语句; }
 * 
 * 	2、静态代码块在类加载时执行，并且只执行一次。
 * 
 * 	3、静态代码块在一个类中可以编写多个，并且遵循自上而下的顺序依次执行。
 * 
 * 	4、静态代码块的作用是什么？怎么用？用在哪？什么时候用？
 * 
 * 		-项目要求在类加载的时候执行代码完成日志的记录
 * 		那么这段记录日志的代码就可以编写到静态代码块中，完成日志记录。
 * 		
 * 		-静态代码块是Java程序员准备一个特殊的时刻，这个t特殊的时刻被称为类加载s时刻
 * 		若希望在此刻执行一段特殊的程序，这段程序可以直接放在静态代码块中。
 * 
 * 	5、通常在静态代码块中完成预备工作，先完成数据的准备工作。
 * @author Lin
 *
 */
public class StaticTest01 {

	static {
		System.out.println("类加载1");
	}
	static {
		System.out.println("类加载2");
	}
	static {
		System.out.println("类加载3");
	}

	public static void main(String[] args) {
		System.out.println("main begin");
	}
}
