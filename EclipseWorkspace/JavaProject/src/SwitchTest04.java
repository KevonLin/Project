/*
 	ʵ�ּ������е�
 		+
 		-
 		*
 		/
 		%
 		
 	ʵ��˼·��
 		1��ѡ���������ݴӼ���ݔ��
 		2������switch�������ж�
 		3����Ҫ�ӿ���̨�������Σ�
 			*��һ������
 			*�����
 			*�ڶ�������
 		
 		�����ڿ���̨�ϣ�
 			��ӭʹ�ü򵥼�����ϵͳ��
 			�������һ�����֣�10
 			�������������+
 			������ڶ������֣�20
 			��������10 + 20 = 30
		
		
*/
public class SwitchTest04 {
	public static void main(String[]args) {
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("��ӭʹ�ü򵥼�����ϵͳ");
		
		System.out.println("�������һ������");
		int num1 = s.nextInt();
		
		System.out.println("�����������");
		String operator = s.next();
		
		System.out.println("������ڶ�������");
		int num2 = s.nextInt();
		
		int result = 0;
		switch(operator) {
			case "+" :
				result = num1 + num2;
				break;
			case "-" :
				result = num1 - num2;
				break;
			case "*" :
				result = num1 * num2;
				break;
			case "/" :
				result = num1 / num2;
				break;
			case "%" :
				result = num1 % num2;
				break;
			default :
				System.out.println("��ϵͳֻ֧��+��-��*��/��%������������");
		}
		
		System.out.println(num1 + operator + num2 + "=" + result);
		
	}
}
