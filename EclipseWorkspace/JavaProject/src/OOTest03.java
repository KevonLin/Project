
public class OOTest03 {
	public static void main(String[] args) {
		
		User u = new User();
		//�ϸ��汾д��
		//u.add = new Address();
		
		//a������
		//a�Ǿֲ�����
		Address a = new Address();
		u.add = a;
		
		System.out.println(u.add.city);//null
		
		a.city = "���";
		
		System.out.println(u.add.city);
		
		
	}
}
