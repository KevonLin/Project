package com.itcast.day07;

import java.util.ArrayList;

public class ArrayListStudent {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		Student one = new Student("赵又廷",27);
		Student two = new Student("赵丽颖",25);
		Student three = new Student("赵本山",45);
		
		list.add(one);
		list.add(two);
		list.add(three);
		
		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			System.out.println("姓名：" + stu.getName() + ",年龄：" + stu.getAge());
		}
	}
}
