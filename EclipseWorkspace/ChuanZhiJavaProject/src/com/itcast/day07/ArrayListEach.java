package com.itcast.day07;

import java.util.ArrayList;

public class ArrayListEach {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("ÁøÑÒ");
		list.add("ÕÔÓÖÍ¢");
		list.add("ÕÔÀöÓ±");
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
