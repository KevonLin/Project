/*
 	��Ԫ�����/��Ŀ�����/���������
 		1���﷨����
 			�������ʽ ? ���ʽ1:���ʽ2
 		
 		2����Ԫ�������ִ��ԭ��
 			���������ʽ�Ľ����trueʱ��ѡ����ʽ1��Ϊ�߸���ʽ��ִ�н��
 			���������ʽ�Ľ����falseʱ��ѡ����ʽ2��Ϊ�߸���ʽ��ִ�н��
 */
public class OperatorTest03N {
	public static void main(String[] args) {
		
		
		//����һ�³����Ƿ���Ա���ͨ��
		//���뱨����Ϊ������һ��������Java���
		//sex ? '��' : 'Ů';
		
		boolean sex = false;
		char c = sex ? '��' :  'Ů';
		System.out.println(c); 	 	
		
		sex = true;
		c = sex ? '��' :  'Ů';
		System.out.println(c); 
		
		String s = sex ? "�е�" : "Ů��";
		System.out.println(s);
		
	}
}
