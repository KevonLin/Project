package com.lin.javase.day10.test002;

public class ThisTest {
	
	//实例变量(引用.的方式访问)
	
	int num = 10;
	
	public static void main(String[] args) {
		
		//没有当前对象this
		//访问当前对象(this)num属性
		//带有static的方法不能用用this
		//System.out.println(num);
		//System.out.println(this.num);
		
		ThisTest n = new ThisTest();
		System.out.println(n.num);
	}
}
