package com.lin.javase.day11.test003;

public class FinalTest03 {

	public static void main(String[] args) {

		//�����û�����
		User u = new User(100);//User u = 0x1234
		
		//�ٴ���һ���µ�User����
		//����ִ�е��˴���ʾ���϶������������ݣ��ȴ�����
		u = new User(200);//User u = 0x2356
		
		//�����û�����
		final User user = new User(30);
		System.out.println(user.id);
		//final���ε�����һ��ֻ��ĳ������֮������ֻ���������󣬱�ָ������ܱ���������������
		//user = new User(50);
		
		user.id = 50;//final���ε�������Ȼָ��ĳ������֮����ָ���������󣬵��Ǳ�ָ������ڲ����ڴ��ǿ����޸ĵ�
		System.out.println(user.id);
	}

}
