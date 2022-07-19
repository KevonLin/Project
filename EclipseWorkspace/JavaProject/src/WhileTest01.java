/*
 	while循环语句
 		1、while循环的语法结构
 			while(布尔表达式){
 				循环体;
 			}
 			
 		2、while循环的循环原理
 			先判断布尔表达式的结果
 				*true
 				 	-执行循环体
 				  		*判断布尔表达式的结果
 				  			-true
 				  				...
 				  			-false
 				  				循环结束
 				
 				*false
 					-循环结束
 			
 		3、while循环的循环次数
 			0~n次
 			while循环的循环体可能执行0次
 */
public class WhileTest01 {
	public static void main(String[] args) {
		
		//死循环下边的语句不能执行编译报错
	/*	while(true) {
			System.out.println("死循环");
		}
	*/
		//编译通过，因为编译期不能进行运算
		int i = 10;
		int j = 3;
		while(i > j) {
			System.out.println("呵呵");
		}
		//编译错误，无法访问语句
		//System.out.println("Hello World");
		
	}
}
