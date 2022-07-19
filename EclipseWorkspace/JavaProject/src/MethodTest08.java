/*
 	方法的返回值不是void的时候
 	
 		1、返回值不是void的时候：
 			要求方法必须保证百分百执行“return 值;”这样的语句来完成值的返回。
 			没有这个语句编译器会报错/
 			
 		2、一个方法有返回值的时候，当我们调用这个方法的时候，返回类一个值
 		对于调用者来说，这个返回值可以选择接收，也可以选择不接收。
 		大部分情况下返回值都要接收。
 */
public class MethodTest08 {
	public static void main(String[] args) {
		
		//调用方法
		divide(10,3);//没有接受这个方法的返回数据
		
		//采用变量接受
		//变量的数据类型需要和返回值的类型相同，或者可以自动类型转换
		//boolean b = divide(10,3);//编译报错，类型不兼容
		
		//赋值匀速那夫的右边限制性，将执行结果估值给左边的变量
		int i = divide(10,3);
		System.out.println(i);
		
		long x = divide(10,3);
		System.out.println(x);
		
		System.out.println(divide(10,3));
		
		
	}
	
	/*
	 	需求：
	 		请定义并实现一个方法，该方法可以计算两个int类型数据的商
	 		要求将最终的计算结果返回给调用者
	 */
	
	//编译错误：缺少返回语句
	/*
	public static int divide(int a,int b) {
		
	}
	*/
	
	//编译报错：缺少返回值
	/*
	public static int divide(int a,int b) {
		return;
	}
	*/
	
	//编译报错，要求返回int类型的值
	/*
	public static int divide(int a,int b) {
		return true;
	}
	*/
	
	public static int divide(int a,int b) {
		//System.out.println("Hello");
		return a/b;
	}
}
