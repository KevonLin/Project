package com.itcast.day08;

import java.util.Arrays;

/*
 * java.util.Arrays������صĹ�����
 * 
 * public static String toString(����)���������������ַ���������Ĭ�ϸ�ʽ��[Ԫ��1, Ԫ��2, Ԫ��3 ...]��
 * public ststic void sort(����)������Ĭ�����򣨴��µ��󣩶������Ԫ�ؽ�������
 * 
 * ��ע��
 * 1���������ֵ��sortĬ�ϰ��մ�С����
 * 2��������ַ�����sort������ĸ����
 * 3��������Զ�������ͣ���Ҫ��Co'mpareable����Compparator�ӿ�֧��
 */
public class ArraysTest {

	public static void main(String[] args) {
		int[] intArray = {10,20,30};
		String intStr = Arrays.toString(intArray);
		System.out.println(intStr);
		
		int[] intArray1 = {1,2,7,6};
	}
}
