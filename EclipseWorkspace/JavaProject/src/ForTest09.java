/*
 	��дforѭ���ҳ�1~100�����е�����
 	
 	�������ֱ���Ϊ�������ܱ�1������������
 	
 	����Ŀ֪ʶ�㣺
 		forѭ����ʹ��
 		forѭ����Ƕ��
 		���
 		break
 		ͳ��
 */
public class ForTest09 {
	public static void main(String[] args) {
		
		/*
		 
		 ������������i��j
		iΪ������jΪ������
		�ж�i%j=0 j>1 i>1
		����0������������
		����Ϊ����
		�ж�j==i
		�������i
		�����ѭ����ֹ
		
		*/
		
		/*
		int i,j;
		for(i = 2; i <= 100 ; i++) {
			for(j = 2; j < i; j++) {
				if(i % j == 0) 
					break;
			}
			if(j == i)
				System.out.println(i);
		}
		*/
		
	/*
		�����棺
			��дforѭ���ҳ�1~10000�����е�����
			ÿ8����һ�����
	*/
		
		/*
		System.out.println("------------------------");
		
		int x,y,z;
		z=0;
		for(x = 2; x < 10000; x++) {
			for(y = 2; y < x; y++) {
				if(x % y == 0)
					break;
			}
			if(x == y) {
				System.out.print(x + "\t");
				z++;
				if(z % 8 == 0)
					System.out.print("\n");
			}
		}
		System.out.println("-----------------------------------");
		
		*/
		
		/*
		int a,b;
		
		boolean c = true;
		
		for(a = 2; a < 100;a ++) {
			
			for(b = 2;b < a;b ++) {
				
				if(a % b == 0) {
					
					c = false;
					
					
					
					break;
					
					System.out.println(c ? a + "������" : a + "��������");
				}
			
			}
			
		}
		*/
		
		
		//int m = 7;
	
		
		for(int m = 2;m < 100;m++) {
			boolean isZhiShu = true;
			for(int n = 2;n < m;n++) {
				if(m % n ==0) {
					isZhiShu = false;
					break;
				}
			}
		if(isZhiShu)
		System.out.println(m);
		}
		
		
		//����ͳ�ƻ���
		int count = 0;
		for(int m = 2;m < 100;m++) {
			boolean isZhiShu = true;
			for(int n = 2;n < m;n++) {
				if(m % n ==0) {
					isZhiShu = false;
					break;
				}
			}
		if(isZhiShu)
			System.out.print(m + " ");
			count++;
			if(count == 8) {
				System.out.println();
				count = 0;
			}
			
			
		}
		
	}
}
