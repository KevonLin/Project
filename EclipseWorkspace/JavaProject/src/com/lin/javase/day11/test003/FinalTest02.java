package com.lin.javase.day11.test003;

public class FinalTest02 {

	//成员变量之实例变量
	//实例变量默认值+final修饰的变量一旦赋值不能重新赋值
	//final int age;//默认值为0
	//必须手动赋值，不能采用默认值
	//Java语言最终规定实例变量使用final修饰之后，必须手动赋值，不能采用系统默认值
	//第一种解决方案
	final int age = 10;
	
	//第二种解决方案
	final int num;
	public FinalTest02() {//在构造方法时赋值
		this.num = 200;
	}
	
	//以上两种姐u而方案实际上是一种解决方案，都是在构造方法的过程中给实例变量赋值
	public static void main(String[] args) {
		final int a;
		a = 100;
	}
}
