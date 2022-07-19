/*
 	需求：
 	
 		判断当前的天气：
 			当外边下雨的时候：
 				带雨伞：
 					判断性别：
 						当性别为男：带一把打黑伞
 						当性别为女：带一把小花伞
 			当外边是晴天的时候：
 				判断天气的温度：
 					当天气温度在30℃以上：
 						当性别为男：戴墨镜
 						当性别为女：擦防晒霜
 		
 	提示：
 		1、一定会用到嵌套
 		2、天气情况、温度、性别都需要从键盘輸入
 			天气情况：1表示下雨、2表示晴天
 			温度直接使用数字即可
 			性别：1表示男、2表示女
 */
public class IfTest03 {
	public static void main(String[] args) {
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.println("欢迎使用本系统！");
		System.out.println("说明1：1表示下雨，2表示晴天");
		System.out.println("说明2：1表示男，2表示女");
		System.out.println("说明3：温度为数字");
		
		//接收性别
		System.out.print("请输入性别");
		int sex = s.nextInt();
		
		if (sex < 1 || sex > 2) {
			System.out.println("您输入的年龄不合法");
		}
		
	
		//接收天气情况
		System.out.print("请输入当前天气：");
		int weather = s.nextInt();
		
		//判断天气情况
		if (weather == 1) {
			//System.out.println("下雨天");
			if(sex == 1 ) {
				System.out.println("带一把大黑伞");
			}else if(sex == 2) {
				System.out.println("带一把小花伞");
			}
			
		}else if(weather == 2) {
			//System.out.println("晴天");

			
				//接收温度情况
			System.out.print("请输入当前温度：");
			int tem = s.nextInt();
		
			//判断温度情况
			if(tem >= 30) {
				if(sex == 1) {
					System.out.println("戴墨镜");
				}else if(sex == 2){
					System.out.println("涂防晒霜");
				}
			}else {
				System.out.println("裸奔");
			}
		}
	}
}
