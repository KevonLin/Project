package com.lin.javase.day10.test001;


public class CustomerTest {

	public static void main(String[] args) {

		// ����Customer����
		Customer c1 = new Customer();
		c1.name = "zhangsan";
		c1.shopping();
		
		//����Customer����
		Customer c2 = new Customer();
		c2.name = "lisi";
		c2.shopping();

		//����doSome����
		//���á�����.��d�ķ������ʣ���Ȼ���������ִ�еĹ����в���Ҫ����Ĳ���
		Customer.doSome();
		
		//��doOther
		Customer.doOther();
	}
	
	//������static�ػ��ӵ�һ������
	//�˿͵Ĺ�����Ϊ��ÿ���˿͹�������ս����һ��
	//���Թ������ڶ��󼶱����Ϊ	
}
