package com.heima.io.demo03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * BufferedWriter�����ṩһ�����еķ���
 * public void newLine()���Զ����ݲ���ϵͳд��
 */
public class Demo02NewLine {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("file09.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hello");
		bw.newLine();
		bw.write("World");
		bw.close();

	}
}
