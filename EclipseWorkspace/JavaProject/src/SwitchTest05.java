/*
 	����ϵͳ���������ɼ������жϸÿ����ĳɼ��ȼ���
 		
 		1����Ч�ɼ���Χ��[0-100]
 		
 		2�����Գɼ����ܴ���С��
 		
 		3�����Գɼ��͵ȼ�֮��Ķ��չ�ϵ
 			[90-100)	A
 			[80-90)		B
 			[70-80)		C
 			[60-70)		D
 			[0-60)		E
 */
public class SwitchTest05 {
	public static void main(String[] args) {
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("������ɼ���");
		double score = s.nextDouble();
		int grade = (int)(score / 10);
		switch(grade) {
			case 1 : case 2 : case 3 : case 4 : case 5 : case 6: case 7: case 8 : case 9: case 10 :
			break;
			default :
				System.out.println("��������ȷ�ĳɼ�");
				return;
		}
		switch(grade) {
			case 9 : case 10 :
				System.out.println('A');
				break;
			case 8 :  
				System.out.println('B');
				break;
			case 7 : 
				System.out.println('C');
				break;
			case 6 : 
				System.out.println('D');
				break;
			default :
				System.out.println('E');
		}
	}
}
