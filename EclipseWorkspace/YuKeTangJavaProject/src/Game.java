import java.util.Scanner;
import java.util.Random;

class Game {
	public static void main(String[] args) {
		int count = 0;
		Random r = new Random();
		int num = r.nextInt(1000);
		System.out.println("ϵͳ�Ѿ����������һ��1-999�������²�����˭�ɣ�");
		System.out.println(num);
		Scanner s = new Scanner(System.in);
		int y = 0;
		while (true) {
			// �û�����һ������
			int x = s.nextInt();
			if (x < 1 || x > 999)
				System.out.println("��Ϲ������1-999�������ˣ�");
			else {
				if (y == x) {
					System.out.println("���Ѿ��¹���������");
				} else {
					if (x > num) {
						System.out.println("̫����");
						y = x;
						count++;
					} else if (x < num) {
						System.out.println("̫С��");
						y = x;
						count++;
					} else {
						count++;
						System.out.println("��ʹ����" + count + "�λ���¶���!");
						break;
					}
				}
			}
		}
		switch (count) {
		case 1:
			System.out.println("������Ǹ������˹��");
			break;

		case 2:
		case 3:
		case 4:
			System.out.println("����������������㣡");
			break;
		default:
			System.out.println("ɵð����ã�");
			break;
		}
	}
}
