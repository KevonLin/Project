package com.heima.io.demo03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * BufferedWriter��FileWriter��࣬�����ַ������
 * ����BufferedWriter��һ������8192char[]�ַ����飬����������ʹ��
 * ÿ��д����ʱ�����ϵ��񻺳�����������ַ�
 * ���������˾ͻ�ͬ��д��Ӳ��
 * ���û��д���ȴ���һ��д��
 * ������չر���������Ȼû������ôʣ����Ч����Ҳ��д�������ļ�
 * 
 * ʹ�ã�
 * 1.����һ��FileWriter
 * 2.����ͨ��FileWriter��װ��Ϊ����BUfferedWriter���ù��췽��
 * 3.ʹ�÷�����FileWriter����һ��
 * 
 * ���췽����
 * public BufferedWriter(FileWriter fw)��������һ����ͨ��FileWriter����
 */
public class Demo01BufferedWriter {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("file08.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		// bw��ʹ�ú�fw����û������
		bw.write("Hello");
		// �ر���������Ҫ�ر�fw
		bw.close();
	}
}
