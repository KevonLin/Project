/*
 	Java语言中if语句，属于选择结构，if语句又被称分支语句/条件控制语句：
 		1、if语句的语法结构：四种编写方式
 			第一种：
 				if(布尔表达式【true/false】){
 					java语句;
 					java语句;
 					java语句;
 					...
 				}
 			第二种：
 				if(布尔表达式){
 					java语句;
 					...
 				}else{
 					java语句;
 					...
 				}
 				
 			第三种:
 			只要一个成立，if语句结束
 				if(布尔表达式){
 					java语句
 					java语句
 					...
 				}else if(布尔表达式){
 					java语句
 					java语句
 					...
 				}else if(布尔表达式){
 					java语句
 					java语句
 					...
 				}
 				
 			第四种：
 			如果上边的都不成立则执行最后一个else
 				if(布尔表达式){
 					java语句
 					java语句
 					...
 				}else if(布尔表达式){
 					java语句
 					java语句
 					...
 				}else if(布尔表达式){
 					java语句
 					java语句
 					...
 				}else if(布尔表达式){
 					java语句
 					java语句
 					...
 				}else{
 					java语句
 					java语句
 					...
 				}
 					
 		2、重点：对于Java中的if语句，只要有一个分支执行，整个if语句全部结束
 		
 		3、注意：以上第二种和第四种带有else，一定有一个分支执行
 		
 		4、所有的控制语句都可以嵌套使用，只要合理嵌套就行。
 			if(){
 				if(){
 					if(){
 						
 						}
 					}
 			}else{
 				if(){
 					if(){
 						if(){
 							}
 						}
 					}
 				}
 				
 		5、注意缩进
 		
 		5、if语句的分支中只有一条Java语句的话，达阔靠可以省略不写。
 			if(true/false){
 				一条java语句
 				}
 				
 			if(true/falese) 一条java语句;
 		
 		
 */
public class IfTest01 {
	public static void main(String[] args) {
		
		//需求：所在位置的五公里范围内有肯德基的话，去KFC吃午饭
		
		//公里数
		double distance = 4.0;//单位km
		//判断语句
		if(distance < 5) {
			System.out.println("去FFC吃饭");
		}else {
			System.out.println("所在位置五公里范围内没有KFC");
		}
		
		/*需求：
			假设系统给定一个考生的成绩，成绩带有小数点。成绩范围[0-100]
			根据学生的成绩判断该学生的成绩等级：
				[90-100]	A
				[80-90)		B
				[70-80)		C
				[60-70)		D
				(0-60)		E
				
			以上的逻辑判断采用if语句完成
		*/
		
		double score = 59.9;
		score = 100;
		
		if(score < 0 || score >100) {
			System.out.println("对不起，您输入的考生成绩不合法");
		}else if( score >= 90 ) {
			System.out.println('A');
		}else if( score >= 80) {
			System.out.println('B');
		}else if( score >=70) {
			System.out.println('C');
		}else if( score >= 60) {
			System.out.println('D');
		}else if( score >= 0){
			System.out.println('E');							
		}
		
		String grade = "该考生的考试成绩等级时:E等级";
		
		if(score < 0 || score >100) {
			grade = "对不起，您输入的考生成绩不合法";
		}else if( score >= 90 ) {
			grade = "该考生的考试成绩等级时:A等级";
		}else if( score >= 80) {
			grade = "该考生的考试成绩等级时:B等级";
		}else if( score >= 70) {
			grade = "该考生的考试成绩等级时:C等级";
		}else if( score >= 60) {
			grade = "该考生的考试成绩等级时:D等级";
		}

		System.out.println(grade);
	}	
}
	

