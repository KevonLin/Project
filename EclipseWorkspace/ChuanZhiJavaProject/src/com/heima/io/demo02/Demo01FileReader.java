package com.heima.io.demo02;

import java.io.FileReader;
import java.io.IOException;

/*
 * 1.导包
 * import java.io.FileReader;
 * 
 * 2.创建，构造方法
 * public FileReader(String fileName)：参数字符串时文件的路径名称
 * FileReader fw = new FileReader(file01.txt");
 * 指定文件不存在，报错
 * 
 * 3.使用,成员方法
 * 写数据：public int read()：读取下一个字符，得到相应的ASCII或Unicode
 * 关闭流：public void close()：关闭，释放相关资源。
 * 
 * 总结：创、读、关
 */
public class Demo01FileReader {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("file06.txt");
		int ch = fr.read();
		System.out.println(ch);
		
		ch = fr.read();
		System.out.println(ch);
		
		ch = fr.read();
		System.out.println(ch);
		
		ch = fr.read();
		System.out.println(ch);//-1
		
		ch = fr.read();
		System.out.println(ch);//没有更多字符
		
		fr.close();
	}
}
