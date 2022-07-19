
/*
   变量 

   1.什么是变量？
       *变量本质上是内存中的一块空间，该控件有数据类型、名字、字面值
	   *变量包含三部分：数据类型、名称、字面值【数据】
	   *变量是内存中存储数据的基本单元

   2.数据类型的作用
      *不同的数据有不同的类型，不同的数据类型底层会分配不同大小的空间
	  *数据类型是知道程序在运行阶段应该分配多大的内存空间

   3.变量要求：变量中存储的具体"数据"必须和变量的"数据类型"一致，当不一致时编译报错

   4.生命/定义变量的语法格式:
      数据类型 变量名
	       *数据类型 
		       整数型 int
		   *变量名：
               只要是合法的标识符就行。规范要求：首字母小写，后面的每个单词首字母大写。
		例如：
		     int i;
			 int age;
			 int length;

   5.变量赋值：
       语法格式：
	       变量名 = 字面值;

		 要求：字面值的数据类型必须和变量的数据类型一致

   6.生命和复制可以放到一起完成
     int i = 10;

   7.变量赋值之后，可以重新赋值

     int i = 10;
	 System.out.println(i); //10
	 i=20;
	 System.out.println(i); //20
	 i=100;
	 System.out.println(i); //100

   8.内存空间可以重复使用

   9.访问一个变量包括两种访问形式

      *读取 get //获取
	  *修改 set //设置
	10.变量在一行上可以生命多个
		int a,b,c

	11.变量必须先生命，再赋值，才能访问

   */
public class Variable{
	public static void main(String[] args){
		int i = 1;
		
		System.out.println(i);

		int a,b,c = 4;
		a=2;
		b=3;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}