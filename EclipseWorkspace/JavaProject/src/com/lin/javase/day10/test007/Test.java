package com.lin.javase.day10.test007;

/**
 * 什么时候出现空指针异常？
 * 		空引用访问实例相关的数据，实例相关的数据是对象相关的数据
 * 		这些数据在访问的时候，必须有对象的参与，当空引用的时候，对象不存在
 * 		访问这些事例数据一定会出现空指针异常
 * 
 * 实力相关的数据包括：
 * 		实例变量【对象需要存在】
 * 		实例方法【对象需要存在】
 *
 */
public class Test {

	public static void main(String[] args) {
		Test.doSome();
		doSome();
		
		Test t = new Test();
		t.doSome();
		
		//引用是空
		t = null;
		
		//带有stataic的方法，既可以采用类名的方式访问，也可以采用引用的方式访问
		//即使采用引用的方式访问，执行的时候和引用指向的对象无关
		//建议使用“类名.”的方式，使用引用的方式访问会出现警告
		t.doSome();//这里不会出现空指针异常
	}
	
	//带有static的方法，需要使用“类名.”的方式访问
	public static void doSome() {
		System.out.println("do some!");
	}
}
