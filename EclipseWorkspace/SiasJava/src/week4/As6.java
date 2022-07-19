package week4;

import java.util.Scanner;

public class As6 {
	public static void main(String[] args) {
		int year, mon;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("年份:");
			year = s.nextInt();
			System.out.println("月份:");
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
			System.out.println("31天");
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30天");
			break;

		case 2:
			switch (year % 4) {
			case 0:
				System.out.println("29天");
				break;

			default:
				System.out.println("28天");
				break;
			}

		}
	}
}
