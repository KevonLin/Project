/*
 	�ڷ���ֵ����ʱvoid�ķ�����ʹ�á�return;����䡣
 	"return;"�������ڷ���ֵΪvoid�ķ�������Ҫ��������ֹ������"��ִ�С�
 */
public class MethodTest10 {
	public static void main(String[] args) {
		m();
	}
	public static void m() {
		
		for(int i = 0;i<10;i++) {
			if(i == 5) {
			//	return;//������ֹforѭ������ֹ����m()������
				break;//��ֹ��ʱforѭ��
			}
			System.out.println("i -->" + i);
		}
		System.out.println("Hello World!");
	}
	
	
}
