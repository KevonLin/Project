package com.lin.javase.day09.test005;

public class User {
	
	public User(){
		System.out.println("User's Default Consrtuctor Invoke!");
	}
	 
	
	//�в����Ĺ��췽��
	public User(int i) {
		System.out.println("����int���Ͳ����Ĺ�����");
	}
	
	//�в����Ĺ��췽��
	public User(String name) {
		System.out.println("����String���Ͳ����Ĺ�����");
	}
	
	//�в����Ĺ��췽��
	public User(int i,String name) {
		System.out.println("����int,String���Ͳ����Ĺ�����");
	}
	

}