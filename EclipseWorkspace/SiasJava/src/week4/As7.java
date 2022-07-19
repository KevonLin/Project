package week4;

import java.util.Arrays;
import java.util.Scanner;

public class As7 {
	public static void main(String[] args) {
		char[] num = new char[0];
		String sNum;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("输入要判断的回文数:");
			sNum = s.next();
//			if (sNum.length() < 1 || sNum.length() > 5) {
//				System.out.println("不是五位数");
//				return;
//			}
		}
		// 取到一个数组
//		for (int i = sNum.length(); i > 0; i--)
		num = sNum.toCharArray();
		System.out.println(Arrays.toString(num));
//		System.out.println(num.length);
		// 比较
		int j = 0, k = num.length-1;
		while (j < k && num[j] == num[k]) {
//			System.out.println("j=" +j);
//			System.out.println("k=" +k);
//			
//			System.out.println("num[j]" +num[j]);
//			System.out.println("num[k]" +num[k]);
			j++;
			k--;
		}

		if (j < k)
			System.out.println("不是回文数");
		else
			System.out.println("是回文数");
	}
}
