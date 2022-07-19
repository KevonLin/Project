package week4;

import java.util.Scanner;

public class As1 {
	public static void main(String[] args) {
		double db;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("输入一个浮点数：");
			db = s.nextDouble();
			System.out.println(db + "的整数部分是：" + (int)db);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
