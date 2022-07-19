/*
 	使用while循环输出1-10
 */
public class WhileTest02 {
	public static void main(String[] args) {
		
		int i= 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("end-->" + i);//i=11
		
		System.out.println("--------------------");
		
		int j = 10;
		while(j > 0) {
			System.out.println(j--);//10 等价于 int temp = j--;
			System.out.println("j-->" + j);
		}
		System.out.println("end-->" + j);//0
		
		System.out.println("--------------------");
		
		int k = 10;
		while(k >=0) {
			System.out.println(--k);
		}
		
	}
}
