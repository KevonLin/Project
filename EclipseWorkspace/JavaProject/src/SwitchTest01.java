/*
 	关于switch语句：
 		1、switch语句也属于选择结构，也是分支语句
 		2、switch语句的语法结构：			
 			一个比较完整的switch语句应该这样写
 				switch(int或String类型的字面值或变量){
 					case int或String类型的z字面值或变量:
 						Java语句;
 						...
 						break;
	
 					case int或String类型的z字面值或变量:
 						Java语句;
 						...
 						break;

 					case int或String类型的z字面值或变量:
 						Java语句;
 						...
 						break;
 						
 					default:
 						java语句
 						...
 				}
 		3、switch语句的执行原理：
 			switch后面的小括号zh中的“数据”和case后面的“数据”进行一一匹配，匹配成功执行
 			匹配顺序自上而下
 		4、匹配成功的分支执行，分支中最后有”break;“语句的话,整个switch语句终止
 		
 		5、没有break穿透分支直接进入下一分支，避免穿透加break语句
 		
 		6、所有分支都不匹配执行default中的语句
 		
 		7、switch后面和case后面只能是int或者String类型的数据，不能是探测其他类型
 			
 			*byte，short，char也可以直接写道switch和case后面，可以进行自动类型转换
 			byte，short，char可以自动转换成int类型。
 			
 			*JDK6，switch和case后面正能探测int类型
 			
 			*JDK7之后包括7版本可以探测String类型的数据
 			
 		8、case可以合并：
 		
 				int i = 10;
 				
 				switch(i){
 					case 1:case 2:case 3:case 10:
 					System.out.println("Test Code!");
 				}
 */
public class SwitchTest01 {
	public static void main(String[] args) {
	
	/*
		long a = 10L;
		int b = a;//编译报错
		
		long x = 100L;
		switch(x) {}//编译报错
	
	*/
		
		long x = 100L;
		switch ((int)x) {}
		
		byte b = 10;
		switch(b) {}
		
		short d = 10;
		switch(d) {}
		
		char c = 'A';
		switch(c) {}
		
		char cc = 97;
		switch(cc) {}
		
		//编译报错
		//switch(true){}
		
		String username = "Lin";
		switch(username) {}
		
		/*
		 	较完整的switch语句
		 */
		//接受用户的輸入：
		//1表示星期一
		//...
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入数字：");
		int num = s.nextInt();
		switch(num) {
			case 1 :
				System.out.println("星期一");
				break;
			case 2 :
				System.out.println("星期二");
				break;
			case 3 :
				System.out.println("星期三");
				break;
			case 4 :
				System.out.println("星期四");
				break;
			case 5 :
				System.out.println("星期五");
				break;
			case 6 :
				System.out.println("星期六");
				break;
			case 7 :
				System.out.println("星期日");
				break;
			default :
				System.out.println("对不起，您输入的数字非法");

		}
		System.out.println("-------------------------");
		
		//case穿透
		switch(num) {
			case 1 :
				System.out.println("星期一");
			
			case 2 :
				System.out.println("星期二");
				
			case 3 :
				System.out.println("星期三");
			
			case 4 :
				System.out.println("星期四");
			
			case 5 :
				System.out.println("星期五");
								
			case 6 :
				System.out.println("星期六");
			
			case 7 :
				System.out.println("星期日");
			
			default :
				System.out.println("对不起，您输入的数字非法");
		}
		
		//case合并
		switch(num) {
		case 1 : case 0 :
			System.out.println("星期一");
			break;
		case 2 :
			System.out.println("星期二");
			break;
		case 3 :
			System.out.println("星期三");
			break;
		case 4 :
			System.out.println("星期四");
			break;
		case 5 :
			System.out.println("星期五");
			break;		
		case 6 :
			System.out.println("星期六");
			break;
		case 7 :
			System.out.println("星期日");
			break;
		default :
			System.out.println("对不起，您输入的数字非法");
		}
	}
}
