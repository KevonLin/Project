package week4;

import java.util.Scanner;

public class As1 {
	public static void main(String[] args) {
		double db;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("����һ����������");
			db = s.nextDouble();
			System.out.println(db + "�����������ǣ�" + (int)db);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
