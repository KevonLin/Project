package com.itcast.day07;

import java.util.ArrayList;

/*
 * ��װ��
 * ������������		��װ��
 * byte			Byte
 * short		Short
 * int			Integer
 * long			Long
 * float		Float
 * double		Double
 * boolean		Boolean
 * char			Character
 * 
 * ��JDK 1.5+ ��ʼ��֧���Զ�װ�䣬�Զ�����
 * 
 * �Զ�װ�䣺��������--->��������
 * �Զ����䣺��װ����--->��������
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
