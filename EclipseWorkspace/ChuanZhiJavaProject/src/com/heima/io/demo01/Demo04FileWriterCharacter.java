package com.heima.io.demo01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * public void write(int ch)：参数时单个文字对应的数字值
 */
public class Demo04FileWriterCharacter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("file04.txt");
		fw.write(20013);
		fw.close();
	}
}
