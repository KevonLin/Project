package com.itcast.day08;

/*
 * String����ת����صĳ��÷���
 * 
 * public char[] toCharArray()
 * ����ǰ�ַ�����ֳ��ַ�������Ϊ����ֵ
 * public byte[] getBytes()
 * ��õ�ǰ�ַ����ײ���ֽ�����
 * public String replace(CharSequence odlString, CharSequence newString)
 * �����г��ֵ�Դ�ַ����滻Ϊ���ַ���
 * ��ע��CharSequence��˼�ǿ��Խ����ַ�������
 */
public class StringConvert {

	public static void main(String[] args) {
		char[] chars = "Hello".toCharArray();
		System.out.println(chars.length);
		System.out.println(chars);

		System.out.println("==========");

		byte[] bytes = "abc".getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}

		System.out.println("==========");

		String str1 = "How do you do!";
		String str2 = str1.replace("o", "*");
		System.out.println(str1);
		System.out.println(str2);

	}
}
