package com.lin.javase.day10.test011;

/**
 * ʵ������/����顾�˽����ݣ�ʹ�õķǳ��١�
 * 	1��ʵ���������Ա�д�������ѭ���϶��µ�˳��ִ��
 * 	2��ʵ��������ڹ��췽��ִ��ǰִ�У����췽��ִ��һ�Σ�ʵ�������ִ��һ��
 * 	3��ʵ�������Ҳ��Java����Ϊ����Ա׼����һ������ʱ��������Ϊ�����ʼ��ʱ����
 * @author Lin
 *
 */
public class Test {
	
	//���캯��
	public Test(){
		System.out.println("Test���ȱʡ������ִ��");
	}
	
	//ʵ�������
	{
		System.out.println(1);
	}
	//ʵ�������	
	{
		System.out.println(2);
	}
	//ʵ�������	
	{
		System.out.println(3);
	}
	
	//������
	public static void main(String[] args) {

		System.out.println("main begin");
		new Test();
		new Test();
	}

}
