package com.itcast.day10.demo1;

/*
 * public default ����ֵ���� ��������(�����б�){
 * 		������
 * }
 * 
 * �ӿ��е�Ĭ�Ϸ������Խ���ӿ�����������
 */
public interface MyInterfaceDefault {
	
	public abstract void methodAbs();
	
//	public abstract void methodAvs2();
	
	public default void methodDefault() {
		System.out.println("����ӵ�Ĭ�Ϸ���");
	}

}
