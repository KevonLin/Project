package week4;

import java.util.Scanner;

public class As5 {
	public static void main(String[] args) {
		int point;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("输入学生成绩(整数):");
			point = s.nextInt();
			if (point < 0 || point > 100) {
				System.out.println("输入不合法");
				return;
			}
		}
		switch (point) {
		case 90:
		case 91:
		case 92:
		case 93:
		case 94:
		case 95:
		case 96:
		case 97:
		case 98:
		case 99:
		case 100:
			System.out.println("A");
			break;

		case 81:
		case 82:
		case 83:
		case 84:
		case 85:
		case 86:
		case 87:
		case 88:
		case 89:
			System.out.println("B");
			break;
			
		case 71:
		case 72:
		case 73:
		case 74:
		case 75:
		case 76:
		case 77:
		case 78:
		case 79:
			System.out.println("C");
			break;
			
		case 61:
		case 62:
		case 63:
		case 64:
		case 65:
		case 66:
		case 67:
		case 68:
		case 69:
			System.out.println("D");
			break;
			
		default:
			System.out.println("E");
			break;
		}
	}
}
