package com.lin.javase.day09.test002;

public class Test {
	
	public static void main(String[] args) {
		
		//创建丈夫对象
		Husband xiaoMing = new Husband();
		xiaoMing.name = "小明";
		
		//创建妻子对象
		Wife xiaoGang = new Wife();
		xiaoGang.name = "小刚";
		
		//结婚
		xiaoMing.wife = xiaoGang;
		xiaoGang.husband = xiaoMing;
		
		System.out.println(xiaoMing.wife.name);
		System.out.println(xiaoGang.husband.name);
	}
	
}
