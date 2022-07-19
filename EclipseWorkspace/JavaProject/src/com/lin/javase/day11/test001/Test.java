package com.lin.javase.day11.test001;

/**
 * 关于Java语言中堕胎语法机制：
 * 	1、Animal、Cat、Bird三个类之间的瓜西：
 * 		Cat继承Animal
 * 		Bird继承Animal
 * 		Cat和Bird之间没有继承关系
 * 
 * 	2、面向对象三大特征：封装、继承、多态
 * 
 * 	3、关于多态中设计到的几个概念：
 * 		-向上转型(upcasting)
 * 			子类型-->父类型
 * 			又被称为：自动类型转换
 * 
 * 		-向下转型(downcasting)
 * 			父类型-->子类型
 * 			又被称为：强制类型转换【需要加强制类型转换符】
 * 		
 * 		-重点：
 * 			需要记忆：无论是向上转型还是向下转型，两种类型之间必须有继承关系
 * 			没有继承关系，程序编译不通过
 * 	
 *
 */
public class Test {

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		a1.move();
		
		Cat c = new Cat();
		c.catchMouse();
		
		Bird b1 = new Bird();
		b1.move();
		
		//使用多态语法机制
		
		/**
		 * 1、Animal和Cat之间存在继承关系，Animal是父类。Cat是子类
		 * 
		 * 2、Cat is a Animal
		 * 
		 * 3、new Cat()创建对象的类型是Cat，a2这个引用的数据类型是Animal，进行了类型转换
		 * 子类型转换成父类型，称为向上转型/upcasting，或称为自动类型转换
		 * 
		 * 4、Java中允许这种语法：夫类型引用指向子类型对象
		 */
		Animal a2 = new Cat();
		//Bird b2 = new Cat();//编译报错，两种类型之间不存在继承关系，无法向上或向下转型
		
		
		/**
		 * 1、Java程序都分为编译阶段和运行阶段
		 * 
		 * 2、先分析编译阶段，再分析运行阶段，编译无法通过，无法运行
		 * 
		 * 3、编译阶段编译器检查a2引用数据类型为Animal，由于Animal.class
		 * 字节码中有move()方法，所以编译通过。这个过程称之为静态绑定，编译阶段绑定。
		 * 只有静态绑定成功之后才有后续的运行
		 * 
		 * 4、在程序运行阶段，JVM堆内存中真是创建的对象是Cat对象
		 * 程序在运行阶段一定会调用Cat对象的move()方法，此事发生了动态绑定，运行阶段绑定
		 * 
		 * 5、无论Cta类有没有重写move方法，运行姐u但一定调用的是Cat对象的move方法，因为
		 * 底层真实的对象就是Cat对象
		 * 
		 * 6、父类型引用指向子类型对象这种机制导致程序存在编译阶段绑定和运行阶段绑定两种不同的形态/状态，
		 * 这种机制可以称为以终多态语法机制。
		 */
		a2.move();//猫在走猫步
		
		/**
		 * 分析一下和层序为什么不能调用？
		 * 		因为编译阶段编译器检查到a2的类型是Animal类型，
		 * 		从Animal.class字节码文件中查找catchMouse()方法
		 * 		最终没有找到该方法，导致静态绑定失败，没有绑定成功，
		 * 		也就是编译失败，不能运行。
		 */
		//a2.catchMouse();
		
		/**
		 * 需求：
		 * 	假设想让以上的对象执行catchMouse()方法
		 * 
		 * 		a2是无法直接调用的，因为a2类型Animal，Animal中没有catchMouse()方法。
		 * 		可以将a2强制类型转换为Cat类型
		 * 		a2的类型是Animal(父类)，转换成Cat类型(子类)，被称为向下转型/downcasting/强制类型转换
		 * 
		 * 	注意：向下转型也需要两种类型之间必须有继承关系。不然编译报错。强制类型转换需要加强制类型转换符
		 * 
		 * 什么时候需要使用向下转型？
		 * 	当调用的方法是子类型中特有的，在父类型中不存在，必须进行向下转型。
		 */
		Cat c2 = (Cat)a2;
		c2.catchMouse();//猫抓老鼠！
		
		//父类型引用指向子类型对象【多态】
		Animal a3 = new Bird();
		
		/**
		 * 1、以下程序编译没问题，编译器检查到a3的数据类型是Animal
		 * Animal和Cat之间存在继承关系，并且Animal是父类型，
		 * 父类型转换成子类型叫向下转型，语法和各
		 * 
		 * 2、程序虽然编译通过了，程序在运行阶段会出现异常，JVM堆内存中
		 * 真实存在的对象是Bird类型，Bird对象无法转换成Cat对象，两种
		 * 类型之间不存在继承关系，此时出现了异常：
		 * 	java.lang.ClassCastException
		 * 	类型转换异常，这种异常总是在“向下转型”的时候发生
		 */
		//当a3引用指向的对象确实是一个Cat的时候
	
		
		/**
		 * 1、以上异常只有在强制类型转换的时候会发生，也就是说向下转型存在隐患（编译通过，运行错误）
		 * 2、向上转型只要编译通过，运行一定通过。
		 * 3、向下转型编译通过，运行可能错误：Animal a3 = new Bird();Cat c3 = (Cat)a3;
		 * 4、怎么避免向下转型出现java.lang.ClassCastException？
		 * 	使用instanceof运算符可以避免出现以上的异常
		 * 5、instanceof运算符怎么用？
		 * 	5.1、语法格式
		 * 		(引用 instanceof 数据类型名)
		 * 	5.2、以上运算符的执行结果类型是布尔类型，结果可能是true/false
		 * 
		 * 	5.3、关于运算结果true/false
		 * 		假设：(a instanceof Animal)
		 * 		true表示：
		 * 			a这个引用指向的对象是一个Animal类型
		 * 		false表示：
		 * 			a这个引用指向的对象不是一个Animal类型
		 * 6、Java规范中要求：在强制类型转换之前，建议采用instanceof运算符进行判断，避免ClassCastException异常的发生
		 * 
		 */
		if(a3 instanceof Cat){
			Cat c3 = (Cat)a3;
			c3.catchMouse();
		}else if(a3 instanceof Bird) {
			Bird b2 = (Bird)a3;
			b2.fly();
		}
	}
}








