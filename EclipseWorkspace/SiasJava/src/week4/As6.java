package week4;

import java.util.Scanner;

public class As6 {
	public static void main(String[] args) {
		int year, mon;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("���:");
			year = s.nextInt();
			System.out.println("�·�:");
			mon = s.nextInt();
		}
		switch (mon) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31��");
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30��");
			break;

		case 2:
			switch (year % 4) {
			case 0:
				System.out.println("29��");
				break;

			default:
				System.out.println("28��");
				break;
			}

		}
	}
}
