/*
 	关于java语言中的整数型：
 	数据类型		占用空间大小		默认值		取值范围
 -------------------------------------------------
 	byte			1			0			[-128~127]
 	short			2			0			[-32768~32767]
 	int				4			0			[-2147483648~2147483647]
 	long			8			0L			
 	
 1、java语言中“整数型字面值”被默认当作int类型处理
 		十进制【是一种缺省默认方式】
 		八进制【以0开头】
 		十六进制【以0x开头】
 
 */
public class DataTypeTest04 {
	public static void main(String[] args) {
	
		int a = 10;
		int b = 010;
		int c = 0x10;
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a + b + c);
		
		int i = 123;
		System.out.println(i);
		
		//456整数型字面值被当作int类型处理，占用4个字节
		//x变量声明时是long类型，占用8个字节
		long x = 456;
		System.out.println(x);
		
		long y = 2147483647;
		System.out.println(y);
		
		//超出int范围
		//解决方法：2147483648使其一开始就被当做long类型处理
		//在数值后加L
	/*	long z = 2147483648;
		System.out.println(z);
	*/	
		long z = 2147483648L;
		System.out.println(z);
		
		
	}
}
