/*
 	�����õݹ����1~n�ĺ� [���Բ��õݹ龡�����õݹ�]
 */
public class RecusionTest02 {
	public static void main(String[] args) {
		
		/*
		//1~4�ĺ�
		int n = 4;
		int sum = 0;
		for(int i = 1;i<=4;i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
		*/
		int n = 4;
		int retValue = sum(n);
		System.out.println(retValue);
		
		n = 10;
		retValue = sum(n);
		System.out.println(retValue);
		
	}
	
	//��������һ������������һ�������Ĺ��ܣ��������1~n�ĺ�
	public static int sum(int n) {
		int result = 0;
		for(int i = 1;i<=n;i++) {
			result += i;
		}
		return result;
	}
}
