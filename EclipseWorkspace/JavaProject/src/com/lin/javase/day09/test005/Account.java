package com.lin.javase.day09.test005;

//�˻���
public class Account {

	//�˺�
	private String actno;//ʵ������/����������������ж�������ж�Ӧ��ʵ������
	
	//���
	private double balance;
	
	//�޲���������
	public Account() {
		//��ʼ��ʵ���������ڴ�ռ�
		//actno = null;
		//balance = 0.0;
	}
	
	public Account(double d) {
		//actno = null;
		balance = d;
	}
	
	public Account(String s,double d) {
		actno = s;
		balance = d;
	}
	
	public Account(String s) {
		actno = s;
		//balance = 0.0;
	}

	public String getActno() {
		return actno;
	}

	public void setActno(String actno) {
		this.actno = actno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
