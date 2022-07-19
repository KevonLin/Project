package com.heima.io.demo03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * BufferedReader额外提供了一个方法，可以读取一整行字符串
 * 
 * public String readLine()：读取一阵刚字符串，返回值中不包括换行符
 */
public class Demo04ReadLine {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("file11.txt");
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();// Java
		System.out.println(line);

		line = br.readLine();// Hello
		System.out.println(line);

		line = br.readLine();// World
		System.out.println(line);
		
		line = br.readLine();// null
		System.out.println(line);
		System.out.println(line == null);//true
		
		br.close();
	}
}
