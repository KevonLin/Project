/*
 	算数运算符
 		注意：
 			一个表达式中有多个运算符，运算符有优先级，不确定的加小括号，优先级得到提升。
 			没必要专门记忆运算符的优先级
 */
public class OperatorTest01 {
	public static void main(String[] args) {
		
		//关于++运算符【自加1】
		int k = 10;
		
		k++;
		
		System.out.println(k);
		//++运算符可以出现在变量前【单目运算符】
		int y = 10;
		
		++y;
		
		System.out.println(y);
		
		//++ 出现在变量后
		int a = 100;
		int b = a ++;
		System.out.println(a);
		System.out.println(b);
		//++ 出现在变量前
		int m = 20;
		int n = ++m;
		System.out.println(m);//21
		System.out.println(n);//21
		
		int e = 100;
		System.out.println(e ++);//100
		System.out.println(e);//101
		
		int s = 100;
		System.out.println(++ s);//101
		System.out.println(s);//101
		System.out.println(-- s);
		System.out.println(s ++);
		
		
		
	}
}
