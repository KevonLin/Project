/*
 	深入return
 	
 		*带有return关键字的Java语句只要至此那个，所在的方法执行结束。
 		
 		*在“同一作用域”中，return语句下面不能编写任何代码，
 		因为这些代码永远执行不到。
 */
public class MethodTest09 {
	public static void main(String[] args) {
		
		/*
		int retValue = m();
		System.out.println(retValue);
		*/
		
		//编译错误：调用方法，方法名后边有括号
		//System.out.println(m);
		
		System.out.println(m());
	}
		//编译报错：缺少返回语句，以下程序编译器认为无法百分百保证“return 1;”会执行。
		/*
		public static int m(){
			int a = 10;
			if(a > 3){
				return 1;
			}
		}
		 */
	//以下程序可以保证“return 1;或return 0;执行。编译通过
	/*
	public static int m() {
		int a = 10;
		if(a > 3) {
			return 1;
		}else {
			return 0;
		}
	}
	*/
	
	//和以上方法完全相同
	/*
	public static int m() {
		int a = 10;
		if(a > 3) {
			return 1;
		}
		return 0;
	}
	*/
	
	/*
	public static int m() {
		return 10 > 3 ? 1 : 0;
	*/
	
	public static int m() {
		return 2 > 3 ? 1 : 0;
	
	}
}
