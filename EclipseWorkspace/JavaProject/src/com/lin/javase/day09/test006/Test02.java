package com.lin.javase.day09.test006;


/*
 *	���ۣ�
 *		�������õ�ʱ����Ƶ��������ݵ����⣬���ݵ�ʱ��Java֮��ѭһ���﷨���ƣ�
 *		�����б���ġ�ֵ�����ݹ�ȥ�ˣ�ֻ������ʱ�����ֵ��һ������ֵ����ʱ����һ��
 *		������ڴ��ַ��
 */
public class Test02 {

	public static void main(String[] args) {
	
		User u = new User(20);
		//����u��add������ʱ��ʵ���ϴ��ݵ���u�����б����ֵ��ֻ�������ֵ��һ��Java������ڴ��ַ��
		add(u);//��ͬ�ڣ�add(0x1234);
		System.out.println("main-->" + u.age);
	}

	public static void add(User u) {
		u.age++;
		System.out.println("add-->" + u.age);
	}

}
class User{
	
	//ʵ������
	int age;
	
	//���췽��
	public User(int i) {
		age  = i;
	}
}