import java.util.Scanner;

public class nDeJieCheng {

	public static void main(String[] args) {
/*
		// ��ͨѭ��ʵ�ּ���n�Ľ׳�
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int sum = 1;
		for (int x = 1; x <= i; x++) {
			sum = sum * x;
		}
		System.out.println(sum);
*/
		System.out.println("������Ҫ����׳˵����֣�");
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		System.out.println(jc(t));
		//�ݹ鷽��
	}
	// �ݹ鷽��ʵ�ּ���n�Ľ׳�
	public static int jc(int a) {
		if(a == 1) {
			return 1;
		}else {
			int result = a * jc(a-1);
			return result;
		}
	}
}
