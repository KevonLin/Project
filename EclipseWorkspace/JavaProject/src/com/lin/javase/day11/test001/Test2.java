package com.lin.javase.day11.test001;

public class Test2 {

	public static void main(String[] args) {
		
		//����������ָ�������Ͷ���
		Animal a1 = new Cat();
		Animal a2 = new Bird();
		
		//����ת�͡�ֻ�е�����������������еķ�����
		if(a1 instanceof Cat) {
			Cat c1 = (Cat)a1;
			c1.catchMouse();
		}
		if(a2 instanceof Bird) {
			Bird b1 = (Bird)a2;
			b1.fly();
		}
	}
}
