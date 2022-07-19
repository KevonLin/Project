package com.lin.javase.day09.test005;

/**
 *  关于Java类中的构造方法
 *  	1、构造方法又被称为构造函数/构造器/Constructor
 *  
 *  	2、构造方法语法结构：
 *  		[修饰符列表] 构造方法名(形式参数列表){
 *  			构造方法体
 *  		}
 *  
 *  	3、回顾普通方法的语法结构：
 *  		[修饰符列表] 返回值类型(形式参列表){
 *  			方法体;
 *  		}
 *  
 *  	4、对于构造方法来说，“返回值类型”不需要指定，并且也不能写void，
 *  	只要协商void，这个方法就成为普通方法了
 *  
 *  	5、对于构造方法的方法名必须和当前类名保持一致。
 *  
 *  	6、构造方法的作用？
 *  		构造方法存在的意义是，通过构造方法的调用，可以创建对象。
 *    
 *  	7、构造方法怎么调用？
 *  		- 普通方法的调用：方法修饰符中有static：类名.方法名(实参列表)/方法修饰符没有static：引用.方法名(实参列表)
 *  		- new 构造方法名（实参列表）
 *  
 *  	8、构造方法调用执行之后，有返回值吗？
 *  		每个构造方法执行结束都有返回值，但是这个“return 值;”这样的语句不用写
 *  		并且返回值类型是构造方法所在类的类型。
 *  		由于构造方法的返回值类型就是本身，所以返回值类型不用写
 *  
 *  	9、注释和取消注释：ctrl+/，多行注释：ctrl+shift+/
 *  
 *  	10、当一个类中没有定义任何构造方法的话，系统默认给该类提供一个无参数的构造方法，该方法被称为缺省构造器
 *  	
 *  	11、当一个类显示的将构造方法定义出来了，系统不在默认为该类提供缺省构造器，建议开发中手动为当前类提供无参数构造方法
 *  
 *  	12、构造方法支持重载机制。在一个类中编写多个构造方法，这些构造方法显然构成了重载
 */
public class ConstructorTest01 {

	public static void main(String[] args) {
	
		//创建User对象
		//调用User类的构造方法来完成对象的创建
		//以下程序创建了4个对象，只要构造函数调用就会创建对象，并且一定在“堆内存”中开辟内存空间
		User u1 = new User();
		User u2 = new User(10);
		User u3 = new User("zhangsan");
		User u4 = new User("10,zhangsan");
		
		//创建对象的语法是：new 类名()
		
		
		//调用带有static的方法：方法.
		//doOther方法在ConsrtuctorTest01l类当中，类名.可以省略
		ConstructorTest01.doSome();
		doSome();
		
		//调用没有static的方法：引用.
		ConstructorTest01 t = new ConstructorTest01();
		t.doOther();
		
	}
	
	public static void doSome() {
		System.out.println("do some!");
	}
	
	public void doOther() {
		System.out.println("do other!");
	}
}
