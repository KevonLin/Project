package com.itcast.day08;

/*
 * �ַ����Ľ�ȡ������
 * 
 * public String substring(int index)����ȡ�Ӳ���λ��һֱ���ַ���ĩβ���������ַ���
 * public String substring(int begin,int end)����ȡ��begin��ʼ��һֱ��end�������м���ַ�����
 * ��ע��[begin,end),���������ǣ��������ұߡ�
 */

public class SubString {

	public static void main(String[] args) {
		String str1 = "HelloWorld";
		String str2 = str1.substring(5);
		System.out.println(str1);
		System.out.println(str2);

		String str3 = str1.substring(4, 7);
		System.out.println(str3);
		
		/*
		 * �ַ�������û�иı�
		 * Hello�ĺ�Java�ĵ�ַ��ͬ
		 * strA�б���ĵ�ַ��ͬ
		 */
		
		String strA = "Hello";
		System.out.println(strA);
		strA = "Java";
		System.out.println(strA);
	}
}
