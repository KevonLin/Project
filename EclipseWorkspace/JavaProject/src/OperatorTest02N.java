/*
 	"+" �������Java�����е��������ã�
 	
 		*�ӷ��������
 		*�ַ�������������
 	
 		�Ӻ����߶������֣�һ�����мӷ�����
 		
 		���Ӻ���������ߵ�����ֻҪ��һ���ַ�����һ�������ַ����������㡣
 		���ң���������֮��Ľ������һ���ַ���
 		
 			����+���� ----> ���֡���͡�
 			
 			����+"�ַ���" --> "�ַ���"
 		
 */
public class OperatorTest02N {
	public static void main(String [] args) {
		int a = 10;
		int b = 20;
		
		//Ҫ��̬���10+20=30
		System.out.println(a + "+" + b + "=" + (a + b));
		
		//��������String
		//int�ǻ����������ͣ�i��b��������10��int���͵�����ֵ
		//int i = 10��
		
		//String�������������ͣ�s�Ǳ�������"abc"String���͵�����ֵ
		//String s = "abc";
		
		
		//����������Ͳ�����
		//String ss = 10;
		
		String username = "zhangsan";
		System.out.println("��½�ɹ�����ӭ" + username + "����");
	}
}
