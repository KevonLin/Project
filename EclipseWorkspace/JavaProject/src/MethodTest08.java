/*
 	�����ķ���ֵ����void��ʱ��
 	
 		1������ֵ����void��ʱ��
 			Ҫ�󷽷����뱣֤�ٷְ�ִ�С�return ֵ;����������������ֵ�ķ��ء�
 			û��������������ᱨ��/
 			
 		2��һ�������з���ֵ��ʱ�򣬵����ǵ������������ʱ�򣬷�����һ��ֵ
 		���ڵ�������˵���������ֵ����ѡ����գ�Ҳ����ѡ�񲻽��ա�
 		�󲿷�����·���ֵ��Ҫ���ա�
 */
public class MethodTest08 {
	public static void main(String[] args) {
		
		//���÷���
		divide(10,3);//û�н�����������ķ�������
		
		//���ñ�������
		//����������������Ҫ�ͷ���ֵ��������ͬ�����߿����Զ�����ת��
		//boolean b = divide(10,3);//���뱨�����Ͳ�����
		
		//��ֵ�����Ƿ���ұ������ԣ���ִ�н����ֵ����ߵı���
		int i = divide(10,3);
		System.out.println(i);
		
		long x = divide(10,3);
		System.out.println(x);
		
		System.out.println(divide(10,3));
		
		
	}
	
	/*
	 	����
	 		�붨�岢ʵ��һ���������÷������Լ�������int�������ݵ���
	 		Ҫ�����յļ��������ظ�������
	 */
	
	//�������ȱ�ٷ������
	/*
	public static int divide(int a,int b) {
		
	}
	*/
	
	//���뱨��ȱ�ٷ���ֵ
	/*
	public static int divide(int a,int b) {
		return;
	}
	*/
	
	//���뱨��Ҫ�󷵻�int���͵�ֵ
	/*
	public static int divide(int a,int b) {
		return true;
	}
	*/
	
	public static int divide(int a,int b) {
		//System.out.println("Hello");
		return a/b;
	}
}
