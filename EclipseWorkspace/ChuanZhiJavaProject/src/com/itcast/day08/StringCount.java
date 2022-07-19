package com.itcast.day08;

import java.util.Scanner;

/*
 * 输入一个字符串，统计各种字符出现的次数
 * 种类：大写、小写、数字、其他
 * 
 * 思路:
 * Scanner
 * str = sc.newxt();
 * 定义四个变量统计次数
 * 对字符一个字一个字检查，String-->char[]，方法toCharArray()
 * 遍历char[]字符数组，对当前字符的种类进行判断，并且用四个变量++动作
 * 打印输出四个变量，分别代表四个字符出现次数
 */
public class StringCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String input = sc.next();
		
		int Upper = 0;
		int Lower = 0;
		int Number = 0;
		int Other = 0;
		
		//☆☆☆☆☆☆☆☆☆☆☆☆
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if('A' <= c && c <= 'Z') {
				Upper ++;
			}else if('a' <= c && c <= 'z') {
				Lower ++;
			}else if('0' <= c && c <= '9') {
				Number ++;
			}else {
				Other ++;
			}
		}
		System.out.println("大写字母有：" + Upper + "个");
		System.out.println("小写字母有：" + Lower + "个");
		System.out.println("数字字符有：" + Number + "个");
		System.out.println("其他字符有：" + Other + "个");
	}
}
