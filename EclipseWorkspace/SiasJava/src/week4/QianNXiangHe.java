package week4;

import java.util.Scanner;

public class QianNXiangHe {

	public static void main(String[] args) {
		int n, sum = 0;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("����ǰn��ͣ�");
			if (s.hasNext()) {
				n = s.nextInt();
				sum += n;
			}
		}
		System.out.println("SUM:" + sum);

		/*
		 * try (Scanner scanner = new Scanner(System.in)) { System.out.print("����һ��������");
		 * String num = scanner.nextInt()+""; // ����������תΪ�ַ��� String[] nums = new String
		 * [num.length()]; for (int i = 0; i < num.length(); i++) { nums[i] =
		 * num.charAt(i)+""; // �����������ת��Ϊ�ַ������� } int sum = 0; for (int i = 0; i <
		 * nums.length; i++) { sum = sum + Integer.parseInt(nums[i]); //
		 * �������ڵ��ַ���ǿתΪ������Ȼ������ӡ� } System.out.println(sum); }
		 */
	}
}
