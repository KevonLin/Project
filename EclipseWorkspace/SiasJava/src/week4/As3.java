package week4;

import java.util.Scanner;

public class As3 {
	static double pai = 3.14;

	public static void main(String[] args) {
		double r, h, v;
		System.out.println("==计算圆柱体积==");
		System.out.println("输入半径：");
		try (Scanner s = new Scanner(System.in)) {
			r = s.nextInt();
			System.out.println("输入高：");
			h = s.nextInt();
			if(r<=0||h<=0)
			{
				System.out.println("半径或高不能小于等于0");
				return;
			}
			v = pai * r * r * h;
			System.out.println("体积：" + v);
		}
	}
}