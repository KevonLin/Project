/*
 	不是用递归计算1~n的和 [可以不用递归尽量不用递归]
 */
public class RecusionTest02 {
	public static void main(String[] args) {
		
		/*
		//1~4的和
		int n = 4;
		int sum = 0;
		for(int i = 1;i<=4;i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
		*/
		int n = 4;
		int retValue = sum(n);
		System.out.println(retValue);
		
		n = 10;
		retValue = sum(n);
		System.out.println(retValue);
		
	}
	
	//单独定义一个方法，这是一个独立的功能，可以完成1~n的和
	public static int sum(int n) {
		int result = 0;
		for(int i = 1;i<=n;i++) {
			result += i;
		}
		return result;
	}
}
