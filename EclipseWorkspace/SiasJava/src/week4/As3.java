package week4;

import java.util.Scanner;

public class As3 {
	static double pai = 3.14;

	public static void main(String[] args) {
		double r, h, v;
		System.out.println("==����Բ�����==");
		System.out.println("����뾶��");
		try (Scanner s = new Scanner(System.in)) {
			r = s.nextInt();
			System.out.println("����ߣ�");
			h = s.nextInt();
			if(r<=0||h<=0)
			{
				System.out.println("�뾶��߲���С�ڵ���0");
				return;
			}
			v = pai * r * r * h;
			System.out.println("�����" + v);
		}
	}
}