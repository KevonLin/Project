package com.lin.javase.day09.test005;

/**
 * 构造方法的作用：
 * 		1、创建对象
 * 		2、给实例变量赋值
 *		
 *
 *成员变量之实例变量，属于对象级别的变量，这种变量必须现有对象才能有实例变量
 *实例变量没有手动复制的时候，系统默认复制，系统默认赋值不是在类加载的时候，
 *类加载的时候只加载了代码片段，还没来得及创建对象，此时实例变量并没有初始化
 *
 *实例变量的内存空间是在构造方法执行过程中完成开辟的w完成初始化的。
 *系统在默认复制的时候，也是在构造方法执行过程中完成d的赋值
 *
 *实例变量默认值：
 *byte,short,int,long 0
 *float,double 0.0
 *boolean false
 *引用数据类型 null
 *
 *实例变量存储在JVM堆内存内部
 */
public class ConstructorTest02 {

	public static void main(String[] args) {
		
		//在eclipse中查看访问的是哪个属性，查看访问的是哪个方法
		//按ctrl键，鼠标移动到查看的元素上，出现下划线的时候单击
		//在一个类中元素过多，快速查看用ctrl+o输入要查看元素的名称，不一定是全称
		//创建对象
		Account act1 = new Account();
		
		System.out.println("账号：" + act1.getActno());
		System.out.println("余额" + act1.getBalance());
		
		Account act2 = new Account("110");
		System.out.println("账号：" + act2.getActno());
		System.out.println("余额：" + act2.getBalance());
		
		Account act3 = new Account(100.0);
		System.out.println("账号：" + act3.getActno());
		System.out.println("余额：" + act3.getBalance());
		
		Account act4 = new Account("A",1000.0);
		System.out.println("账号：" + act4.getActno());
		System.out.println("余额：" + act4.getBalance());

	}
	
}
