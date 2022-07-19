/*
 	八种基本数据类型默认值为0
 
 */
public class DataTypeTest02 {

	//这里的static必须加，后边会讲到
	static int k =1000;
	
	//变量尊重语法：先声明，再赋值，才能访问。
	//成员变量没有手动赋值，系统会默认赋值【局部变量不会】
	static int f;//成员变量
	
	public static void main(String[] args) {
	
		/*
		 int i;//局部变量
		 System.out.println(i);
		 */
	
		System.out.println(k);
		
		System.out.println(f);
	}
}
