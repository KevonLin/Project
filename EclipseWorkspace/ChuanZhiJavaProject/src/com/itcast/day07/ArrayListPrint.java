package com.itcast.day07;

import java.util.ArrayList;

/*打印格式
 *{10@ 20@ 30}
 */
public class ArrayListPrint {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("柳岩");
		list.add("赵又廷");
		list.add("赵丽颖");
		System.out.println(list);

		printArrayList(list);
	}

	/*
	 * 定义方法的三要素： 返回值类型：void 方法名称：printArrayList 参数列表：ArrayList
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
