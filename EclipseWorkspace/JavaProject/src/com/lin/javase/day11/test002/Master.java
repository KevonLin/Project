package com.lin.javase.day11.test002;

/**
 * ������
 * 
 *
 */

//���ַ�ʽû��ʹ��Java�����еĶ�̬���ƣ����ڵ�ȱ�㣬һ����һ��
/*
public class Master {

	*//**
	 * ι������ķ���
	 *//*
	public void feed(Cat c) {
		c.eat();
	}

	public void feed(Dog d) {
		d.eat();
	}
}
//Master��Cat��Dog��
*/

//���ͳ������϶ȡ�����ϡ�����߳������չ����Ǽ�������һ����ҪĿ��]
public class Master {

	/**
	 * Master�������������һ�������Pet�������������ĳ���
	 * �峤����������̣���Ҫ���������
	 * ��������̵ĺô��ǣ���϶ȵͣ���չ��ǿ��
	 */
	public void feed(Pet pet) {//Pet pet��һ�������͵�����
		pet.eat();
	}
}