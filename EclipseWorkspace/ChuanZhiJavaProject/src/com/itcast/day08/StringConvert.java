package com.itcast.day08;

/*
 * String中与转换相关的常用方法
 * 
 * public char[] toCharArray()
 * 将当前字符串拆分成字符数组作为返回值
 * public byte[] getBytes()
 * 获得当前字符串底层的字节数组
 * public String replace(CharSequence odlString, CharSequence newString)
 * 将所有出现的源字符串替换为新字符串
 * 备注：CharSequence意思是可以接受字符串类型
 */
public class StringConvert {

	public static void main(String[] args) {
		char[] chars = "Hello".toCharArray();
		System.out.println(chars.length);
		System.out.println(chars);

		System.out.println("==========");

		byte[] bytes = "abc".getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}

		System.out.println("==========");

		String str1 = "How do you do!";
		String str2 = str1.replace("o", "*");
		System.out.println(str1);
		System.out.println(str2);

	}
}
