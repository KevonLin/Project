package com.itcast.day09.demo02;

/**
 * 群主类
 */
import java.util.ArrayList;

public class Host extends User {

	public Host() {
		super();
	}

	public Host(String name, int balance) {
		super(name, balance);
	}

	public ArrayList<Integer> send(int totalMoney, int count) {
		// 首先需要一个集合，用来存储若干个红包的金额
		ArrayList<Integer> redList = new ArrayList<>();

		// 群主当前余额
		int balance = super.getBalance();
		if (totalMoney > balance) {
			System.out.println("余额不足!");
			return redList;
		}

		// 扣钱，重新设置余额
		super.setBalance(balance - totalMoney);
		
		//发红包，平均拆分count份
		int avg = totalMoney / count;
		int mod = totalMoney % count;//甩下的零头
		//剩下的包在最后一个
		//把红包一个一个放在集合中
		for (int i = 0; i < count - 1; i++) {
			redList.add(avg);
		}
		//最后一个红包
		int last = avg + mod;
		redList.add(last);
		
		return redList;
	}
}
