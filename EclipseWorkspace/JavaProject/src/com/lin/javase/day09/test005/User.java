package com.lin.javase.day09.test005;

public class User {
	
	public User(){
		System.out.println("User's Default Consrtuctor Invoke!");
	}
	 
	
	//有参数的构造方法
	public User(int i) {
		System.out.println("带有int类型参数的构造器");
	}
	
	//有参数的构造方法
	public User(String name) {
		System.out.println("带有String类型参数的构造器");
	}
	
	//有参数的构造方法
	public User(int i,String name) {
		System.out.println("带有int,String类型参数的构造器");
	}
	

}
