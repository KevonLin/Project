/*
 	whileѭ�����
 		1��whileѭ�����﷨�ṹ
 			while(�������ʽ){
 				ѭ����;
 			}
 			
 		2��whileѭ����ѭ��ԭ��
 			���жϲ������ʽ�Ľ��
 				*true
 				 	-ִ��ѭ����
 				  		*�жϲ������ʽ�Ľ��
 				  			-true
 				  				...
 				  			-false
 				  				ѭ������
 				
 				*false
 					-ѭ������
 			
 		3��whileѭ����ѭ������
 			0~n��
 			whileѭ����ѭ�������ִ��0��
 */
public class WhileTest01 {
	public static void main(String[] args) {
		
		//��ѭ���±ߵ���䲻��ִ�б��뱨��
	/*	while(true) {
			System.out.println("��ѭ��");
		}
	*/
		//����ͨ������Ϊ�����ڲ��ܽ�������
		int i = 10;
		int j = 3;
		while(i > j) {
			System.out.println("�Ǻ�");
		}
		//��������޷��������
		//System.out.println("Hello World");
		
	}
}
