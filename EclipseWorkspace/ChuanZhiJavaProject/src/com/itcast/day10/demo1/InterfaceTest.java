package com.itcast.day10.demo1;

/*
 * 接口时多个类的公共规范
 * 接口是一种引用数据类型，最重要的内容就是其中的抽象方法
 * 
 * 换成关键字inteface之后，编译生成的字节码文件仍然是java -->class
 * 
 * 接口使用步骤：
 * 1、接口不能直接使用，必须有一个实现类来实现该接口
 * 2、接口的实现必须覆盖重写（实现）接口中所有的抽象方法
 * 实现：去掉abstract关键字，加上方法体大括号
 * 3、创建实现类对象，进行使用
 * 
 * 注意：
 * 如果实现类没有覆盖重写接口中所有的抽象方法，那么这个实现类自己就是个抽象类
 */
public class InterfaceTest {

	public static void main(String[] args) {
		MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
		impl.methodAbs1();
		impl.methodAbs2();
	}
}
