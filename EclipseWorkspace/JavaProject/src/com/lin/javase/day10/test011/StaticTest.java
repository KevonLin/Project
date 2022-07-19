package com.lin.javase.day10.test011;

/**
 * 方法什么时候定义为静态的？
 * 		方法描述的是动作，当作有的对象执行这个动作的时候，最终产生的影响是一样的，
 * 		那么这个动作已经不子啊属于某一个对象的动作了，可以将这个动作提升为类级别
 * 		的动作，模板级别的动作。
 * 
 * 静态方法中无法直接访问实例变量和实例方法
 * 
 * 大多数方法都定义为实例方法，一般一行为或者一个动作在发生的时候，都需要对象的参与
 * 例外：大多数“工具类”(U.p)中的方法都是静态方法
 * 方便方法的调用，自然不需要new对象是最好的
 * @author Lin
 *
 */
public class StaticTest {

	//实例变量
	int i = 100;
	
	//实例方法
	public void doSome() {
		
	}
	
	//静态方法【静态上下文】
	public static void main(String[] args) {
		//没有当前对象
		//System.out.println(i);
		//doSome();
		
		StaticTest st = new StaticTest();
		System.out.println(st.i);
		st.doSome();
		
		
		
		System.out.println(MathUtil.sumInt(10, 20));
		System.out.println(MathUtil.divide(20, 10));
	}
	
	
}

/*
 * 总结：
 * 	class 类{
 * 		静态代码块;
 * 		实例代码块;
 * 
 * 		静态变量
 * 		实例变量
 * 
 * 		构造方法
 * 
 * 		静态方法
 * 		实例方法
 * 	}
 */
