package com.itcast.day10.demo2;

/*
 *����������
 *��ȡһ�����з����������������Ĭ�Ϸ���֮���ظ���������
 *����������з�����Ӧ����ʵ����ʹ�ã�Ӧ����˽�л��ġ�
 *
 * ���������
 * ��Java 9��ʼ���ӿ���������˽�з���
 * 1.��ͨ˽�з�����������Ĭ�Ϸ���֮���ظ���������
 * private ����ֵ���� ��������(�����б�){}
 * 2.��̬˽�з�������������̬����֮���ظ�����
 * private static ����ֵ���� ��������(�����б�){}
 */
public interface MyInterfacePrivateA {

	public default void methodDefault1() {
		System.out.println("Ĭ�Ϸ���1");
	}
	public default void methodDefault2() {
		System.out.println("Ĭ�Ϸ���2");
	}
	//jdk 9���ϲſ���ʹ��private
/*	private void methodCommon() {
		
	}*/
}
