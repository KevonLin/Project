/*
 	����
 		�ٶ�ϵͳ����һ���˵����䣬�����������ж�����˴����������Ǹ��׶Σ����������{0-150]
 		[0-5]		�׶�
 		[6-10]		�ٶ�
 		[11-18]		������
 		[19-35]		����
 		[36-55]		����
 		[56-150]	����
 		
 */
public class IfTese02 
{
	public static void main(String[] args) {
		//1�����ռ������룬���䡾ݔ���ʱ����������֡�
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("��������������:");//�����ʾ��Ϣ
		int age = s.nextInt();
		//System.out.println("age =" + age);
		
		//2�������������ҵ���߼��ж�
		String str = "����";
		if(age < 0 || age > 150) {
			str = "���ṩ�����䲻�Ϸ�������֮��Ҫ��[0-150]֮��";
		}else if(age <= 5) {
			str = "�������������ڵ��׶��׶�";
		}else if(age <= 10) {
			str = "�������������ڵ�����׶�";
		}else if(age <= 18) {
			str = "�������������ڵ�������׶�";
		}else if(age <= 35) {
			str = "�������������ڵ�����׶�";
		}else if(age <= 55) {
			str = "�������������ڵ�����׶�";
		}
		System.out.println(str);
	}
}
