package com.heima.io.demo01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter��д���ݵ�write������������ʽ��
 * 
 * public void write(int ch)������ʱ�������ֶ�Ӧ������
 * public void write(String str)��дһ���������ַ���
 * public void write(String str, int offset, int count)��д�ַ����е�һ��������
 * public void write(char[] array)��дһ���������ַ�����
 * public void write(char[] array, int offset, int count)��д�ַ������е�һ��������
 */
public class Demo05FileWriterOverload {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("file05.txt");
		
		fw.write(48);
		fw.write(65);
		fw.write(97);
		fw.close();
	}
}
