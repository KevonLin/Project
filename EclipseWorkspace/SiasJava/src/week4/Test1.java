package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
	public static void main(String[] args) {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try {
			System.out.println("请输入字符串：");
			str = buf.readLine();
			System.out.println("你输入的字符串是：" + str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		int b = 1;
		int c = 0;
		
		c = b + Integer.valueOf(str).intValue();
		System.out.println("c=" + c);
		System.out.println("==================");
        int x = -1;
        assert x > 0;	//JVM默认禁用断言，只有在命令行加-ea启用断言才有效果
        System.out.println(x);
	}
}
