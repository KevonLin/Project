package com.itcast.day08;

/*
 * String中与获取相关的常用方法又：
 * 
 * public int length()：获取字符串中含有的字符的个数，拿到字符串长度
 * public String concat(String str)：将当前的字符串和参数字符串拼接成为返回值新的字符串
 * public char charAt(int index):获取指定索引位置的单个字符。（索引从0开始）
 * public int indexOf(String str)：查找参数字符串在本字符串中首次出现的索引位置，如果没有返回-1值
 * 
 */
public class StringGet {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		System.out.println("str1的长度为：" + str1.length());
		System.out.println(str1.concat(str2));
		
		System.out.println(str1.charAt(0));
		System.out.println(str2.indexOf('o')+1);
		
		String original = "Hello World";
		System.out.println(original.indexOf(' '));
	}
}
