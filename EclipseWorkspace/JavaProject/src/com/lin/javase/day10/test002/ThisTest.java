package com.lin.javase.day10.test002;

public class ThisTest {
	
	//ʵ������(����.�ķ�ʽ����)
	
	int num = 10;
	
	public static void main(String[] args) {
		
		//û�е�ǰ����this
		//���ʵ�ǰ����(this)num����
		//����static�ķ�����������this
		//System.out.println(num);
		//System.out.println(this.num);
		
		ThisTest n = new ThisTest();
		System.out.println(n.num);
	}
}
