
//�������õ�ʱ��ʵ�κ��β�Ҫ�������Ӧ��ͬ���������Ͷ�Ӧ��ͬ
//���Ͳ�ͬ��ʱ��Ҫ���ܹ�������Ӧ���Զ�����ת��

public class MethodTest05 {
	public static void main(String[] args) {
		//������󣺲���������ͬ
		//MethodTest05.sum();
		
		//�������ʵ�κ��βε����Ͳ���Ӱͬ
		//MethodTest05.sum(true, false);
		
		MethodTest05.sum(10L, 20L);
		
		//�����Զ�����ת����int-->long
		MethodTest05.sum(10,20);
		
		//������󣺲������Ͳ�ͬ
		//MethodTest05.sum(3.0,20);
		
		//����
		MethodTest05.sum((long)3.0,20);
		
	}
	
	public static void sum(long a,long b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}
	
}
