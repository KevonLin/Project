package com.heima.io.demo01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * ����Ч����ʵ��
 * ���з�
 * 
 * Windows���з���\r\n �����ַ��� \r   \n
 * macOS���з���������\r��������\n
 * Linux�еĻ��з�ʱ��\n
 */
public class Demo03FileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("file03.txt");
		fw.write("A");
		fw.write("\r\n");
		fw.write("B\r\n");
		fw.write("C");
		fw.close();
		
	}
}
