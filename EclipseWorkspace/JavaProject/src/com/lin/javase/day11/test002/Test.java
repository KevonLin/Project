package com.lin.javase.day11.test002;

/**
 * ��̬��ʵ�ʿ����е����ã�����������ι������Ϊ��˵����̬�����ã�
 * 	1������������ι�������������Ҫʵ����Ҧ�������͵ĳ���
 * 		-���ˡ��ࡿ
 * 		-���˿���ι���������������ι���������
 * 		-����ࡿ
 * 		-������ԳԶ��������Գ����гԶ������������
 * 		
 * 	2����������ɵĺ��ģ�������࣬Ȼ����ʵ����Ϊ���󣬸�һ��������ʹ���ø�������֮��д�������γ�һ��ϵͳ
 * 
 * 	3����̬��������ʲô��
 * 		���ͳ������϶ȣ���߳������չ��
 * 		��ʹ�ö�̬����ʹ�ö�̬
 * 		����������ָ�������Ͷ���
 * 		
 * @author Lin
 *
 */
public class Test {

	public static void main(String[] args) {
		
		//�������˶���
		Master zhangsan = new Master();
		//����è����
		//Cat tom = new Cat();
		//����ιè
		//zhangsan.feed(tom);
		
		//�����������
		zhangsan.feed(new Cat());
		zhangsan.feed(new Dog());
		zhangsan.feed(new Snake());
		
/*		//���������
		Snake mangShe = new Snake();
		//����Ϊ����
		zhangsan.feed(mangShe);*/
		
		
		
		
	}
}
