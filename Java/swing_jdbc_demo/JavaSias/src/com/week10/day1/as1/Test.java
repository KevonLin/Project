package com.week10.day1.as1;

import java.util.Scanner;

public class Test {

	TooHigh eh = new TooHigh("̫����");
	TooHigh el = new TooHigh("̫С��");

	public void getScore(int x) throws TooHigh, TooLow {
		if (x < 0) {
			System.out.println(el.getMessage());
		}
		if (x > 100) {
			System.out.println(eh.getMessage());
		}
	}

	public static void main(String[] args) {

		try {
			System.out.println("����һ����");
			Scanner s = new Scanner(System.in);
			int score = s.nextInt();
			new Test().getScore(score);
		} catch (TooHigh e) {
			e.printStackTrace();
		} catch (TooLow e) {
			e.printStackTrace();
		} catch (Exception e) {
		}
	}
}