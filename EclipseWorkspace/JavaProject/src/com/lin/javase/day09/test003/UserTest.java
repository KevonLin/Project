package com.lin.javase.day09.test003;

/*
 * 用户测试类
 * 
 * 對於程序員來説
 * User类中的age属性在外部程序中可以随意访问
 * 一个User对象表示一个用户，该用户的年龄不可能为复数
 * 
 * 
 * 面向对象包括三大特征
 * -封装
 * -继承
 * -多态
 * 
 * 当前讲解封装机制。为什么要封装，封装有什么好处？
 * 封装的好处：
 * 		1、封装之后，对于事物来说，只能看到简单的一面，看不到复杂的一面
 * 		复杂性封装，对外提供简单的操作入口。照相机就是一个封装的按里。
 * 		照相机的原理很复杂，但是对于使用者来说很便捷。
 * 
 * 		2、封装之后才形成真正的“对象”，真正的“独立提”
 * 
 * 		3、封装意味着以后的程序可以重复使用，并且适应性较强，任何场合都可以使用
 * 
 * 		4、封装之后，提高了安全性。
 */
public class UserTest {

	public static void main(String[] args) {

		// 创建User对象
		User user = new User();

		// 访问age
		// 读取年龄之[get]
		System.out.println("该用户年龄：" + user.age);

		// 修改年龄之【set】
		user.age = 20;
		
		// 读取年龄值【get】
		System.out.println("该用户年龄：" + user.age);
		
		// 修改年龄值
		// 这里的age属性显然是完全暴露给外部程序的，对于程序员来说可以操作User
		user.age = -100;
		
		// 读取该年龄值
		System.out.println("该用户年龄：" + user.age);
	}

}
