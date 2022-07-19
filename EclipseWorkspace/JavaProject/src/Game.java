import java.util.Random;
public class Game {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		//随机生成三位数
		int num =(int)((Math.random()*9+1)*100);
		System.out.println("系统已经随机生成了一个三位数，猜猜它是谁吧！");
		
		int y = 0;
		int count = 0;
		while(true) {
			//用户输入一个数字
			int x = s.nextInt();
			if(y == x) {
				
			System.out.println("您已经猜过该数字了");
			}else {
				if(x > num) {
					System.out.println("太大了");
					System.out.println("再试一次吧！");
					y = x;
					count++;
				}
				else if(x < num) {
					System.out.println("太小了");
					System.out.println("再试一次吧！");
					y = x;
					count++;
				}
				else {
					System.out.println("猜对了,真聪明!");
					count ++;
					break;
				}
			}
		}
	}
}
