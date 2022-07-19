package com.lin.javase.day10.test005;

/**
 * �Զ�����������
 * 
 * this�������������
 * 	1������ʹ����ʵ�������д���ǰ�����﷨��ʽthis.��
 * 	2������ʹ���ڹ��췽���У�ͨ����ǰ�Ĺ��췽�����������Ĺ��췽�����﷨��ʽthis(ʵ��)��
 * 	3�������ص㣺this()�����﷨ֻ�ܳ����ڹ��캯���ĵ�һ��
 * @author Lin
 *
 */
public class Date {

	// ����
	private int year;
	private int month;
	private int day;

	// ���캯��
	public Date(int year, int month, int day) {

		//����
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
/**
 * ���󣺵�����Ա����һ���޲����Ĺ��췽����ʱ��Ĭ�ϴ��������ǡ�1970-1-1��
 */
	public Date() {
		
		/*
		this.year = 1970;
		this.month = 1;
		this.day = 1;
		*/
		//���ϴ������ͨ��������һ�����췽�������
		//����ǰ�᲻�ܴ����������´����ʾ������һ��ȫ�µĶ���
		//new Date(1970,1,1);
		
		//��Ҫ���µ��﷨��ɹ��췽����d����
		//z���ַ�ʽ���ᴬ���µĶ���
		this(1970,1,1);
	}


	// setter and getter
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	
	//�����ṩһ���������Ѿ����ڴ�ӡ���������̨
	//ʵ������
	public void print() {
		System.out.println(this.year + "��" + this.month + "��" + this.day + "��");
	}
}
