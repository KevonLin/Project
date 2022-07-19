package com.heima.io.demo03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * BufferedWriter和FileWriter差不多，属于字符输出流
 * 区别：BufferedWriter有一个长度8192char[]字符数组，当作缓冲区使用
 * 每次写数据时，不断地像缓冲数组中添加字符
 * 缓冲区满了就会同意写道硬盘
 * 如果没有写满等待下一次写入
 * 如果最终关闭流数组仍然没满，那么剩余有效部分也会写到磁盘文件
 * 
 * 使用：
 * 1.创建一个FileWriter
 * 2.将普通的FileWriter包装成为缓冲BUfferedWriter，用构造方法
 * 3.使用方法和FileWriter基本一样
 * 
 * 构造方法：
 * public BufferedWriter(FileWriter fw)：参数是一个普通的FileWriter对象
 */
public class Demo01BufferedWriter {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("file08.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		// bw的使用和fw基本没有区别
		bw.write("Hello");
		// 关闭流，不需要关闭fw
		bw.close();
	}
}
