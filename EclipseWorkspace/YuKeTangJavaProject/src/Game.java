import java.util.Scanner;
import java.util.Random;

class Game {
	public static void main(String[] args) {
		int count = 0;
		Random r = new Random();
		int num = r.nextInt(1000);
		System.out.println("系统已经随机生成了一个1-999的数，猜猜它是谁吧！");
		System.out.println(num);
		Scanner s = new Scanner(System.in);
		int y = 0;
		while (true) {
			// 用户输入一个数字
			int x = s.nextInt();
			if (x < 1 || x > 999)
				System.out.println("别瞎胡来，1-999，看好了！");
			else {
				if (y == x) {
					System.out.println("您已经猜过该数字了");
				} else {
					if (x > num) {
						System.out.println("太大了");
						y = x;
						count++;
					} else if (x < num) {
						System.out.println("太小了");
						y = x;
						count++;
					} else {
						count++;
						System.out.println("您使用了" + count + "次机会猜对了!");
						break;
					}
				}
			}
		}
		switch (count) {
		case 1:
			System.out.println("你可真是个吉尼尔斯！");
			break;

		case 2:
		case 3:
		case 4:
			System.out.println("那你是真的优秀优秀！");
			break;
		default:
			System.out.println("傻冒，你好！");
			break;
		}
	}
}
