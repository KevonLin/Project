/*
 	一下使用方法机制，分析有点
 		*代码得到了重复使用
 		
 	方法的本质是什么？
 	
 		*方法就是一段代码片段，并且这段代码片段可以完成某个特定的功能，并且可以被重复使用
 		
 	方法对应Method
 	在C语言中叫做函数(Function)
 	
☆ 	方法定义在类体中，在一个类中可以定义多个方法，没有先后顺序
 	方法体中不能再定义方法，方法体中的代码有顺序
 	方法体由Java语句构成，方法体中的代码自上而下运行
 */
public class MethodTest02 {
	public static void main(String[] args) {
		
		MethodTest02.sumInt(10,20);
		
		MethodTest02.sumInt(666,888);
		
		MethodTest02.sumInt(111,222);
		
	}
	
	public static void sumInt(int a,int b) {
		int c = a + b;
		System.out.println(a + "+" + b + "=" + c);
	}
	
}
