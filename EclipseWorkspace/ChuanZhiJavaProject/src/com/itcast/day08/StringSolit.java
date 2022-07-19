package com.itcast.day08;

/*
*分割字符串的方法：
*public String[] split(String regex)：按照参数的规则，将字符串切分为若干部分。
*
*注意事项：
*split方法的参数是一个“正则表达式"
*如果按照英文据点“.”进行切分，碧血写成“\\.”的形式
*/

public class StringSolit {

	public static void main(String[] args) {
		String str1 = "aaa,bbb,ccc";
		String[] array1 = str1.split(",");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		System.out.println("=====================");
		
		String str2 = "aaa.bbb.ccc";
		String[] array2 = str2.split("\\.");
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}
}
