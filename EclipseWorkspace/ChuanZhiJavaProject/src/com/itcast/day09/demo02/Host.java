package com.itcast.day09.demo02;

/**
 * Ⱥ����
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
		// ������Ҫһ�����ϣ������洢���ɸ�����Ľ��
		ArrayList<Integer> redList = new ArrayList<>();

		// Ⱥ����ǰ���
		int balance = super.getBalance();
		if (totalMoney > balance) {
			System.out.println("����!");
			return redList;
		}

		// ��Ǯ�������������
		super.setBalance(balance - totalMoney);
		
		//�������ƽ�����count��
		int avg = totalMoney / count;
		int mod = totalMoney % count;//˦�µ���ͷ
		//ʣ�µİ������һ��
		//�Ѻ��һ��һ�����ڼ�����
		for (int i = 0; i < count - 1; i++) {
			redList.add(avg);
		}
		//���һ�����
		int last = avg + mod;
		redList.add(last);
		
		return redList;
	}
}
