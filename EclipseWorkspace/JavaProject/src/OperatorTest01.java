/*
 	���������
 		ע�⣺
 			һ�����ʽ���ж�������������������ȼ�����ȷ���ļ�С���ţ����ȼ��õ�������
 			û��Ҫר�ż�������������ȼ�
 */
public class OperatorTest01 {
	public static void main(String[] args) {
		
		//����++��������Լ�1��
		int k = 10;
		
		k++;
		
		System.out.println(k);
		//++��������Գ����ڱ���ǰ����Ŀ�������
		int y = 10;
		
		++y;
		
		System.out.println(y);
		
		//++ �����ڱ�����
		int a = 100;
		int b = a ++;
		System.out.println(a);
		System.out.println(b);
		//++ �����ڱ���ǰ
		int m = 20;
		int n = ++m;
		System.out.println(m);//21
		System.out.println(n);//21
		
		int e = 100;
		System.out.println(e ++);//100
		System.out.println(e);//101
		
		int s = 100;
		System.out.println(++ s);//101
		System.out.println(s);//101
		System.out.println(-- s);
		System.out.println(s ++);
		
		
		
	}
}
