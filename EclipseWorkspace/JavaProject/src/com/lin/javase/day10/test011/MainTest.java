package com.lin.javase.day10.test011;

public class MainTest {

	//public��ʾ�����ģ����κ�λ�ö��ǿ��Է��ʵ�
	//static��ʾ��̬�ģ�ʹ�á�����.���ķ�ʽ���ɷ��ʣ�����Ҫ�������󣬾Ϳ��Ե���main����
	//void��ʾmain����ִ�н���֮�󲻷����κ�ֵ
	//main��main�����򷽷���
	//(String[] args)��main��������ʽ�����б�
	public static void main(String[] args) {
		main(10);
		main("Hello World!");
	}
	
	public static void main(int i) {
		System.out.println(i);
	}
	
	public static void main(String args) {
		System.out.println(args);
	}
}