/*
 	ѭ��������������Ƕ��ʹ�á�for��if��Ƕ�ס�
 */
public class ForTest04 {
	public static void main(String[] args) {
		
		//�ҳ�1~100����������
		//��һ�ַ�������1��ʼ��ÿ�ε���2
		for(int i=1;i<=100;i+=2) {
			System.out.println("������" + i);
		}
		//�ڶ��ַ�������1��ʼ��ÿ�ε���1��ÿ�����ݽ����жϣ���������2������
		for(int i=1;i<=100;i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		//�������ַ���������ѡ���һ�ַ���
	}
}
