package com.lin.javase.day10.test012;

/**
 * ����Java�����еļ̳�
 * 	1���̳������������������֮һ�����������ֱ��ǣ���װ/�̳�/��̬
 * 
 * 	2���̳л����������ǣ����븴�á����Ǽ̳����Ҫ���������ǣ����˼̳в������Ժ�ġ������ĸ��ǡ��͡���̬���ơ���
 * 
 * 	3���̳е��﷨��ʽ��
 * 		[���η��б�] class ���� extends ������{
 * 			���� = ���� + ����
 * 		}
 * 
 * 	4��Java�����еļ̳�ֻ֧�ֵ��̳У�һ���಻��ͬʱ�̳ж���࣬��C++��֧��
 * 
 * 	5�����ڼ̳��е����ڣ�
 * 		B�� �̳� A�࣬���У�
 * 			A�ࣺ���ࡢ���ࡢ���ࡢsuperclass
 * 			B�ࣺ���ࡢ�����ࡢsubclass
 * 
 * 	6����Java����������̳и��඼�̳���Щ���ݣ�
 * 		- ˽�еĲ�֧�ּ̳�
 * 		- ���췽����֧�ּ̳�
 * 		- �������ݶ����Ա��̳�
 * 
 *	7����ȻJava������֧֧�ֵ��̳У���һ����Ҳ���Լ�Ӽ̳������࣬���磺
 *		C extends B{
 *		}
 *		B extends A{
 *		}
 *		A extends T{
 *		}
 *		Cֱ�Ӽ̳�BҲ���̳�T��A
 *
 * 	8��Java�����м���һ����û����ʾ�ļ̳��κ��࣬����Ĭ�ϼ̳�javase�����ṩ��java.lang.Object�ࡣ
 * 		java�������κ�һ���඼��Object�������
 * 
 */
public class ExtentsTest {
	
	//�������͡�Open Type��Ctrl + Shift + T
	//������Դ��Open Resource��Ctrl + Shift + R
	public static void main(String[] args) {
		ExtentsTest et = new ExtentsTest();
		String s = et.toString();
		System.out.println(s);
		
		CreditAccount act = new CreditAccount();
		act.setActno("act-001");
		act.setBalance(-1000.0);
		act.setCredit(0.99);
		
		System.out.println(act.getActno() + "," + act.getBalance() + "," + act.getCredit());
	}
}
