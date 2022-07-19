package com.itcast.day07;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		/*
		 * ��ʼ����䣺int min = 0,max = array.length - 1
		 * �����жϣ�min < max 
		 * �������ʽ��min ++,max --
		 * ѭ���壺���������� int temp = min; min = max; max = temp;
		 */
		for (int min = 0, max = array.length - 1; min < max; min++, max--) {
			int temp = array[min];
			array[min] = array[max];
			array[max] = temp;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println(Arrays.toString(array));
	}
}
