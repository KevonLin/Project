package com.itcast.day08;
/*
 * �ַ����ص�
 * 1.�ַ��������ݲ��ɱ䡣
 * 2.�ַ������Թ���ʹ�á�
 * 3.�ַ���Ч�����൱����char[]�ַ����飬���ײ�ԭ����byte[]�ֽ����顣
 * 
 * �����ַ����ĳ���3+1�ַ�ʽ��
 * ���ֹ��췽����
 * public String()������һ���հ��ַ������������κ����ݡ�
 * public String(char[] array)�������ַ���������ݣ�������Ӧ���ַ�����
 * public String(byte[] array)�������ַ���������ݣ�������Ӧ���ַ�����
 * һ��ֱ�Ӵ�����
 * String str = "hello";
 * 
 * ֱ��д��˫���ţ������ַ�������
 */
public class StringTest01 {

	public static void main(String[] args) {
		//ʹ�ÿղι���
		String str1 = new String();
		System.out.println("��һ���ַ����ǣ�" + str1);
		
		//�����ַ����鴴���ַ���
		char[] charArray = {'A', 'B', 'C'};
		String str2 = new String(charArray);
		System.out.println("�ڶ����ַ�����" + str2);
		
		//�����ֽ����鴴���ַ���
		byte[] byteArray = {97, 98, 99};
		String str3 = new String(byteArray);
		System.out.println(str3);
		
		//ֱ�Ӵ���
		String str4 = "Hello";
		System.out.println(str4);
	}
}
