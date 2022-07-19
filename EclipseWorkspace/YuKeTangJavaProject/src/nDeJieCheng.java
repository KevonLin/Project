import java.util.Scanner;

public class nDeJieCheng {

	public static void main(String[] args) {
/*
		// 普通循环实现计算n的阶乘
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int sum = 1;
		for (int x = 1; x <= i; x++) {
			sum = sum * x;
		}
		System.out.println(sum);
*/
		System.out.println("请输入要计算阶乘的数字：");
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		System.out.println(jc(t));
		//递归方法
	}
	// 递归方法实现计算n的阶乘
	public static int jc(int a) {
		if(a == 1) {
			return 1;
		}else {
			int result = a * jc(a-1);
			return result;
		}
	}
}
