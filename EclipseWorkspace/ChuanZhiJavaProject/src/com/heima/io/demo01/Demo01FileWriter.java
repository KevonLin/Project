package com.heima.io.demo01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * ���ϣ��������д�������ı����ļ��У�������ʹ��FileWriter��
 * 
 * 1.����
 * import java.io.FileWriter;
 * 
 * 2.���������췽��
 * public FileWriter(String fileName)�������ַ���ʱ�ļ���·������
 * FileWriter fw = new FileWriter(file01.txt");
 * �ļ���չ��ֻ�ܾ���Ĭ����ʲô������ļ������ܾ��������ݡ�
 * 
 * 3.ʹ��,��Ա����
 * д���ݣ�public void write(String str)����������Ҫд���ļ��е��ַ���
 * �ر�����public void close()���رգ��ͷ������Դ��
 * 
 * �ܽ᣺����д����
 * 
 * ע�����
 * 1.������close�������йر�
 * 2.������ʾ�쳣�����throw
 */
public class Demo01FileWriter {

	public static void main(String[] args) throws IOException {
		
		//1.����FileWriter����
		FileWriter fw = new FileWriter("file01.txt");
		
		//2.����write����д����
		fw.write("Hello World!");
		
		//3.����close�����ر���
		fw.close();
	}
}
