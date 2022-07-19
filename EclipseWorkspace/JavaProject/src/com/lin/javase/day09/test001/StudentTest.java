package com.lin.javase.day09.test001;

public class StudentTest {

	public static void main(String[] args) {
		
		//创建学生对象
		Student s = new Student();
		
		//访问学生的属性
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.add);
		System.out.println(s.sex);
		
		//实例变量不能直接采用类名的方式访问
		//System.out.println(Student.no);
		
		s.no = 10;
		s.name = "张三";
		
		
	}

}
