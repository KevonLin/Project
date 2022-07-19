
/*
	变量的分类：
		根据变量声明的位置来分类：
			*局部变量
				-在方法体中声明的变量
			*成员变量
				-在方法体外【类体内】声明的变量
		在不同的作用域中，变量名可以重复
		在相同的作用域中，变量名不可以重复

			
*/
public class VarTest04
{
	//成员变量
	int k = 200;

	//主方法：入口
	public static void main(String[] args) 
	{
		
		//i变量是局部变量
		//int i = 3;

		//java遵循就近原则
		System.out.println(i);

	}
		
	//成员便可i昂
	static int i = 100;

	//类体中不能直接编写java语句
	//System.out.println(i);


	//doSome方法
	public static void doSome(){
	
		//局部变量
		int i = 90;
		
		

	}
	

}