package com.itcast.day07;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {

	public static void main(String[] args) {
		
		Random r = new Random();
		int randomNum = r.nextInt(100) + 1;// [1,100]
		
		Scanner sc = new Scanner(System.in);

		int result = 0;// �²������
		
		System.out.println("ϵͳ�Ѿ��Զ�����һ��1~100�����֣���²�����֣�");
		
		for(int i = 0; i<=10 ; i ++) {
			
			int num = sc.nextInt();
			
			if("".equals(num))
				System.out.println("�����������Ϊ�գ�");
			else if(result == num)
				System.out.println("���Ѿ��¹���������!");
			else if(num == randomNum) {
				System.out.println("��ϲ������" + i + "�λ���¶��ˣ�");
				break;
			}
			else if(num < randomNum) {
				System.out.println("̫С�������ԣ�");
				i ++;
				result = num;
			}
			else if(num > randomNum) {
				System.out.println("̫���������ԣ�");
				i ++;
				result = num;
			}
		}
		System.out.println("��Ϸ������");
	}
}
