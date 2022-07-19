package com.itcast.day08;
/*
 * java.util.Math类数学相关的阿工具类
 * 
 * public static double abs(double num)：获取绝对值。有多种重载
 * public static double ceil(double num)：向上取整。
 * public static double floor(double num)：向下取整。
 * public static long round(double num)：四舍五入。
 */
public class MathText {

	public static void main(String[] args) {
		//获取绝对值
		System.out.println(Math.abs(-3.14));
		System.out.println(Math.ceil(3.14));
		System.out.println(Math.floor(3.14));
		System.out.println("=================");
		
		//向上取整
		System.out.println(Math.ceil(3.9));
		System.out.println(Math.ceil(3.0));
		System.out.println("=================");

		//向下取整，抹零
		
		
		//四舍五入
		System.out.println(Math.round(3.4));
		System.out.println(Math.round(55.6));
		System.out.println(Math.round(Math.PI));
	}
}
