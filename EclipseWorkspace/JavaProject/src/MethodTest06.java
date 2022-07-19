/*
 	方法调用:
 	
 		1、方法的修饰符列表中有static关键字，完整的调用方式时：类名.方法名(实参列表);
 		
 		2、有时候类名可以省略
 			m1(){
 				m2();
 			}
 			m1方法和m2方法在同一类体中的时候 “类名.”可以省略不写
 			
 		3、建议在一个Java源文件中只定义一个class
 		
 */
public class MethodTest06 {
	public static void main(String[] args) {
		
		//调用方法
		MethodTest06.m();
		
		//对于方法的修饰符列表中有static关键字的：“类名.关键字”可以省略不写吗
		m();
		
		//调用其他类【不是本类中的】方法
		A.doOther();
		
		//若省略“类名.”
		//编译报错，省略之后只能从当前类中找该方法。
		//doOther();
		
	}
	
	public static void m() {
		System.out.println("m method execute!");
		m2();//省了调用本类中的方法
	}
	
	public static void m2() {
		System.out.println("m2 method execute!");
		A.m2();//加上“类.方法名”调用对应类中的方法
	}
	
}

class A
{
	public static void doOther() {
		System.out.println("A's doOther method invoke!");
	}
	
	public static void m2() {
		System.out.println("m2 execute!");
	}
}
