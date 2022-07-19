package com.lin.javase.day10.test001;
/**
 * 关于Java语言中的this关键字：
 *  1、this是一个关机子，翻译为：这个 
 *  2、this是一个引用，this是一个变量，this变量中保存了内存地址指向了自身，this存储在JVM堆内存Java对象内部。
 *  4、this可以出现在“实例方法”中，this指向当前正在执行动作的对象。
 *  5、this在多数情况下是可以省略不写的
 *  6、this不能使用在带有static的方法中
 *  7、
 * 
 * @author Lin
 *
 */
public class Customer {
	
	//姓名【在堆内存的对象内部储存，访问该变量时必须先创建对象
	String name;//实例变量：必须采用“引用.”的方式访问
	
	//构造方法
	public Customer() {
		
		
	}
	//不带有static关键字的一个方法
	//顾客的购物行为，每个顾客购物的最终结果不一样
	//所以购物属于对象级别的行为	
	//由于每个对象在执行购物动作最终结果不同，购物这个动作必须有“对象”参与
	//重点：没有static关键字的方法被称为“实例方法”，实例方法访问：“引用.”
	//重点：没有static关键字的变量被称为“实例变量”
	//注意：当一个行为/动作子执行的过程中是需要对象参与的，这个方法要定义为“实例方法”，不带static关键字
	//以下方法定义为实例方法，因为每一个顾客在购物的时候，z最终的结果是不同的
	public void shopping(){
		
		System.out.println(this.name + "在购物");
	}
	
	public static void doSome() {
		//这个执行过程中没有“当前对象”，带有static的fang方法是通过“类名.”的fangfang'shi'f方式访问的
		
		//编译错误原因，doSome方法对象调用，是一个类的调用
		//name是“实例变量”，以下代码含义：访问当前对象的name，没有当前对象，不能访问
		
		//System.out.println(name);
		
		//System.out.println(this);
	}
	public static void doOther() {
		
		Customer c = new Customer();
		System.out.println(c.name + "在购物");
	}
}
