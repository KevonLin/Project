/*
 	����switch��䣺
 		1��switch���Ҳ����ѡ��ṹ��Ҳ�Ƿ�֧���
 		2��switch�����﷨�ṹ��			
 			һ���Ƚ�������switch���Ӧ������д
 				switch(int��String���͵�����ֵ�����){
 					case int��String���͵�z����ֵ�����:
 						Java���;
 						...
 						break;
	
 					case int��String���͵�z����ֵ�����:
 						Java���;
 						...
 						break;

 					case int��String���͵�z����ֵ�����:
 						Java���;
 						...
 						break;
 						
 					default:
 						java���
 						...
 				}
 		3��switch����ִ��ԭ��
 			switch�����С����zh�еġ����ݡ���case����ġ����ݡ�����һһƥ�䣬ƥ��ɹ�ִ��
 			ƥ��˳�����϶���
 		4��ƥ��ɹ��ķ�ִ֧�У���֧������С�break;�����Ļ�,����switch�����ֹ
 		
 		5��û��break��͸��ֱ֧�ӽ�����һ��֧�����⴩͸��break���
 		
 		6�����з�֧����ƥ��ִ��default�е����
 		
 		7��switch�����case����ֻ����int����String���͵����ݣ�������̽����������
 			
 			*byte��short��charҲ����ֱ��д��switch��case���棬���Խ����Զ�����ת��
 			byte��short��char�����Զ�ת����int���͡�
 			
 			*JDK6��switch��case��������̽��int����
 			
 			*JDK7֮�����7�汾����̽��String���͵�����
 			
 		8��case���Ժϲ���
 		
 				int i = 10;
 				
 				switch(i){
 					case 1:case 2:case 3:case 10:
 					System.out.println("Test Code!");
 				}
 */
public class SwitchTest01 {
	public static void main(String[] args) {
	
	/*
		long a = 10L;
		int b = a;//���뱨��
		
		long x = 100L;
		switch(x) {}//���뱨��
	
	*/
		
		long x = 100L;
		switch ((int)x) {}
		
		byte b = 10;
		switch(b) {}
		
		short d = 10;
		switch(d) {}
		
		char c = 'A';
		switch(c) {}
		
		char cc = 97;
		switch(cc) {}
		
		//���뱨��
		//switch(true){}
		
		String username = "Lin";
		switch(username) {}
		
		/*
		 	��������switch���
		 */
		//�����û���ݔ�룺
		//1��ʾ����һ
		//...
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("���������֣�");
		int num = s.nextInt();
		switch(num) {
			case 1 :
				System.out.println("����һ");
				break;
			case 2 :
				System.out.println("���ڶ�");
				break;
			case 3 :
				System.out.println("������");
				break;
			case 4 :
				System.out.println("������");
				break;
			case 5 :
				System.out.println("������");
				break;
			case 6 :
				System.out.println("������");
				break;
			case 7 :
				System.out.println("������");
				break;
			default :
				System.out.println("�Բ�������������ַǷ�");

		}
		System.out.println("-------------------------");
		
		//case��͸
		switch(num) {
			case 1 :
				System.out.println("����һ");
			
			case 2 :
				System.out.println("���ڶ�");
				
			case 3 :
				System.out.println("������");
			
			case 4 :
				System.out.println("������");
			
			case 5 :
				System.out.println("������");
								
			case 6 :
				System.out.println("������");
			
			case 7 :
				System.out.println("������");
			
			default :
				System.out.println("�Բ�������������ַǷ�");
		}
		
		//case�ϲ�
		switch(num) {
		case 1 : case 0 :
			System.out.println("����һ");
			break;
		case 2 :
			System.out.println("���ڶ�");
			break;
		case 3 :
			System.out.println("������");
			break;
		case 4 :
			System.out.println("������");
			break;
		case 5 :
			System.out.println("������");
			break;		
		case 6 :
			System.out.println("������");
			break;
		case 7 :
			System.out.println("������");
			break;
		default :
			System.out.println("�Բ�������������ַǷ�");
		}
	}
}
