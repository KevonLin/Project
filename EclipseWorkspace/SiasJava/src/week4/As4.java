package week4;

//import java.util.Arrays;
//import java.util.Iterator;
import java.util.Scanner;

public class As4 {
	public static void main(String[] args) {

		int[] x = new int[4];
//		int ct = 1;
		System.out.println("�Ƚ���������С");
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("������������");
			for (int i = 1; i <= 3; i++) {
				System.out.println("��" + i + "������");
				x[i] = s.nextInt();
			}
		}
		System.out.println("��������������ֱ���:");
		for (int i = 1; i <= 3; i++)
			System.out.println(x[i] + " ");
		x = Sort(x);
		System.out.println("������Ϊ:");
		for (int i = 1; i <= 3; i++)
			System.out.println(x[i] + " ");
//		System.out.println(Arrays.toString(x));
		System.out.println("���ֵΪ��" + x[1]);
	}

	private static int[] Sort(int[] x) {
		int i = 1;
		while (i < x.length) {
			if (x[i] < x[i + 1]) {
				x[0] = x[i];
				x[i + 1] = x[i];
				x[i] = x[0];
			}
			i++;
		}
		return x;
	}
}
