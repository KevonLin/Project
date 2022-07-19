
import java.util.Random;
public class LinForZhizhangGame {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);

		System.out.println("欢迎使用注册系统");

		String username,password;
		
		System.out.println("请输入管理员指令，如果是游客输入任意字符按回车跳过");
		String admin = s.next();
		if(admin.equals("ADMIN")) {
			System.out.println("欢迎管理员试玩本游戏！");
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
			
				System.out.println("你用了"+ count +"次机会猜对了！");
			}else {
			
			
			
			System.out.println("请输入姓名作为用户名");
			username = s.next();
			System.out.println("请输入设置登陆密码");	
			password = s.next();
			
			
			
			while(true) {
				System.out.print("请输入用户名：");
				String user = s.next();
				System.out.print("请输入密码：");
				String pas = s.next();
					
				
				if(username.equals(user) && password.equals(pas)) {
					
					
					
					if(user.equals("李萌") && pas.equals(pas)) {
						System.out.println("");
						System.out.println("登陆成功，欢迎☆智障☆试玩李林泽制作的小游戏");
						System.out.println("");
						break;
					}
					if(user.equals("李孟佳") && pas.equals(pas)) {
						System.out.println("");
						System.out.println("登陆成功，欢迎☆老女人☆试玩李林泽制作的小游戏");
						System.out.println("");
						break;	
					}
	
				}else {
					System.out.println("该用户名未注册，请联系制作人员");
					}
					
			}
			
				
	
	
			//随机生成三位数
			int num =(int)((Math.random()*9+1)*100);
			System.out.println("系统已经随机生成了一个三位数，猜猜它是谁吧！");
			
			int count = 0;
			while(true) {
				//用户输入一个数字
				int x = s.nextInt();
				if(x > num) {
					System.out.println("太大了");
					System.out.println("再试一次吧！");
					count++;
				}
				else if(x < num) {
					System.out.println("太小了");
					System.out.println("再试一次吧！");
					count++;
				}
				else {
					System.out.println("猜对了,真聪明!");
					break;
				}
				
			}
		
			System.out.println("你用了"+ count +"次机会猜对了！");
		}
		
	}
}
