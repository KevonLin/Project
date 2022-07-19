package com.heima.io.demo01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter中写数据的write有物种重载形式：
 * 
 * public void write(int ch)：参数时单个文字对应的数字
 * public void write(String str)：写一个完整的字符串
 * public void write(String str, int offset, int count)：写字符串中的一部分内容
 * public void write(char[] array)：写一个完整的字符数组
 * public void write(char[] array, int offset, int count)：写字符数组中的一部分内容
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
