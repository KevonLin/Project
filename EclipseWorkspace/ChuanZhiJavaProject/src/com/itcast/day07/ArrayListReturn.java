package com.itcast.day07;

import java.util.ArrayList;
import java.util.Random;

/*
 * ����20��������֣�ɸѡż��Ԫ�أ��ŵ�С������
 * Ҫ��ʹ���Զ���ķ�����ʵ��ɸѡ
 */
public class ArrayListReturn {

	public static void main(String[] args) {

		Random r = new Random();
		ArrayList<Integer> bigList = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			bigList.add(r.nextInt(100) + 1);
		}
		ArrayList<Integer> resultList = getSmallList(bigList);
		for (int i = 0; i < resultList.size(); i++) {
			System.out.println(resultList.get(i));
		}
		System.out.println("ż��һ���У�" + resultList.size() +"��");

	}

	private static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {

		ArrayList<Integer> smallList = new ArrayList<>();
		for (int i = 0; i < bigList.size(); i++) {
			int num = bigList.get(i);
			if (num % 2 == 0)
				smallList.add(num);
		}
		return smallList;
	}

}
