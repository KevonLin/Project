package com.itcast.day09.demo02;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Host host = new Host("Ⱥ��", 100);

		Member one = new Member("��ԱA", 0);
		Member two = new Member("��ԱB", 0);
		Member three = new Member("��ԱC", 0);
		
		host.show();
		one.show();
		two.show();
		three.show();
		System.out.println("--------------------");
		
		ArrayList<Integer> redList = host.send(20, 3);
		//������ͨ��Ա�պ��
		one.receive(redList);
		two.receive(redList);
		three.receive(redList);
		
		host.show();
		one.show();
		two.show();
		three.show();
	}
}
