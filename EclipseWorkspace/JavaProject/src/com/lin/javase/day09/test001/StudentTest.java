package com.lin.javase.day09.test001;

public class StudentTest {

	public static void main(String[] args) {
		
		//����ѧ������
		Student s = new Student();
		
		//����ѧ��������
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.add);
		System.out.println(s.sex);
		
		//ʵ����������ֱ�Ӳ��������ķ�ʽ����
		//System.out.println(Student.no);
		
		s.no = 10;
		s.name = "����";
		
		
	}

}
