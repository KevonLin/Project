/*
 	"+" 运算符在Java语言中的两个作用：
 	
 		*加法运算求和
 		*字符串的连接运算
 	
 		加号两边都是数字，一定进行加法运算
 		
 		当加号运算符两边的数据只要有一个字符串，一定进行字符串连接运算。
 		并且，连接运算之后的结果还是一个字符串
 		
 			数字+数字 ----> 数字【求和】
 			
 			数字+"字符串" --> "字符串"
 		
 */
public class OperatorTest02N {
	public static void main(String [] args) {
		int a = 10;
		int b = 20;
		
		//要求动态输出10+20=30
		System.out.println(a + "+" + b + "=" + (a + b));
		
		//引用类型String
		//int是基本数据类型，i是b变量名，10是int类型的字面值
		//int i = 10；
		
		//String是引用数据类型，s是变量名，"abc"String类型的字面值
		//String s = "abc";
		
		
		//编译错误，类型不兼容
		//String ss = 10;
		
		String username = "zhangsan";
		System.out.println("登陆成功，欢迎" + username + "回来");
	}
}
