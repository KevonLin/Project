package com.lin.javase.day10.test001;


public class CustomerTest {

	public static void main(String[] args) {

		// 创建Customer对象
		Customer c1 = new Customer();
		c1.name = "zhangsan";
		c1.shopping();
		
		//创建Customer对象
		Customer c2 = new Customer();
		c2.name = "lisi";
		c2.shopping();

		//调用doSome方法
		//采用“类名.”d的方法访问，显然这个方法在执行的过程中不需要对象的参与
		Customer.doSome();
		
		//调doOther
		Customer.doOther();
	}
	
	//不带有static关机子的一个方法
	//顾客的购物行为，每个顾客购物的最终结果不一样
	//所以购物属于对象级别的行为	
}
