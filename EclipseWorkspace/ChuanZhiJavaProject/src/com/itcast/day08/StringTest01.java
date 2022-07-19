package com.itcast.day08;
/*
 * 字符串特点
 * 1.字符串的内容不可变。
 * 2.字符串可以共享使用。
 * 3.字符串效果上相当于是char[]字符数组，但底层原理是byte[]字节数组。
 * 
 * 创建字符串的常见3+1种方式。
 * 三种构造方法：
 * public String()：创建一个空白字符串，不含有任何内容。
 * public String(char[] array)：根据字符数组的内容，创建对应的字符串。
 * public String(byte[] array)：根据字符数组的内容，创建对应的字符串。
 * 一种直接创建：
 * String str = "hello";
 * 
 * 直接写上双引号，就是字符串对象。
 */
public class StringTest01 {

	public static void main(String[] args) {
		//使用空参构造
		String str1 = new String();
		System.out.println("第一个字符串是：" + str1);
		
		//根据字符数组创建字符串
		char[] charArray = {'A', 'B', 'C'};
		String str2 = new String(charArray);
		System.out.println("第二个字符串：" + str2);
		
		//根据字节数组创建字符串
		byte[] byteArray = {97, 98, 99};
		String str3 = new String(byteArray);
		System.out.println(str3);
		
		//直接创建
		String str4 = "Hello";
		System.out.println(str4);
	}
}
