package com.itcast.day07;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {

	public static void main(String[] args) {
		
		Random r = new Random();
		int randomNum = r.nextInt(100) + 1;// [1,100]
		
		Scanner sc = new Scanner(System.in);

		int result = 0;// 猜测的数字
		
		System.out.println("系统已经自动生成一个1~100的数字，请猜测该数字！");
		
		for(int i = 0; i<=10 ; i ++) {
			
			int num = sc.nextInt();
			
			if("".equals(num))
				System.out.println("您输入的内容为空！");
			else if(result == num)
				System.out.println("您已经猜过该数字了!");
			else if(num == randomNum) {
				System.out.println("恭喜你用了" + i + "次机会猜对了！");
				break;
			}
			else if(num < randomNum) {
				System.out.println("太小了请重试！");
				i ++;
				result = num;
			}
			else if(num > randomNum) {
				System.out.println("太大了请重试！");
				i ++;
				result = num;
			}
		}
		System.out.println("游戏结束！");
	}
}
