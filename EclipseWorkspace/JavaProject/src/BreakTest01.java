/*
 	关于java控制语句中的break语句
 	
 		1、break是Java语言中的关键字，被翻译为“中断/折断“
 		
 		2、break; 可称为一个单独的完整的jacaranda语句
 		
 		3、break可以用在switch语句中，用来终止switch语句
 		
 		4、break可以终止循环语句
 		
 		5、break终止哪个循环？
 		
 		6、break；语句使用在for，while，do..while循环语句中跳出循环，终止循环的运行
 		可以提高程序的执行效率
 		
 		7、一下for循环为例讲解break；语句
 		
 		8、默认情况下：break终止的是离他最近的语句。也可以给循环命名终止指定的循环
 		
 */
public class BreakTest01 {
	public static void main(String[] args) {
		
		//给for命名
		//break用来中断循环语句，且最近的循环。
		 for1:for(int j=0;j<10;j++) {
			 for2:for(int i=0;i<10;i++) {
				 if(i == 5) {
					 break for1;
				 }
				 System.out.println("i-->" + i);
			 }
		 }
	
	System.out.println("Hello World!");
	}
}
