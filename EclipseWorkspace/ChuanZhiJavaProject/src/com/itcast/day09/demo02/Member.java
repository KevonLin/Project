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
		// �Ӷ������������ȡһ�����Լ�
		// �����ȡһ�������е��������
		int index = new Random().nextInt(list.size());
		// �����������Ӽ�����ɾ�������ҵõ���ɾ���ĺ�����Լ�
		int delta = list.remove(index);
		// ��ǰ��Ա�Լ������ж���Ǯ
		int balance = super.getBalance();
		// �ٷ������������ȥ
		super.setBalance(balance + delta);
	}
}
