package com.lin.javase.day09.test004;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		//˽�����Բ������ⲿֱ�ӷ��ʣ�����Ƿ�װ
		//c.id = 410;
		
		//������ڱ����ֻ��ͨ��set��get�������з���
		//set������get����ִ�й����п��Խ��а�ȫ���ˡ�
		c.setId(100);
		c.setName("zhangsan");
		c.setAge(500);
		c.setAdd("֣����");
		
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getAdd());
		
	}
}
