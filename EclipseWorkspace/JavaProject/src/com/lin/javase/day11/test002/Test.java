package com.lin.javase.day11.test002;

/**
 * 多态在实际开发中的作用，以下以主人喂养宠物为例说明多态的作用：
 * 	1、分析：主人喂养宠物这个场景要实现余姚进行类型的抽象：
 * 		-主人【类】
 * 		-主人可以喂养宠物，所以主人有喂养这个动作
 * 		-宠物【类】
 * 		-宠物可以吃东西，所以宠物有吃东西的这个动作
 * 		
 * 	2、面向对象变成的核心：定义好类，然后将类实例化为对象，给一个环境驱使，让各个对象之间写作起来形成一个系统
 * 
 * 	3、多态的作用是什么？
 * 		降低程序的耦合度，提高程序的扩展力
 * 		能使用多态尽量使用多态
 * 		父类型引用指向子类型对象
 * 		
 * @author Lin
 *
 */
public class Test {

	public static void main(String[] args) {
		
		//创建主人对象
		Master zhangsan = new Master();
		//创建猫对象
		//Cat tom = new Cat();
		//主人喂猫
		//zhangsan.feed(tom);
		
		//创建宠物对象
		zhangsan.feed(new Cat());
		zhangsan.feed(new Dog());
		zhangsan.feed(new Snake());
		
/*		//创建设对象
		Snake mangShe = new Snake();
		//主任为蟒蛇
		zhangsan.feed(mangShe);*/
		
		
		
		
	}
}
