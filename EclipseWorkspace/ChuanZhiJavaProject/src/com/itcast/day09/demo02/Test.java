package com.itcast.day09.demo02;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Host host = new Host("群主", 100);

		Member one = new Member("成员A", 0);
		Member two = new Member("成员B", 0);
		Member three = new Member("成员C", 0);
		
		host.show();
		one.show();
		two.show();
		three.show();
		System.out.println("--------------------");
		
		ArrayList<Integer> redList = host.send(20, 3);
		//三个普通成员收红包
		one.receive(redList);
		two.receive(redList);
		three.receive(redList);
		
		host.show();
		one.show();
		two.show();
		three.show();
	}
}
