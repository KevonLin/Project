/*
 	�ó������鷽�����ص��е㣺
 		*����Ա���÷���ʱ����Ҫ�������ķ�����
 		
 		*��������
 		
 	ǰ�᣺�������ƣ�������������ͬ��
 	
 	���ǣ����ܲ�ͬ��ʱ��Ŷ�������������������������ֲ�ͬ��
 */
public class OverloadTest02 {
	public static void main(String[] args) {
		
		//���÷�����ʱ�������ʹ��ͬһ������һ����
		//�������Ͳ�ͬ����Ӧ���õķ���b��ͬ��
		//��ʱ���ַ��������������������������ǲ������������͡�
		System.out.println(sum(1,2));
		System.out.println(sum(1.0,2.0));
		System.out.println(sum(1L,2L));
	}
	public static int sum(int a,int b) {
		return a + b;
	}
	public static long sum(long a,long b) {
		return a + b;
	}
	public static double sum(double a,double b) {
		return a + b;
	}
}
