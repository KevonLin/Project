/*
 	实现计算器中的
 		+
 		-
 		*
 		/
 		%
 		
 	实现思路：
 		1、选择所有数据从键盘輸入
 		2、舒勇switch语句进行判断
 		3、需要从控制台输入三次：
 			*第一个数字
 			*运算符
 			*第二个数字
 		
 		最终在控制台上：
 			欢迎使用简单计算器系统：
 			请输入第一个数字：10
 			请输入运算符：+
 			请输入第二个数字：20
 			运算结果：10 + 20 = 30
		
		
*/
public class SwitchTest04 {
	public static void main(String[]args) {
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("欢迎使用简单计算器系统");
		
		System.out.println("请输入第一个数字");
		int num1 = s.nextInt();
		
		System.out.println("请输入运算符");
		String operator = s.next();
		
		System.out.println("请输入第二个数字");
		int num2 = s.nextInt();
		
		int result = 0;
		switch(operator) {
			case "+" :
				result = num1 + num2;
				break;
			case "-" :
				result = num1 - num2;
				break;
			case "*" :
				result = num1 * num2;
				break;
			case "/" :
				result = num1 / num2;
				break;
			case "%" :
				result = num1 % num2;
				break;
			default :
				System.out.println("该系统只支持+、-、*、/、%且整数的运算");
		}
		
		System.out.println(num1 + operator + num2 + "=" + result);
		
	}
}
