package com.lin.javase.day11.test003;

public class FinalTest04 {

	public static void main(String[] args) {
		
		System.out.println(Chinese.GUO_JI);
		System.out.println(Math.PI);
	}
}

class Math{
	
	public static final double PI = 3.1415926;
	
}
//�й���
class Chinese{
	
	//����
	//����ÿ�����й��˵Ĺ��������й������ҹ������ᷢ�ɸı䣬Ϊ�˷�ֹ�������޸Ľ����final����
	//final���ε�ʵ�������ǲ��ɱ�ģ����ֱ���һ���static����ʹ�ã�����Ϊ��������
	//�����Ķ����﷨��ʽ��public static final ���� ������ = ֵ;
	//Java�淶��Ҫ�����еĳ���������ȫ����д��ÿ������֮�������»�������
	static final String country = "�й�";
	
	public static final String GUO_JI = "�й�";
}