package com.itcast.day08;

import java.util.Arrays;

/*
 * java.util.Arrays数组相关的工具类
 * 
 * public static String toString(数组)：将参数数组变成字符串（按照默认格式：[元素1, 元素2, 元素3 ...]）
 * public ststic void sort(数组)：按照默认升序（从下到大）对数组的元素进行排序
 * 
 * 备注：
 * 1、如果是数值，sort默认按照从小到大
 * 2、如果是字符串，sort按照字母升序
 * 3、如果是自定义的类型，需要有Co'mpareable或者Compparator接口支持
 */
public class ArraysTest {

	public static void main(String[] args) {
		int[] intArray = {10,20,30};
		String intStr = Arrays.toString(intArray);
		System.out.println(intStr);
		
		int[] intArray1 = {1,2,7,6};
	}
}
