package com.itcast.day08;

/*
 * 字符串常量池：程序直接写上的双引号字符串，就在字符串常量池中
 * 双引号写的在常量池中  new的对象不在常量池中
 * 常量池在堆内存中，是堆内存的一小部分空间
 * 不同对象可以指向同一个常量池中的字符串
 * 
 * 对于基本类型的 == 进行数值比较
 * 对于引用类型的 == 进行地址比较
 */
public class StringTest02 {

	public static void main(String[] args) {
		
	String str1 = "abc";
	String str2= "abc";
	
	char[] charArray = {'a','b','c'};
	String str3 = new String(charArray);
	
	System.out.println(str1 == str2);
	System.out.println(str1 == str3);
	System.out.println(str2 == str3);
	
	}
	
}
