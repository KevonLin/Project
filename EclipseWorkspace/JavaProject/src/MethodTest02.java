/*
 	һ��ʹ�÷������ƣ������е�
 		*����õ����ظ�ʹ��
 		
 	�����ı�����ʲô��
 	
 		*��������һ�δ���Ƭ�Σ�������δ���Ƭ�ο������ĳ���ض��Ĺ��ܣ����ҿ��Ա��ظ�ʹ��
 		
 	������ӦMethod
 	��C�����н�������(Function)
 	
�� 	���������������У���һ�����п��Զ�����������û���Ⱥ�˳��
 	�������в����ٶ��巽�����������еĴ�����˳��
 	��������Java��乹�ɣ��������еĴ������϶�������
 */
public class MethodTest02 {
	public static void main(String[] args) {
		
		MethodTest02.sumInt(10,20);
		
		MethodTest02.sumInt(666,888);
		
		MethodTest02.sumInt(111,222);
		
	}
	
	public static void sumInt(int a,int b) {
		int c = a + b;
		System.out.println(a + "+" + b + "=" + c);
	}
	
}
