/*
 	do...while循环：
 		1、do..while循环的语法结构
 		
 			do{
 				循环体;
 			}while(布尔表达式);
 			
 		2、do..while循环的执行原理
 			先执行循环体一次，判断布尔表达式，为true执行，false循环结束
 		3、do..while循环的执行次数
 			1~n次
 		4、使用do..while循环的注意事项
 			最后有个“分号”别丢了
 */
public class DoWhileTest01 {
	public static void main(String[] args) {
		
		int a = 1;
		do {
			System.out.println(a);
			a++;
		}while(a <= 10);
	}
}
