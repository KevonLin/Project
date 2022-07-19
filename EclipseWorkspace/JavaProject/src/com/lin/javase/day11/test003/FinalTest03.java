package com.lin.javase.day11.test003;

public class FinalTest03 {

	public static void main(String[] args) {

		//创建用户对象
		User u = new User(100);//User u = 0x1234
		
		//再创建一个新的User对象
		//程序执行到此处表示以上对象变成垃圾数据，等待处理
		u = new User(200);//User u = 0x2356
		
		//创建用户对象
		final User user = new User(30);
		System.out.println(user.id);
		//final修饰的引用一旦只想某个对象之后不能再只想其他对象，被指向对象不能被垃圾回收器回收
		//user = new User(50);
		
		user.id = 50;//final修饰的引用虽然指向某个对象之后不能指向其他对象，但是被指向对象内部的内存是可以修改的
		System.out.println(user.id);
	}

}
