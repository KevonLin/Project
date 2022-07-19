/*
 	for循环嵌套for循环
 */
public class ForTest06 {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			
			//控制提中可以编写其他控制语句
			//控制语句可以嵌套使用
			//控制语句可以是：if、if..else、switch、for、while、do...while
			/*
			内层循环中变量名不能和外层循环中的变量名相同
			for(int i = 100;;) {}
			*/
			for(int j=0;j<3;j++) {
				for(int k = 0;k<3;k++) {
					System.out.println("k->" + k);
				}
			}
		}
		
	}
}
