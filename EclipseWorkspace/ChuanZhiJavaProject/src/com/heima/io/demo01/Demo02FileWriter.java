package com.heima.io.demo01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * ��ʹ��FileWriter��ʱ��
 * 
 * 1.���ָ�����ļ������ڣ����Զ��������ļ�
 * 2.ָ���ļ����ڣ�����д��
 * 3.�����ϣ������д�룬׷��д�룬Ҫ��������ʽ�Ĺ��췽��
 * 
 * publi cFileWriter(String dileName, boolean append)���ڶ������������true����ô��׷��д��
 */
public class Demo02FileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("file02.txt", true); // ��

		fw.write("Hi");// д

		fw.close();// ��
	}
}
