package com.itcast.day09.demo02;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(String name, int balance) {
		super(name, balance);
		// TODO Auto-generated constructor stub
	}

	public void receive(ArrayList<Integer> list) {
		// 从多个红包中随机抽取一个给自己
		// 随机获取一个集合中的索引编号
		int index = new Random().nextInt(list.size());
		// 根据索引，从集合中删除，并且得到被删除的红包给自己
		int delta = list.remove(index);
		// 当前成员自己本来有多少钱
		int balance = super.getBalance();
		// 假发并且重新设回去
		super.setBalance(balance + delta);
	}
}
