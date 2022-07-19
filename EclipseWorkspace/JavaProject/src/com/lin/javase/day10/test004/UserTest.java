package com.lin.javase.day10.test004;

public class UserTest {

	public static void main(String[] args) {
		User u1 = new User(100,"zhangsan");
		System.out.println(u1.getId());
		System.out.println(u1.getName());
		
		//ĞŞ¸ÄÃû×Ö
		u1.setName("lisi");
		System.out.println(u1.getName());
		
	}
}
