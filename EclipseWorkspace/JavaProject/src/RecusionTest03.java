/*
 	使用递归计算1~n的和
 		1 + 2 + 3 + 4
 		4 + 3 + 2 + 1 n的最初只时4，建议采用这种方式
 */
public class RecusionTest03 {
	public static void main(String[] args) {
		int n = 4;
		int retValue = sum(n);
		System.out.println(retValue);
	}
	public static int sum(int n) {
		// 4 + 3 + 2 + 1
		if(n == 1) {
			return 1;
		}
		return n +sum(n-1);
	}
}
