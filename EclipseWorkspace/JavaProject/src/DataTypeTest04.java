/*
 	����java�����е������ͣ�
 	��������		ռ�ÿռ��С		Ĭ��ֵ		ȡֵ��Χ
 -------------------------------------------------
 	byte			1			0			[-128~127]
 	short			2			0			[-32768~32767]
 	int				4			0			[-2147483648~2147483647]
 	long			8			0L			
 	
 1��java�����С�����������ֵ����Ĭ�ϵ���int���ʹ���
 		ʮ���ơ���һ��ȱʡĬ�Ϸ�ʽ��
 		�˽��ơ���0��ͷ��
 		ʮ�����ơ���0x��ͷ��
 
 */
public class DataTypeTest04 {
	public static void main(String[] args) {
	
		int a = 10;
		int b = 010;
		int c = 0x10;
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a + b + c);
		
		int i = 123;
		System.out.println(i);
		
		//456����������ֵ������int���ʹ���ռ��4���ֽ�
		//x��������ʱ��long���ͣ�ռ��8���ֽ�
		long x = 456;
		System.out.println(x);
		
		long y = 2147483647;
		System.out.println(y);
		
		//����int��Χ
		//���������2147483648ʹ��һ��ʼ�ͱ�����long���ʹ���
		//����ֵ���L
	/*	long z = 2147483648;
		System.out.println(z);
	*/	
		long z = 2147483648L;
		System.out.println(z);
		
		
	}
}
