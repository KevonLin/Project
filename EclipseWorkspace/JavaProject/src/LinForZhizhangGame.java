
import java.util.Random;
public class LinForZhizhangGame {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);

		System.out.println("��ӭʹ��ע��ϵͳ");

		String username,password;
		
		System.out.println("���������Աָ�������ο����������ַ����س�����");
		String admin = s.next();
		if(admin.equals("ADMIN")) {
			System.out.println("��ӭ����Ա���汾��Ϸ��");
				//���������λ��
				int num =(int)((Math.random()*9+1)*100);
				System.out.println("ϵͳ�Ѿ����������һ����λ�����²�����˭�ɣ�");
				
				int y = 0;
				int count = 0;
				while(true) {
					//�û�����һ������
					int x = s.nextInt();
					if(y == x) {
						
					System.out.println("���Ѿ��¹���������");
					}else {
						if(x > num) {
							System.out.println("̫����");
							System.out.println("����һ�ΰɣ�");
							y = x;
							count++;
						}
						else if(x < num) {
							System.out.println("̫С��");
							System.out.println("����һ�ΰɣ�");
							y = x;
							count++;
						}
						else {
							System.out.println("�¶���,�����!");
							count ++;
							break;
						}
					}
				}
			
				System.out.println("������"+ count +"�λ���¶��ˣ�");
			}else {
			
			
			
			System.out.println("������������Ϊ�û���");
			username = s.next();
			System.out.println("���������õ�½����");	
			password = s.next();
			
			
			
			while(true) {
				System.out.print("�������û�����");
				String user = s.next();
				System.out.print("���������룺");
				String pas = s.next();
					
				
				if(username.equals(user) && password.equals(pas)) {
					
					
					
					if(user.equals("����") && pas.equals(pas)) {
						System.out.println("");
						System.out.println("��½�ɹ�����ӭ�����ϡ�����������������С��Ϸ");
						System.out.println("");
						break;
					}
					if(user.equals("���ϼ�") && pas.equals(pas)) {
						System.out.println("");
						System.out.println("��½�ɹ�����ӭ����Ů�ˡ�����������������С��Ϸ");
						System.out.println("");
						break;	
					}
	
				}else {
					System.out.println("���û���δע�ᣬ����ϵ������Ա");
					}
					
			}
			
				
	
	
			//���������λ��
			int num =(int)((Math.random()*9+1)*100);
			System.out.println("ϵͳ�Ѿ����������һ����λ�����²�����˭�ɣ�");
			
			int count = 0;
			while(true) {
				//�û�����һ������
				int x = s.nextInt();
				if(x > num) {
					System.out.println("̫����");
					System.out.println("����һ�ΰɣ�");
					count++;
				}
				else if(x < num) {
					System.out.println("̫С��");
					System.out.println("����һ�ΰɣ�");
					count++;
				}
				else {
					System.out.println("�¶���,�����!");
					break;
				}
				
			}
		
			System.out.println("������"+ count +"�λ���¶��ˣ�");
		}
		
	}
}
