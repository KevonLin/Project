package com.heima.io.demo02;

import java.io.FileReader;
import java.io.IOException;

/*
 * ÿ�ε���read���������᳢�Զ�ȡ��һ�����ַ�
 * ���һ��int����ȷʵ��һ�����ֶ�Ӧ��ASCII������ֱ��ǿ��ת��Ϊchar����
 */
public class Demo02FileReaderWhile {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("file06.txt");
		
		//ÿ�η�������ִ������read����
/*		while (fr.read() != -1) {
			 System.out.println(fr.read());
		}*/
		
		int ch;
		while((ch = fr.read()) != -1) {
			System.out.println((char)ch);
		}
		
		fr.close();
	}
}
