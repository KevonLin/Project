package com.itcast.day07;

import java.util.ArrayList;

public class ArrayListStudent {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		Student one = new Student("����͢",27);
		Student two = new Student("����ӱ",25);
		Student three = new Student("�Ա�ɽ",45);
		
		list.add(one);
		list.add(two);
		list.add(three);
		
		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			System.out.println("������" + stu.getName() + ",���䣺" + stu.getAge());
		}
	}
}
