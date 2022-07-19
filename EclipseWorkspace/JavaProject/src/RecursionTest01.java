/*
 	关于方法的递归调用
 		1、什么是递归？
 			a(){
 				a();
 			}
 			
 		2、递归时很耗费栈内存的，递归算法可以不用的时候尽量别用
 		
 		3、以下程序运行的时候发生了一个错误【不是异常，时错误Error】
 			java.long.StackOverflowError
 			表示栈内存一处错误。
 			错误发生无法挽回，就是JV,停止工作
 		
 		4、递归必须有结束条件，没有结束条件一定会发生栈内存溢出错误
 		
 		5、递归即使有了结束条件，即使结束条件时正确的，也可能发生栈内存溢出错误，因为递归太深了
 		
 		注意：
 			递归可以不使用尽量不使用
 			但是有些情况下该功能的使用必须依赖递归方式。【例如：目录拷贝】
 		
 */
public class RecursionTest01 {
	public static void main(String[] args) {
		System.out.println("main begin");
		doSome();
		System.out.println("main over");
	
	}
	
	//以下的代码片段虽然只有一份
	//但是可以被重复的调用，并且只要调用doSome方法，就会在栈内存中新分配一块所属的内存空间。
	public static void doSome() {
		System.out.println("doSome begin");
		doSome();//这行代码不结束，下一行不能执行
		System.out.println("doSome over");
	}
}
