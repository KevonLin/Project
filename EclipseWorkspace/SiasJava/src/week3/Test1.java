package week3;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		double fAvg = 81.29;
		double sAvg;
		int rise = 2;
		sAvg = fAvg + rise;
		System.out.println("第二次平均分："+sAvg);
		rise = (int) (fAvg-2);
		System.out.println("rise："+rise);
		int age = 19;
		String tage = String.valueOf(age);
		char sex = '女';
		String result = tage + sex;
		System.out.println(result);
		String myNumber = "123.56";
		float myFloat = Float.parseFloat(myNumber);
		System.out.println(myFloat);
		System.out.println("请输入：");
		try (Scanner s = new Scanner(System.in)) {
			String str = s.next();
			System.out.println("你输入的是：" + str);
		}
	}
}
