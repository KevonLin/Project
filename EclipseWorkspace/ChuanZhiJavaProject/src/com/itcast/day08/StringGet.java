package com.itcast.day08;

/*
 * String�����ȡ��صĳ��÷����֣�
 * 
 * public int length()����ȡ�ַ����к��е��ַ��ĸ������õ��ַ�������
 * public String concat(String str)������ǰ���ַ����Ͳ����ַ���ƴ�ӳ�Ϊ����ֵ�µ��ַ���
 * public char charAt(int index):��ȡָ������λ�õĵ����ַ�����������0��ʼ��
 * public int indexOf(String str)�����Ҳ����ַ����ڱ��ַ������״γ��ֵ�����λ�ã����û�з���-1ֵ
 * 
 */
public class StringGet {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		System.out.println("str1�ĳ���Ϊ��" + str1.length());
		System.out.println(str1.concat(str2));
		
		System.out.println(str1.charAt(0));
		System.out.println(str2.indexOf('o')+1);
		
		String original = "Hello World";
		System.out.println(original.indexOf(' '));
	}
}
