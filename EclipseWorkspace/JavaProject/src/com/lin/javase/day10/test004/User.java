package com.lin.javase.day10.test004;

/**
 * ��this.���������־ֲ�������ʵ��������ʱ����ʡ��
 * @author Lin
 *
 */
//�û���
public class User {


	//����
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
	
	//���캯��
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
