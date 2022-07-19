package com.lin.javase.day10.test005;

/**
 * 自定义日期类型
 * 
 * this可以用在哪里？？
 * 	1、可以使用在实例方法中代表当前对象【语法格式this.】
 * 	2、可以使用在构造方法中，通过当前的构造方法调用其他的构造方法【语法格式this(实参)】
 * 	3、☆☆☆重点：this()这种语法只能出现在构造函数的第一行
 * @author Lin
 *
 */
public class Date {

	// 属性
	private int year;
	private int month;
	private int day;

	// 构造函数
	public Date(int year, int month, int day) {

		//属性
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
/**
 * 需求：当程序员调用一下无参数的构造方法的时候，默认创建日期是“1970-1-1”
 */
	public Date() {
		
		/*
		this.year = 1970;
		this.month = 1;
		this.day = 1;
		*/
		//以上代码可以通过调用另一个构造方法来完成
		//但是前提不能创建对象，以下代码表示创建了一个全新的对象
		//new Date(1970,1,1);
		
		//需要以下的语法完成构造方法的d调用
		//z这种方式不会船舰新的对象。
		this(1970,1,1);
	}


	// setter and getter
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	
	//对外提供一个方法可已经日期打印输出到控制台
	//实例方法
	public void print() {
		System.out.println(this.year + "年" + this.month + "月" + this.day + "日");
	}
}
