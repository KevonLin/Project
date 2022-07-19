/*
 	在返回值类型时void的方法中使用“return;”语句。
 	"return;"语句出现在返回值为void的方法中主要作用是终止“方法"的执行。
 */
public class MethodTest10 {
	public static void main(String[] args) {
		m();
	}
	public static void m() {
		
		for(int i = 0;i<10;i++) {
			if(i == 5) {
			//	return;//不是终止for循环，终止的是m()方法。
				break;//终止的时for循环
			}
			System.out.println("i -->" + i);
		}
		System.out.println("Hello World!");
	}
	
	
}
