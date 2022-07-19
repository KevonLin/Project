package com.itcast.day08;

/*
 * 再计算-10.8到5.9之间，绝对值大于6或者小于2.1的整数有几个？
 * 
 * 如果使用Math.ceil方法，-10.8可以变成-10.0，double也可以进行++。
 */
public class MathPractice {

	public static void main(String[] args) {

		int count = 0;
		double min = -10.8;
		double max = 5.9;
		for (int i = (int) min; i < max; i++) {
			int abs = Math.abs(i);
			if (abs > 6 || abs < 2.1) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("一共有：" + count + "个");
		
		System.out.println("===========================");
	}
}
