package week4;

import java.util.Arrays;
import java.util.Scanner;

public class As7 {
	public static void main(String[] args) {
		char[] num = new char[0];
		String sNum;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("����Ҫ�жϵĻ�����:");
			sNum = s.next();
//			if (sNum.length() < 1 || sNum.length() > 5) {
//				System.out.println("������λ��");
//				return;
//			}
		}
		// ȡ��һ������
//		for (int i = sNum.length(); i > 0; i--)
		num = sNum.toCharArray();
		System.out.println(Arrays.toString(num));
//		System.out.println(num.length);
		// �Ƚ�
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
			System.out.println("���ǻ�����");
		else
			System.out.println("�ǻ�����");
	}
}
