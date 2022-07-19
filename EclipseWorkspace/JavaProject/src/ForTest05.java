/*
 	在前一个程序的基础上，计算1~100所有奇数的和
 		累加
 	运算符 += 专门完成追加
 	
 */
public class ForTest05 {
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=1;i<=100;i+=2) {
		//累加i
		sum += i;
		}
		System.out.println("sum=" + sum);
		
	}
}
