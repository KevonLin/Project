package com.heima.io.demo02;

import java.io.FileReader;
import java.io.IOException;

/*
 * 每次调用read方法，都会尝试读取下一个新字符
 * 如果一个int变量确实是一个文字对应的ASCII，可以直接强制转换为char类型
 */
public class Demo02FileReaderWhile {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("file06.txt");
		
		//每次方法都会执行两次read方法
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
