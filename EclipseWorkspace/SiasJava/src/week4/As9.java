package week4;

import java.util.Scanner;

public class As9 {
	public static void main(String[] args) {
		int num;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("�����ж���ȫ��:");
			num = s.nextInt();
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("����ȫ��");
				return;
			}
		}
		System.out.println("������ȫ��");
	}
}
