/*
 	continue语句：
 	
 		1：continue表示：继续/go on/下一个
 		
 		2、continue;构成一个完整的Java语句
 		主要出现在循环语句中控制循环的执行
 		
 		3、break和continue的区别
 			*break;此循环语句结束
 			*continue;本次循环下面的语句不再进行，表示进入下一次循环
 */
public class ContinueTest01 {
	public static void main(String[] args) {
		
		for(int i = 0;i< 10;i ++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
		
		for(int i = 0;i< 10;i ++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
		//continue也可以指定循环
		//continue for1;
	}
}
