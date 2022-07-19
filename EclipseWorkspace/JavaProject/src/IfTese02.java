/*
 	需求：
 		假定系统给定一个人的年龄，根据年龄来判断这个人处于生命的那个阶段，年龄必须在{0-150]
 		[0-5]		幼儿
 		[6-10]		少儿
 		[11-18]		青少年
 		[19-35]		青年
 		[36-55]		中年
 		[56-150]	老年
 		
 */
public class IfTese02 
{
	public static void main(String[] args) {
		//1、接收键盘输入，年龄【輸入的时候必须是数字】
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入您的年龄:");//输出提示信息
		int age = s.nextInt();
		//System.out.println("age =" + age);
		
		//2、根据需求进行业务逻辑判断
		String str = "老年";
		if(age < 0 || age > 150) {
			str = "您提供的年龄不合法，年龄之需要在[0-150]之间";
		}else if(age <= 5) {
			str = "您处于生命周期的幼儿阶段";
		}else if(age <= 10) {
			str = "您处于生命周期的少年阶段";
		}else if(age <= 18) {
			str = "您处于生命周期的青少年阶段";
		}else if(age <= 35) {
			str = "您处于生命周期的青年阶段";
		}else if(age <= 55) {
			str = "您处于生命周期的中年阶段";
		}
		System.out.println(str);
	}
}
