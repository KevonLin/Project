/*
 	����java��������е�break���
 	
 		1��break��Java�����еĹؼ��֣�������Ϊ���ж�/�۶ϡ�
 		
 		2��break; �ɳ�Ϊһ��������������jacaranda���
 		
 		3��break��������switch����У�������ֹswitch���
 		
 		4��break������ֹѭ�����
 		
 		5��break��ֹ�ĸ�ѭ����
 		
 		6��break�����ʹ����for��while��do..whileѭ�����������ѭ������ֹѭ��������
 		������߳����ִ��Ч��
 		
 		7��һ��forѭ��Ϊ������break�����
 		
 		8��Ĭ������£�break��ֹ���������������䡣Ҳ���Ը�ѭ��������ָֹ����ѭ��
 		
 */
public class BreakTest01 {
	public static void main(String[] args) {
		
		//��for����
		//break�����ж�ѭ����䣬�������ѭ����
		 for1:for(int j=0;j<10;j++) {
			 for2:for(int i=0;i<10;i++) {
				 if(i == 5) {
					 break for1;
				 }
				 System.out.println("i-->" + i);
			 }
		 }
	
	System.out.println("Hello World!");
	}
}
