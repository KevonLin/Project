/*
 	假设系统给定考生成绩，请判断该考生的成绩等级：
 		
 		1、有效成绩范围：[0-100]
 		
 		2、考试成绩可能带有小数
 		
 		3、考试成绩和等级之间的对照关系
 			[90-100)	A
 			[80-90)		B
 			[70-80)		C
 			[60-70)		D
 			[0-60)		E
 */
public class SwitchTest05 {
	public static void main(String[] args) {
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入成绩：");
		double score = s.nextDouble();
		int grade = (int)(score / 10);
		switch(grade) {
			case 1 : case 2 : case 3 : case 4 : case 5 : case 6: case 7: case 8 : case 9: case 10 :
			break;
			default :
				System.out.println("请输入正确的成绩");
				return;
		}
		switch(grade) {
			case 9 : case 10 :
				System.out.println('A');
				break;
			case 8 :  
				System.out.println('B');
				break;
			case 7 : 
				System.out.println('C');
				break;
			case 6 : 
				System.out.println('D');
				break;
			default :
				System.out.println('E');
		}
	}
}
