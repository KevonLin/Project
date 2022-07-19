
/*
	变量：
		变量的作用域


		1.什么是作用域？
			变量的作用域，是指变量的有效范围
			在什么法维内是可以被访问的，只要除了范围就无法访问了
		
		2.变量的作用域记住
			出了大括号就不认识了
			
*/
public class VarTest03
{

	//注意：这里的static不可以去掉
	static int k = 90;

		public static void main(String[] args){

			//变量i的作用域是main方法
			//在整个main方法当中是有效的、可见的、可以访问的
			int i = 100;

			System.out.println(i);
			System.out.println(k);

			//一下编写一个for循环语句
			//for循环后面控制语句详细讲解
			for(int a=0;a<10;a++){
			//int a写道括号里 循环结束 a变量内存释放；写在括号外边还可以再次访问
			
			System.out.println(a);
			}
			
		}
		public static void doSome(){
		

		//这里无法访问main方法中的i变量
		//已经出了i变量的作用域
		//System.out.println(i);

		System.out.println(k);
		
		}
}