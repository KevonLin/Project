package com.itcast.day09.demo02;

public class User {

	private String name;
	private int balance;

	public void show() {
		System.out.println("Œ“Ω–£∫" + name + "£¨Œ“”–£∫£§" + balance);
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, int balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
