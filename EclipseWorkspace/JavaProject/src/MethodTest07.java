/*
 	分析一下程序的输出结果
 	
 	
 	对于当前的程序来说：
 		*main方法最先被调用，最后解说
 		*最后调用的方法时m3方法，该方法最后结束
 	
 	main方法结束后，整个程序结束【只适用于当前内容】
 */
public class MethodTest07 {
	public static void main(String[] args) {
		System.out.println("main begin");
		m1();
		System.out.println("main over");
	}
	
	public static void m1() {
		System.out.println("m1 begin");
		m2();
		System.out.println("m1 voer");
	}
	
	public static void m2() {
		System.out.println("m2 begin");	
		m3();
		System.out.println("m2 over");
	}
	
	public static void m3() {
		System.out.println("m2 begin");
		System.out.println("m2 over");
	}
	
}
