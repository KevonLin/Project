/*
 	�����õݹ飬������n�Ľ׳�
 	5�Ľ׳ˣ�
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

//ʹ�õݹ鷽ʽ����n�Ľ׳�
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
