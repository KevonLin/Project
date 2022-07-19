/*
 	循环语句和条件语句的嵌套使用【for和if的嵌套】
 */
public class ForTest04 {
	public static void main(String[] args) {
		
		//找出1~100的所有奇数
		//第一种方案：从1开始，每次递增2
		for(int i=1;i<=100;i+=2) {
			System.out.println("奇数：" + i);
		}
		//第二种方案：从1开始，每次递增1，每个数据进行判断，方法：对2求余数
		for(int i=1;i<=100;i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		//以上两种方案，优先选择第一种方案
	}
}
