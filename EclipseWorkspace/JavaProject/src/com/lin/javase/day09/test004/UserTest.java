package com.lin.javase.day09.test004;

public class UserTest {

	public static void main(String[] args) {
		
		//����User����
		User user = new User();
		
		//���뱨��age����˽�л����ⲿ������ֱ�ӷ���
		//age���Էǳ���ȫ������̫��ȫ��
		//System.out.println(user.age);
		
		//�޸�
		user.setAge(100);
		
		//��ȡ
		System.out.println(user.getAge());
	}

}
