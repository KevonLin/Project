/*
 	����
 	
 		�жϵ�ǰ��������
 			����������ʱ��
 				����ɡ��
 					�ж��Ա�
 						���Ա�Ϊ�У���һ�Ѵ��ɡ
 						���Ա�ΪŮ����һ��С��ɡ
 			������������ʱ��
 				�ж��������¶ȣ�
 					�������¶���30�����ϣ�
 						���Ա�Ϊ�У���ī��
 						���Ա�ΪŮ������ɹ˪
 		
 	��ʾ��
 		1��һ�����õ�Ƕ��
 		2������������¶ȡ��Ա���Ҫ�Ӽ���ݔ��
 			���������1��ʾ���ꡢ2��ʾ����
 			�¶�ֱ��ʹ�����ּ���
 			�Ա�1��ʾ�С�2��ʾŮ
 */
public class IfTest03 {
	public static void main(String[] args) {
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.println("��ӭʹ�ñ�ϵͳ��");
		System.out.println("˵��1��1��ʾ���꣬2��ʾ����");
		System.out.println("˵��2��1��ʾ�У�2��ʾŮ");
		System.out.println("˵��3���¶�Ϊ����");
		
		//�����Ա�
		System.out.print("�������Ա�");
		int sex = s.nextInt();
		
		if (sex < 1 || sex > 2) {
			System.out.println("����������䲻�Ϸ�");
		}
		
	
		//�����������
		System.out.print("�����뵱ǰ������");
		int weather = s.nextInt();
		
		//�ж��������
		if (weather == 1) {
			//System.out.println("������");
			if(sex == 1 ) {
				System.out.println("��һ�Ѵ��ɡ");
			}else if(sex == 2) {
				System.out.println("��һ��С��ɡ");
			}
			
		}else if(weather == 2) {
			//System.out.println("����");

			
				//�����¶����
			System.out.print("�����뵱ǰ�¶ȣ�");
			int tem = s.nextInt();
		
			//�ж��¶����
			if(tem >= 30) {
				if(sex == 1) {
					System.out.println("��ī��");
				}else if(sex == 2){
					System.out.println("Ϳ��ɹ˪");
				}
			}else {
				System.out.println("�㱼");
			}
		}
	}
}
