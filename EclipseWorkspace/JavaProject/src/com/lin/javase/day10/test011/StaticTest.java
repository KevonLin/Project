package com.lin.javase.day10.test011;

/**
 * ����ʲôʱ����Ϊ��̬�ģ�
 * 		�����������Ƕ����������еĶ���ִ�����������ʱ�����ղ�����Ӱ����һ���ģ�
 * 		��ô��������Ѿ����Ӱ�����ĳһ������Ķ����ˣ����Խ������������Ϊ�༶��
 * 		�Ķ�����ģ�弶��Ķ�����
 * 
 * ��̬�������޷�ֱ�ӷ���ʵ��������ʵ������
 * 
 * ���������������Ϊʵ��������һ��һ��Ϊ����һ�������ڷ�����ʱ�򣬶���Ҫ����Ĳ���
 * ���⣺������������ࡱ(U.p)�еķ������Ǿ�̬����
 * ���㷽���ĵ��ã���Ȼ����Ҫnew��������õ�
 * @author Lin
 *
 */
public class StaticTest {

	//ʵ������
	int i = 100;
	
	//ʵ������
	public void doSome() {
		
	}
	
	//��̬��������̬�����ġ�
	public static void main(String[] args) {
		//û�е�ǰ����
		//System.out.println(i);
		//doSome();
		
		StaticTest st = new StaticTest();
		System.out.println(st.i);
		st.doSome();
		
		
		
		System.out.println(MathUtil.sumInt(10, 20));
		System.out.println(MathUtil.divide(20, 10));
	}
	
	
}

/*
 * �ܽ᣺
 * 	class ��{
 * 		��̬�����;
 * 		ʵ�������;
 * 
 * 		��̬����
 * 		ʵ������
 * 
 * 		���췽��
 * 
 * 		��̬����
 * 		ʵ������
 * 	}
 */
