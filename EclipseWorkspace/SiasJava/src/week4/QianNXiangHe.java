package week4;

import java.util.Scanner;

public class QianNXiangHe {

	public static void main(String[] args) {
		int n, sum = 0;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("计算前n项和：");
			if (s.hasNext()) {
				n = s.nextInt();
				sum += n;
			}
		}
		System.out.println("SUM:" + sum);

		/*
		 * try (Scanner scanner = new Scanner(System.in)) { System.out.print("输入一个整数：");
		 * String num = scanner.nextInt()+""; // 输入整数，转为字符串 String[] nums = new String
		 * [num.length()]; for (int i = 0; i < num.length(); i++) { nums[i] =
		 * num.charAt(i)+""; // 将输入的整数转化为字符串数组 } int sum = 0; for (int i = 0; i <
		 * nums.length; i++) { sum = sum + Integer.parseInt(nums[i]); //
		 * 将数组内的字符串强转为整数，然后再相加。 } System.out.println(sum); }
		 */
	}
}
