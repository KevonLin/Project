//������
public class OOTest02 {
	public static void main(String[] args) {
		
		//����User����
		//u�Ǿֲ�����
		//u��һ������
		//u�����ڴ��ַֻ����ڴ��User����
		User u = new User();
		
		//���User�����ڲ�ʵ��������ֵ
		System.out.println(u.no);
		System.out.println(u.name);
		System.out.println(u.add);
		
		//�޸�User�����ڲ�ʵ��������ֵ
		u.no = 110;
		u.name = "Jack";//"jack"��һ��Java��������String����	
		u.add = new Address();
		
		//��main������Ŀǰֻ��ka����һ�����á�u��
		//һ�ж���ֻ��ͨ��u�����з���
		System.out.println(u.name + "��ס���ĸ����У�" + u.add.city);
		System.out.println(u.name + "��ס���ĸ��ֵ���" + u.add.street);
		System.out.println("�ʱࣺ" + u.add.zipcode);
		
		u.add.city = "����";
		u.add.street = "����";
		u.add.zipcode = "10000";
		
		System.out.println(u.name + "��ס���ĸ����У�" + u.add.city);
		System.out.println(u.name + "��ס���ĸ��ֵ���" + u.add.street);
		System.out.println("�ʱࣺ" + u.add.zipcode);
	}
}
