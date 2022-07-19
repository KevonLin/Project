/*
 	该程序体验方法重载的有点：
 		*程序员调用方法时不需要记忆更多的方法名
 		
 		*代码美观
 		
 	前提：功能相似，方法名可以相同。
 	
 	但是：功能不同的时候哦，尽可能让这两个方法的名字不同。
 */
public class OverloadTest02 {
	public static void main(String[] args) {
		
		//调用方法的时候就像在使用同一个方法一样。
		//参数类型不同，对应调用的方法b不同。
		//此时区分方法不再依靠方法名，依靠的是参数的数据类型。
		System.out.println(sum(1,2));
		System.out.println(sum(1.0,2.0));
		System.out.println(sum(1L,2L));
	}
	public static int sum(int a,int b) {
		return a + b;
	}
	public static long sum(long a,long b) {
		return a + b;
	}
	public static double sum(double a,double b) {
		return a + b;
	}
}
