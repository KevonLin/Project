package com.lin.javase.day11.test003;

public class FinalTest02 {

	//��Ա����֮ʵ������
	//ʵ������Ĭ��ֵ+final���εı���һ����ֵ�������¸�ֵ
	//final int age;//Ĭ��ֵΪ0
	//�����ֶ���ֵ�����ܲ���Ĭ��ֵ
	//Java�������չ涨ʵ������ʹ��final����֮�󣬱����ֶ���ֵ�����ܲ���ϵͳĬ��ֵ
	//��һ�ֽ������
	final int age = 10;
	
	//�ڶ��ֽ������
	final int num;
	public FinalTest02() {//�ڹ��췽��ʱ��ֵ
		this.num = 200;
	}
	
	//�������ֽ�u������ʵ������һ�ֽ�������������ڹ��췽���Ĺ����и�ʵ��������ֵ
	public static void main(String[] args) {
		final int a;
		a = 100;
	}
}
