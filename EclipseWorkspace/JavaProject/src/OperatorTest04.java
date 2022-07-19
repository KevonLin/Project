/*
 	关于Java中的复制类运算符
 	
 		复制类运算符包括两种：
 		
 			*基本的赋值运算符
 				=
 			*扩展的赋值运算符
 				+=
 				-=
 				*=
 				/=
 				%=
 				
 		  1、赋值类的运算符优先级：先执行等号右边的表达式，将执行的结果赋值给左边的变量。
 		  
 		  2、注意以下代码：
 		  	byte i = 10;
 		  	1 += 5;等同于： i = (byte)(i + 5);
 		  	
 		  	int k = 10 
 		  	k += 5;等同于： k = (int)(k + 5);
 		  	
 		  	long x = 10L;
 		  	int y =20;
 		  	y += x;等同于：y = (int)(y + x);
 		  	
 		  3、扩展类赋值运算符不改变运算结果类型，假设最初变量类型是byte，
 		  	无论怎么追加或者追减，最后结果还是byte类型
 		  
 */
public class OperatorTest04 {
	public static void main(String[] args) {
		
		//基本的赋值运算符
		int i = 10;
		
		System.out.println(i);
		
		i=i + 5;
		
		System.out.println(i);
		
		//扩展的赋值运算符 [+= 运算符可以翻译为"追加/累加"]
		i += 5;//等同于:i = i + 5;  等价于i= (byte) (i = i + 5);
		
		System.out.println(i);//20
		
		i -= 5;//等同于i = i - 5;  等价同上
		
		System.out.println(i);//15
		
		i *= 4;//等同于i = i * 5;
		
		System.out.println(i);//60
		
		i /= 5;
		
		System.out.println(i);//12
		
		i %= 5;
		
		System.out.println(i);//2
		
		//-------------
		
		//10没有超出byte取值范围，可以直接复制
		byte b = 10;
		//b = b + 5;
		//编译错误，原因：编译器只检查语法，不运行程序，编译器发现b+5是int类型，b变量的数据类型是byte
		//大容量像小容量转换需要加强制转换类型符，所以程序编译报错。
		
		b = (byte) (b + 5);
		System.out.println(b);
		
		byte x =10;
		x += 5;
		System.out.println(x);
		
		byte z = 0;
		z += 128;//等价于: z = (byte) (z + 128);  
		System.out.println(z);//结果损失精度 -128
		
	}
}
