package com.lin.javase.day09.test006;

/**
 * Java�����з������õ�ʱ����Ƶ��������ݵ����⣬
 * ��������ʵ���ϴ��ݵ��Ǳ����б���ľ���ֵ 
 *
 */
public class Test01 {

	public static void main(String[] args) {
		int i = 10;
		add(i);//add�������õ�ʱ�򣬸�add����������һ������i�����״�����ʲô
		System.out.println("main -->" + i);
	}
	
	public static void add(int i) {
		i++;
		System.out.println("add -->" + i);
	}

}
