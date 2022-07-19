package com.heima.io.demo01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 换行效果的实现
 * 换行符
 * 
 * Windows换行符：\r\n 两个字符： \r   \n
 * macOS换行符：早期是\r，现在是\n
 * Linux中的换行符时：\n
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
