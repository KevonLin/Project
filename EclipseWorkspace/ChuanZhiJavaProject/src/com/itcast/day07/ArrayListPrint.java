package com.itcast.day07;

import java.util.ArrayList;

/*��ӡ��ʽ
 *{10@ 20@ 30}
 */
public class ArrayListPrint {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("����");
		list.add("����͢");
		list.add("����ӱ");
		System.out.println(list);

		printArrayList(list);
	}

	/*
	 * ���巽������Ҫ�أ� ����ֵ���ͣ�void �������ƣ�printArrayList �����б�ArrayList
	 */
	public static void printArrayList(ArrayList<String> list) {
		System.out.print("{");
		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			if (i == list.size() - 1) {
				System.out.print(name + "}");
			} else {
				System.out.print(name + "@ ");
			}

		}

	}

}
