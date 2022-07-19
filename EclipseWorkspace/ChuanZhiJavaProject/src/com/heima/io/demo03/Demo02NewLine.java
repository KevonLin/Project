package com.heima.io.demo03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * BufferedWriter额外提供一个换行的方法
 * public void newLine()：自动根据操作系统写入
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
