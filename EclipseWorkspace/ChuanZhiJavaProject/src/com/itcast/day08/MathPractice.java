package com.itcast.day08;

/*
 * �ټ���-10.8��5.9֮�䣬����ֵ����6����С��2.1�������м�����
 * 
 * ���ʹ��Math.ceil������-10.8���Ա��-10.0��doubleҲ���Խ���++��
 */
public class MathPractice {

	public static void main(String[] args) {

		int count = 0;
		double min = -10.8;
		double max = 5.9;
		for (int i = (int) min; i < max; i++) {
			int abs = Math.abs(i);
			if (abs > 6 || abs < 2.1) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("һ���У�" + count + "��");
		
		System.out.println("===========================");
	}
}
