package com.heima.io.demo02;

import java.io.FileReader;
import java.io.IOException;

/*
 * 1.����
 * import java.io.FileReader;
 * 
 * 2.���������췽��
 * public FileReader(String fileName)�������ַ���ʱ�ļ���·������
 * FileReader fw = new FileReader(file01.txt");
 * ָ���ļ������ڣ�����
 * 
 * 3.ʹ��,��Ա����
 * д���ݣ�public int read()����ȡ��һ���ַ����õ���Ӧ��ASCII��Unicode
 * �ر�����public void close()���رգ��ͷ������Դ��
 * 
 * �ܽ᣺����������
 */
public class Demo01FileReader {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("file06.txt");
		int ch = fr.read();
		System.out.println(ch);
		
		ch = fr.read();
		System.out.println(ch);
		
		ch = fr.read();
		System.out.println(ch);
		
		ch = fr.read();
		System.out.println(ch);//-1
		
		ch = fr.read();
		System.out.println(ch);//û�и����ַ�
		
		fr.close();
	}
}
