package week4;

import java.util.Scanner;

public class As4_1 {
	public static void main(String[] args) {
		int x, y, z, tmp = 0;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("�����1����(����):");
			x = s.nextInt();
			System.out.println("�����2����(����):");
			y = s.nextInt();
			System.out.println("�����3����(����):");
			z = s.nextInt();
		}
		if (x < y)
			tmp = y;
		if (tmp < z)
			tmp = z;
		System.out.println("���ֵΪ:" + tmp);
	}
}
