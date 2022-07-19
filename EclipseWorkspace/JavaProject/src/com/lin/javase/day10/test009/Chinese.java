package com.lin.javase.day10.test009;

/**
 *	什么时候成员变量声明为实例变量
 *		-所有事对象都有这个属性，但是这个属性值会随着对象的变化而变化
 *
 *	什么时候成员变量声明为静态变量
 *		-所有对象都有这个属性
 *静态变量在类加载的时候初始化，内存在方法去中开辟。访问的时候不需要创建对象，直接使用“类名.静态变量名”的方式访问。
 *
 *访问静态变量不需要对象的存在
 *
 *关于Java中static关键字
 *	1、static翻译为静态的	
 *	2、static修饰的方法是静态方法
 *	3、static修饰的变量是静态变量
 *	4、所有static修饰的元素都称为静态的，都可以使用“类名.”的方式访问，也可以采用“引用.”的方式访问【不建议】
 *	5、static修饰的所有元素都是类级别的特征，和具体对象无关。
 */
public class Chinese {

	//身份证号
	String id;
	
	//姓名
	String name;
	
	//国籍【所有对象都一样，这种特征属于类级别的特征，可以提升为整个模板的特征，在变量前加static关键字修饰】
	//静态变量，在类加载的时候初始化，不需要创建对象，内存就开辟了。
	//静态变量存储在方法去内存中。
	static String country = "中国";
	
	//构造函数
	public Chinese() {
		
	}
	public Chinese(String id,String name) {
		this.id = id;
		this.name = name;
	}
}
