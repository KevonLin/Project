/*
 	continue��䣺
 	
 		1��continue��ʾ������/go on/��һ��
 		
 		2��continue;����һ��������Java���
 		��Ҫ������ѭ������п���ѭ����ִ��
 		
 		3��break��continue������
 			*break;��ѭ��������
 			*continue;����ѭ���������䲻�ٽ��У���ʾ������һ��ѭ��
 */
public class ContinueTest01 {
	public static void main(String[] args) {
		
		for(int i = 0;i< 10;i ++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
		
		for(int i = 0;i< 10;i ++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
		//continueҲ����ָ��ѭ��
		//continue for1;
	}
}
