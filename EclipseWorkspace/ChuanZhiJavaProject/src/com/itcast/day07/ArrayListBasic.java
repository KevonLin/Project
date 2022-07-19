package com.itcast.day07;

import java.util.ArrayList;

/*
 * 包装类
 * 基本数据类型		包装类
 * byte			Byte
 * short		Short
 * int			Integer
 * long			Long
 * float		Float
 * double		Double
 * boolean		Boolean
 * char			Character
 * 
 * 从JDK 1.5+ 开始，支持自动装箱，自动拆箱
 * 
 * 自动装箱：基本类型--->引用类型
 * 自动拆箱：包装类型--->基本类型
 */
public class ArrayListBasic {

	public static void main(String[] args) {
		
		ArrayList<Integer> listC = new ArrayList<>();
		listC.add(100);
		listC.add(200);
		listC.add(300);
		System.out.println(listC);
		
		int num = listC.get(1);
		System.out.println(num);
		
	}
}
