package com.lin.javase.day09.test005;

/**
 * ���췽�������ã�
 * 		1����������
 * 		2����ʵ��������ֵ
 *		
 *
 *��Ա����֮ʵ�����������ڶ��󼶱�ı��������ֱ����������ж��������ʵ������
 *ʵ������û���ֶ����Ƶ�ʱ��ϵͳĬ�ϸ��ƣ�ϵͳĬ�ϸ�ֵ����������ص�ʱ��
 *����ص�ʱ��ֻ�����˴���Ƭ�Σ���û���ü��������󣬴�ʱʵ��������û�г�ʼ��
 *
 *ʵ���������ڴ�ռ����ڹ��췽��ִ�й�������ɿ��ٵ�w��ɳ�ʼ���ġ�
 *ϵͳ��Ĭ�ϸ��Ƶ�ʱ��Ҳ���ڹ��췽��ִ�й��������d�ĸ�ֵ
 *
 *ʵ������Ĭ��ֵ��
 *byte,short,int,long 0
 *float,double 0.0
 *boolean false
 *������������ null
 *
 *ʵ�������洢��JVM���ڴ��ڲ�
 */
public class ConstructorTest02 {

	public static void main(String[] args) {
		
		//��eclipse�в鿴���ʵ����ĸ����ԣ��鿴���ʵ����ĸ�����
		//��ctrl��������ƶ����鿴��Ԫ���ϣ������»��ߵ�ʱ�򵥻�
		//��һ������Ԫ�ع��࣬���ٲ鿴��ctrl+o����Ҫ�鿴Ԫ�ص����ƣ���һ����ȫ��
		//��������
		Account act1 = new Account();
		
		System.out.println("�˺ţ�" + act1.getActno());
		System.out.println("���" + act1.getBalance());
		
		Account act2 = new Account("110");
		System.out.println("�˺ţ�" + act2.getActno());
		System.out.println("��" + act2.getBalance());
		
		Account act3 = new Account(100.0);
		System.out.println("�˺ţ�" + act3.getActno());
		System.out.println("��" + act3.getBalance());
		
		Account act4 = new Account("A",1000.0);
		System.out.println("�˺ţ�" + act4.getActno());
		System.out.println("��" + act4.getBalance());

	}
	
}
