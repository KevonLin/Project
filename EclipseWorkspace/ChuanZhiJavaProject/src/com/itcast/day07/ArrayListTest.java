package com.itcast.day07;

import java.util.ArrayList;


/*
 * ArrayList���ϵĳ����ǿ�������仯��
 * 
 * ����ArrayList��������<E>��ʾ����
 * ���ͣ�װ�ڼ����е�����Ԫ�أ�ȫ����ͳһ������
 * ע�⣺��ʡֻ���������������ͣ������ǻ�����������
 * 
 * ע���������ArrayList��˵��ֱ�Ӵ�ӡ�õ��Ĳ��ǵ�ֵַ���������ݡ�
 * ��������ǿգ��õ���ʱ��յ�������[]
 * 
 * 
 * ���÷�����
 * public boolean add (E e)���򼯺������Ԫ�أ����������ͺͷ���һ�¡�����ֵ��������Ƿ�ɹ�
 * ��ע������ArrayList������˵��add��Ӷ���һ���ǳɹ��ģ����Է���ֵ���ÿɲ���
 * ��������������˵��add��Ӷ�����һ���ɹ���
 * 
 * public E get(int index)���Ӽ����л�ȡԪ�أ�������������ţ�����ֵ�Ƕ�Ӧλ�õ�Ԫ��
 * 
 * public E remove(int index)���Ӽ�����ɾ��Ԫ�أ�������������ţ�����ֵ�Ǳ�ɾ����Ԫ��
 * 
 * public int size()����ȡ���ϵĳߴ糤�ȣ�����ֵ�Ǽ����а�����Ԫ�ظ���
 * 
 */
public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		//�򼯺������Ԫ��
		list.add("����");
		list.add("����͢");
		list.add("����ӱ");
		list.add("��С�");
		System.out.println(list);
		
		String name = list.get(2);
		System.out.println(name);
		int size = list.size();
		System.out.println("���ϵĳ����ǣ�" + size);
		
		//�Ӽ�����ɾ��Ԫ�أ�remove������ֵ��0��ʼ��
		String whoRemoved = list.remove(3);
		System.out.println("��ɾ�����ǣ�" + whoRemoved);
		System.out.println(list);
		
		size = list.size();
		System.out.println("���ϵĳ����ǣ�" + size);
		
	}
}
