package week4;

import java.util.Scanner;

public class As2 {
	public static void main(String[] args) {
		double cs = 0.0, bcs = -1.0, result = 0.0;
		System.out.println("输入除数：");
		try (Scanner s = new Scanner(System.in)) {
			cs = s.nextInt();
			System.out.println("输入除数：");
			do {
				if (bcs == 0)
					System.out.println("除数不能为零,请重新输入：");
				bcs = s.nextInt();
			} while (bcs == 0);
		}
		result = cs / bcs;
		System.out.println(cs + "/" + bcs + "=" + result);
	}
}
