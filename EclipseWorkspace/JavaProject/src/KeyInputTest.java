/*
 	System.out.println(); ���������̨��������ڴ浽����̨������Ĺ��̣����ڴ��г�����
 	
 	�����û��������룬�ӡ����̡������ڴ桱��������Ĺ��̣����ڴ���ȥ��
 	
 	���´���̶���д�Ϳ��Խ����û����̵����롣
 */
public class KeyInputTest {
	public static void main(String[] args) {
		
		//��һ������������ɨ��������
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		//�ڶ���������Scanner�����next()������ʼ�����û�����ݔ��
		//����ִ�е������ͣ�������ȴ��û���ݔ��
		//���û������ʱ�򣬲��������ûس�����ʱ�򣬼������Ϣ���Զ���ֵ��userInputContent
		//����ִ�е��⣬�û��������Ϣ�Ѿ����ڴ���
		//�����ı������ַ�������ʽ���ܡ�
		//String userInputContent = s.next();
		
		//�������֡�һ������int����ʽ�����ա�
		int num = s.nextInt();
		
		//���ڴ��е��������������̨
		//System.out.println("��������:" + userInputContent);
		
		System.out.println("������������ǣ�" + num);
				
		
	}
}

/*
 	�ܽ᣺��ס���𣬻���ֱ�ӽ����븴��ճ��
 		��һ����
 		
 			java.util.Scanner s = new java.util.Scanner(System.in)
 		
 		�ڶ�����
 		
 			String str = s.next();
 			��
 			int num = s.nextInt();
*/