package com.lin.javase.day10.test003;
/**
 * ���ۣ�
 * 		����static�ķ����в���ֱ�ӷ���ʵ��������ʵ������
 * 		ʵ��������ʵ����������Ҫ����Ĵ���
 * 		static������û��this����ǰ���󲻴���
 * 		
 * @author Lin
 *
 */
public class ThisTest {

	public static void main(String[] args) {
		
		//����doSome����
		ThisTest.doSome();
		
		//����doSome����
		doSome();
		
		//����doOther����
		//doOther��ʵ������
		//���ñ����ж���Ĵ���
		//���´����ʾ�ĺ��壺���õ�ǰ�����doOther����
		//doOther();
		//this.doOther();
		
		ThisTest t = new ThisTest();
		t.doOther();
		t.run();
	}
	
	public static void doSome() {
		System.out.println("do some!");
	}
	
	public void doOther() {
		System.out.println("do other!");
	}
	
	//run��ʵ������������run����һ�����ж�����ڵ�
	//�ȴ���һ��������ܵ���run����
	public void run() {
		//�ٴ������д���ִ�еĹ�����һ���Ǵ��ڡ���ǰ���󡱵�
		//Ҳ����˵һ���С�this��
		System.out.println("run execute!");
		
		//���õ�ǰ�����doOther
		this.doOther();
	}
	
}
