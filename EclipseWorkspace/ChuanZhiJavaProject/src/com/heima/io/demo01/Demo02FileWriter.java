package com.heima.io.demo01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 在使用FileWriter的时候：
 * 
 * 1.如果指定的文件不存在，会自动创建该文件
 * 2.指定文件存在，覆盖写入
 * 3.如果不希望覆盖写入，追加写入，要用重载形式的构造方法
 * 
 * publi cFileWriter(String dileName, boolean append)：第二个参数如果是true，那么会追加写入
 */
public class Demo02FileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("file02.txt", true); // 创

		fw.write("Hi");// 写

		fw.close();// 关
	}
}
