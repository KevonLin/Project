package com.itcast.day08;

import java.util.Scanner;

/*
 * ����һ���ַ�����ͳ�Ƹ����ַ����ֵĴ���
 * ���ࣺ��д��Сд�����֡�����
 * 
 * ˼·:
 * Scanner
 * str = sc.newxt();
 * �����ĸ�����ͳ�ƴ���
 * ���ַ�һ����һ���ּ�飬String-->char[]������toCharArray()
 * ����char[]�ַ����飬�Ե�ǰ�ַ�����������жϣ��������ĸ�����++����
 * ��ӡ����ĸ��������ֱ�����ĸ��ַ����ִ���
 */
public class StringCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String input = sc.next();
		
		int Upper = 0;
		int Lower = 0;
		int Number = 0;
		int Other = 0;
		
		//�������������
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if('A' <= c && c <= 'Z') {
				Upper ++;
			}else if('a' <= c && c <= 'z') {
				Lower ++;
			}else if('0' <= c && c <= '9') {
				Number ++;
			}else {
				Other ++;
			}
		}
		System.out.println("��д��ĸ�У�" + Upper + "��");
		System.out.println("Сд��ĸ�У�" + Lower + "��");
		System.out.println("�����ַ��У�" + Number + "��");
		System.out.println("�����ַ��У�" + Other + "��");
	}
}
