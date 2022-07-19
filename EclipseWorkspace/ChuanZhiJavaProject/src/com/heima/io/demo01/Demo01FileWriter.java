package com.heima.io.demo01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 如果希望将数据写到“纯文本”文件中，可以是使用FileWriter类
 * 
 * 1.导包
 * import java.io.FileWriter;
 * 
 * 2.创建，构造方法
 * public FileWriter(String fileName)：参数字符串时文件的路径名称
 * FileWriter fw = new FileWriter(file01.txt");
 * 文件扩展名只能决定默认用什么软件打开文件，不能决定其内容。
 * 
 * 3.使用,成员方法
 * 写数据：public void write(String str)：参数就是要写到文件中的字符串
 * 关闭流：public void close()：关闭，释放相关资源。
 * 
 * 总结：创、写、关
 * 
 * 注意事项：
 * 1.最后调用close方法进行关闭
 * 2.创建提示异常，添加throw
 */
public class Demo01FileWriter {

	public static void main(String[] args) throws IOException {
		
		//1.创建FileWriter对象
		FileWriter fw = new FileWriter("file01.txt");
		
		//2.调用write方法写数据
		fw.write("Hello World!");
		
		//3.调用close方法关闭流
		fw.close();
	}
}
