package com.itcast.day07;

import java.util.ArrayList;
import java.util.Random;

/*
 * 存入20个随机数字，筛选偶数元素，放到小集合中
 * 要求使用自定义的方法来实现筛选
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
		System.out.println("偶数一共有：" + resultList.size() +"个");

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
