import java.util.Random;
public class Game {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
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
	}
}
