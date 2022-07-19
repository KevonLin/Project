package com.lin.javase.day10.test006;

public class Test {

	// ����static�ķ���
	public static void method1() {
		// ����doSome
		// ������ʽ����
		Test.doSome();
		// ʡ�Է�ʽ����
		doSome();

		// ����doOther
		// ������ʽ����
		Test tt = new Test();
		tt.doOther();
		// ʡ�Է�ʽ����

		// ����i
		// ������ʽ����
		System.out.println(tt.i);
		// ʡ�Է�ʽ����
	}

	// û��static�ķ���
	public void method2() {
		// ����doSome
		// ������ʽ����
		Test.doSome();
		// ʡ�Է�ʽ����
		doSome();

		// ����doOther
		// ������ʽ����
		this.doOther();
		// ʡ�Է�ʽ����
		doOther();
		
		// ����i
		// ������ʽ����
		System.out.println(this.i);
		// ʡ�Է�ʽ����
		System.out.println(i);
	}

	// ������
	public static void main(String[] args) {

		// Ҫ���������д�������method1
		// ʹ��������ʽ����
		// ʹ��ʡ�Եķ�ʽ����
		Test.method1();
		method1();

		// Ҫ���������д�������method2
		// ʹ��������ʽ����
		// ʹ��ʡ�Եķ�ʽ����
		Test m2 = new Test();
		m2.method2();

	}

	// û��static�ı���
	int i = 10;

	// ����static�ķ���
	public static void doSome() {

	}

	// û��static�ķ���
	public void doOther() {

	}

}
