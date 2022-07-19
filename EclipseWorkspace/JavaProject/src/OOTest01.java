/*
 	对象的创建和使用
 */
public class OOTest01 {
	public static void main(String[] args) {
		//int是一个基本数据类型
		//i是一个变量名
		//10是一个int类型的字面值
		int i = 10;
		
		//通过一个类可以实例化n个对象
		//实例化对象的语法：new 类名();
		//new是Java语言中的一个运算符
		//new运算符的作用是创建对象，在JVM堆中开辟新的内存空间
		//方法区内存：在类加载的时候，class字节码代码片段被加载到该内存空间中。
		//栈内存（局部变量）：方法代码片段执行的时候，会给改代码片段分配内存空间，在栈内存中压栈。
		//堆内存：new的对象在堆内存中存储
		
		//Student是一个引用数据类型
		//s是一个变量名
		//new Student()是一个学生对象
		//s是一个局部变量【在栈内存中存储】
		//什么是对象？new运算符在堆内存中开辟的内存空间称为对象
		//什么是引用？引用是一个变量，变量中保存了另一个Java对象的内存地址
		//Java语言中，程序员不能直接操作堆内存，Java没有指针
		//Java语言中，程序员只能通过“引用”去访问堆内存中对象的内部实例变量
		Student s = new Student();
		
		//访问实例变量的语法格式：
		//  读取数据：引用.变量名
		//	修改数据：引用.变量名 = 值
		int stuNo = s.no;
		String stuName = s.name;
		int stuAge = s.age;
		boolean stuSex = s.sex;
		String stuAdd = s.add;
		
		System.out.println(stuNo);//0
		System.out.println(stuName);//null
		System.out.println(stuAge);//0
		System.out.println(stuSex);//false
		System.out.println(stuAdd);//null
		
		System.out.println(s.no);//0
		System.out.println(s.name);//null
		System.out.println(s.age);//0
		System.out.println(s.sex);//false
		System.out.println(s.add);//null
		
		s.no = 10;
		s.name = "jack";
		s.age = 20;
		s.sex = true;
		s.add = "Beijing";
		
		System.out.println(s.no);//10
		System.out.println(s.name);//jack
		System.out.println(s.age);//20
		System.out.println(s.sex);//true
		System.out.println(s.add);//beijing
		
		//再通过类实例化一个全新的对象
		//stu是一个引用
		//stu同时也是一个局部变量
		//Student是变量的数据类型
		Student stu = new Student();
		
		System.out.println(stu.no);
		System.out.println(stu.name);
		System.out.println(stu.age);
		System.out.println(stu.sex);
		System.out.println(stu.add);
		
		//编译报错no这个实例变量不能直接采用“类名”的方式访问
		//因为no是实例变量，对象级别的变量，变量存储在Java对象的内部，必须先有对象
		//通过对象才能访问no这个实例变量，不能直接通过“类名”访问
		//System.out.println(Student.no);
			
	}
}
/*
 	局部变量在栈内存中存储
 	成员变量中的实例变量在堆内存的Java对象内部存储
 	
 	实例变量是一个对象一份，100个对象有100份
 */
