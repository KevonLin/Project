package com.lin.javase.day10.test008;

/**
 * “中国人”类
 * @author Lin
 *
 */
public class Chinese {

	//身份证号
	String id;
	
	//姓名
	String name;
	
	//国际【没哟个对象由于都是有“Chinese类”实例化的，所以每个中国人的国际都是“中国”】
	//无论通过Chinese类实例化多少个Java对象，这些Javad对象的国际都是“中国”
	//实例变量【实例变量是一个Java对象就有一份，100个Java对象有100个country】，分析这种设计方式有什么缺点
	//所有人的国籍都是“中国”，声明变量为实例变量太浪费内存
	String country;
	
	//构造函数
	public Chinese() {
		
	}
	public Chinese(String id,String name,String country) {
		this.id = id;
		this.name = name;
		this.country = country;
	}
}
