/*
 	�������أ�
 		1�����������ֱ���Ϊ��overload
 			
 		2��ʲôʱ����ʹ�÷������أ�
 			*�������Ƶ�ʱ�򣬾������÷�������ͬ
 			
 			[���ǣ����ܲ�ͬ/�����Ƶ�ʱ�򣬾������÷�������ͬ]
 			
 		3��ʲô��������֮�󹹳��˷������أ�
 			*��ͬһ������
 			*��������ͬ
 			*�����б�ͬ��
 				-������ͬ
 				-˳��ͬ
 				-���Ͳ�ͬ
 		4��������ʲô�й�ϵ����ʲôû��ϵ��
 			*�������غͷ�����+�����б��й�
 			*�������غͷ���ֵ�����޹�
 			*�������غ����η��б��޹�
 */
public class Overloadtest03 {
	public static void main(String[] args) {
		m1();
		m1(10);
		
		
	}
	//��������������������
	public static void m1() {}
	public static void m1(int a) {}
	
	//��������������������
	public static void m2(int a,double b) {}
	public static void m2(double a, int b) {}
	
	//��������������������
	public static void m3(int x) {}
	public static void m3(double x) {}
	
	/*
	//����������´���ʱ�����ظ�
	public static void m4(int a, int b) {}
	public static void m4(int b, int a) {}
	*/
	
	/*
	public static void x() {
		
	}
	
	public static int x() {
		return 1;
	}
	*/
}
