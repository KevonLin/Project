/*
 	��������:
 	
 		1�����������η��б�����static�ؼ��֣������ĵ��÷�ʽʱ������.������(ʵ���б�);
 		
 		2����ʱ����������ʡ��
 			m1(){
 				m2();
 			}
 			m1������m2������ͬһ�����е�ʱ�� ������.������ʡ�Բ�д
 			
 		3��������һ��JavaԴ�ļ���ֻ����һ��class
 		
 */
public class MethodTest06 {
	public static void main(String[] args) {
		
		//���÷���
		MethodTest06.m();
		
		//���ڷ��������η��б�����static�ؼ��ֵģ�������.�ؼ��֡�����ʡ�Բ�д��
		m();
		
		//���������ࡾ���Ǳ����еġ�����
		A.doOther();
		
		//��ʡ�ԡ�����.��
		//���뱨��ʡ��֮��ֻ�ܴӵ�ǰ�����Ҹ÷�����
		//doOther();
		
	}
	
	public static void m() {
		System.out.println("m method execute!");
		m2();//ʡ�˵��ñ����еķ���
	}
	
	public static void m2() {
		System.out.println("m2 method execute!");
		A.m2();//���ϡ���.�����������ö�Ӧ���еķ���
	}
	
}

class A
{
	public static void doOther() {
		System.out.println("A's doOther method invoke!");
	}
	
	public static void m2() {
		System.out.println("m2 execute!");
	}
}
