/*
 	ÿ�����ж����Ա�д��������һ�������
 	һ��ϵͳֻ��һ����ڣ�����һ��������һ��дһ��
 */
public class ProductTest {
	//�������
	public static void main(String[] args) {
		
		//����������Ʒ����
		//iphone7�ֲ�����
		//iphone7����
		//iphone7�����б����ڴ��ַָ���ڴ��е���Ʒ����
		Product iphone7 = new Product();
		
		//����ʵ���������﷨������.������
		System.out.println("��Ʒ�ı�ţ�" + iphone7.productNo);
		System.out.println("��Ʒ�ĵ��ۣ�" + iphone7.price);
		
		iphone7.productNo = 111;
		iphone7.price = 6800.0;
		
		System.out.println("��Ʒ�ı�ţ�" + iphone7.productNo);
		System.out.println("��Ʒ�ĵ��ۣ�" + iphone7.price);
		
		//���뱨��
		//ʵ�����������ȴ�������ͨ������.�ķ�ʽ���ʣ�����ֱ��ʹ������.�ķ�ʽ���� 
		//System.out.println(Product.price);
	}
}
