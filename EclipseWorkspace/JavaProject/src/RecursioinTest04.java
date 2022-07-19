/*
 	不是用递归，激素那n的阶乘
 	5的阶乘：
 	5 * 4 * 3 * 2 * 1
 */

/*
public class RecursioinTest04 {
	public static void main(String[] args) {
		
		int n = 5;
		int retValue = method(n);
		System.out.println(retValue);
	}
	
	public static int method(int n) {
		int result = 1;
		for(int i =n;i>0;i--) {
			result *= i;
		}
		return result;
	}
}
*/

//使用递归方式计算n的阶乘
public class RecursioinTest04 {
	public static void main(String[] args) {
		
		int n = 5;
		int retValue = method(n);
		System.out.println(retValue);
	}
	
	public static int method(int n) {
		if(n == 1) {
			return 1;
		}
		return n * method(n - 1);
	}
}
