/*
 	编写for循环找出1~100中所有的素数
 	
 	素数：又被称为质数，能被1和自身整除。
 	
 	改题目知识点：
 		for循环的使用
 		for循环的嵌套
 		标记
 		break
 		统计
 */
public class ForTest09 {
	public static void main(String[] args) {
		
		/*
		 
		 定义两个变量i，j
		i为除数，j为被除数
		判断i%j=0 j>1 i>1
		等于0整除则不是素数
		否则为素数
		判断j==i
		成立输出i
		否则该循环终止
		
		*/
		
		/*
		int i,j;
		for(i = 2; i <= 100 ; i++) {
			for(j = 2; j < i; j++) {
				if(i % j == 0) 
					break;
			}
			if(j == i)
				System.out.println(i);
		}
		*/
		
	/*
		升级版：
			编写for循环找出1~10000中所有的素数
			每8个换一行输出
	*/
		
		/*
		System.out.println("------------------------");
		
		int x,y,z;
		z=0;
		for(x = 2; x < 10000; x++) {
			for(y = 2; y < x; y++) {
				if(x % y == 0)
					break;
			}
			if(x == y) {
				System.out.print(x + "\t");
				z++;
				if(z % 8 == 0)
					System.out.print("\n");
			}
		}
		System.out.println("-----------------------------------");
		
		*/
		
		/*
		int a,b;
		
		boolean c = true;
		
		for(a = 2; a < 100;a ++) {
			
			for(b = 2;b < a;b ++) {
				
				if(a % b == 0) {
					
					c = false;
					
					
					
					break;
					
					System.out.println(c ? a + "是素数" : a + "不是素数");
				}
			
			}
			
		}
		*/
		
		
		//int m = 7;
	
		
		for(int m = 2;m < 100;m++) {
			boolean isZhiShu = true;
			for(int n = 2;n < m;n++) {
				if(m % n ==0) {
					isZhiShu = false;
					break;
				}
			}
		if(isZhiShu)
		System.out.println(m);
		}
		
		
		//加入统计机制
		int count = 0;
		for(int m = 2;m < 100;m++) {
			boolean isZhiShu = true;
			for(int n = 2;n < m;n++) {
				if(m % n ==0) {
					isZhiShu = false;
					break;
				}
			}
		if(isZhiShu)
			System.out.print(m + " ");
			count++;
			if(count == 8) {
				System.out.println();
				count = 0;
			}
			
			
		}
		
	}
}
