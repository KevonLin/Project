/*
 	三元运算符/三目运算符/条件运算符
 		1、语法规则
 			布尔表达式 ? 表达式1:表达式2
 		
 		2、三元运算符的执行原理？
 			当布尔表达式的结果是true时，选择表达式1作为哼歌表达式的执行结果
 			当布尔表达式的结果是false时，选择表达式2作为哼歌表达式的执行结果
 */
public class OperatorTest03N {
	public static void main(String[] args) {
		
		
		//分析一下程序是否可以编译通过
		//编译报错，因为他不是一个完整的Java语句
		//sex ? '男' : '女';
		
		boolean sex = false;
		char c = sex ? '男' :  '女';
		System.out.println(c); 	 	
		
		sex = true;
		c = sex ? '男' :  '女';
		System.out.println(c); 
		
		String s = sex ? "男的" : "女的";
		System.out.println(s);
		
	}
}
