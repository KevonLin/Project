package com.lin.javase.day10.test008;

/**
 * ���й��ˡ���
 * @author Lin
 *
 */
public class Chinese {

	//���֤��
	String id;
	
	//����
	String name;
	
	//���ʡ�ûӴ���������ڶ����С�Chinese�ࡱʵ�����ģ�����ÿ���й��˵Ĺ��ʶ��ǡ��й�����
	//����ͨ��Chinese��ʵ�������ٸ�Java������ЩJavad����Ĺ��ʶ��ǡ��й���
	//ʵ��������ʵ��������һ��Java�������һ�ݣ�100��Java������100��country��������������Ʒ�ʽ��ʲôȱ��
	//�����˵Ĺ������ǡ��й�������������Ϊʵ������̫�˷��ڴ�
	String country;
	
	//���캯��
	public Chinese() {
		
	}
	public Chinese(String id,String name,String country) {
		this.id = id;
		this.name = name;
		this.country = country;
	}
}
