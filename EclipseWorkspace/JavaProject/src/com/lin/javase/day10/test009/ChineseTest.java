package com.lin.javase.day10.test009;

public class ChineseTest {

	public static void main(String[] args) {
		
		//创建中国人对象1
		Chinese zhangsan = new Chinese("1","张三");
		System.out.println(zhangsan.id + "," + zhangsan.name + "," + Chinese.country); 
	}
}
