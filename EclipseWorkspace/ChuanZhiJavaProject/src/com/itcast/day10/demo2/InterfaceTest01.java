package com.itcast.day10.demo2;

/*
 * ����ͨ���ӿ�ʵ����Ķ��������ýӿ��еľ�̬����
 * 
 */
public class InterfaceTest01 {

	public static void main(String[] args) {
		// ����ʵ�������
		InterfaceStaticImpl impl = new InterfaceStaticImpl();
		// ����д��
		// impl.methodStatic();
		// ֱ��ͨ���ӿ����Ƶ��þ�̬����
		InterfaceStatic.methodStatic();
	}
}
