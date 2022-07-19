package com.lin.javase.day09.test004;

public class UserTest {

	public static void main(String[] args) {
		
		//创建User对象
		User user = new User();
		
		//编译报错，age数据私有化，外部程序不能直接访问
		//age属性非常安全，但是太安全了
		//System.out.println(user.age);
		
		//修改
		user.setAge(100);
		
		//读取
		System.out.println(user.getAge());
	}

}
