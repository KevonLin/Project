package com.itcast.day08;
/*
 * java.util.Math����ѧ��صİ�������
 * 
 * public static double abs(double num)����ȡ����ֵ���ж�������
 * public static double ceil(double num)������ȡ����
 * public static double floor(double num)������ȡ����
 * public static long round(double num)���������롣
 */
public class MathText {

	public static void main(String[] args) {
		//��ȡ����ֵ
		System.out.println(Math.abs(-3.14));
		System.out.println(Math.ceil(3.14));
		System.out.println(Math.floor(3.14));
		System.out.println("=================");
		
		//����ȡ��
		System.out.println(Math.ceil(3.9));
		System.out.println(Math.ceil(3.0));
		System.out.println("=================");

		//����ȡ����Ĩ��
		
		
		//��������
		System.out.println(Math.round(3.4));
		System.out.println(Math.round(55.6));
		System.out.println(Math.round(Math.PI));
	}
}
