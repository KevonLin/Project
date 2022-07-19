package com.lin.javase.day10.test004;

/**
 * “this.”用来区分局部变量和实例变量的时候不能省略
 * @author Lin
 *
 */
//用户类
public class User {


	//属性
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//构造函数
	//setter and getter
	/*
	 	public void setId(int a) {
		this.id = a;
	}*/
	
	/*
	public void setId(int id) {
		this.id = id;
	}
	*/
	
	public User(int id,String name){
		this.id = id;
		this.name = name;
	}

}
