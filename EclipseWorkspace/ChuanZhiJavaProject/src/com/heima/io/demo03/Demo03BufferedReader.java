package com.heima.io.demo03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * BufferedReaderҲ��һ������Ϊ8192��char[]�ַ����飬����������
 */
public class Demo03BufferedReader {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("file06.txt");
		BufferedReader br = new BufferedReader(fr);
		int ch;
		while((ch = br.read()) != -1) {
			System.out.println((char)ch);
		}
		
		br.close();
	}
}
