/*
 	需求：
 		定义一个计算机类【电脑/笔记本】计算机属性：
 			*品牌
 			*型号
 			*颜色
 			
 		定义一个学生类，属性：
 			*学号
 			*姓名
 			*有一台笔记本电脑
 			
 		编写程序表示以上类，分别将类创建为对象
 		对象数量不限，让其中一个同学使用其中一台笔记本电脑
 			
 		编译并运行，并且将整个执行过程采用图形的方式描述出来
 			
 	所有的代码全部写到当前的Java源文件中
 */
public class OOTest06 {
	public static void main(String[] args) {
		Computer biJiBen = new Computer();
		
		biJiBen.brand = "ASUA";
		biJiBen.style = "FL8550";
		biJiBen.color = "Black";
		
		Student1 zhangsan = new Student1();
		
		zhangsan.name = "张三";
		zhangsan.no = 10;
		zhangsan.notepad = biJiBen;
		
		//让这个学生和笔记本对象产生关系【通过学生找到笔记本】
		//想知道张三笔记本的品牌
		System.out.println(zhangsan.notepad.brand);
		
		//修改品牌
		zhangsan.notepad.brand = "Apple";
		System.out.println(zhangsan.notepad.brand);
		
		//张三又买了一台新的电脑
		zhangsan.notepad = new Computer();
		
		System.out.println(zhangsan.notepad);//null
	}
}

class Computer{
	
	String brand;
	
	String style;
	
	String color;
	
}
class Student1{
	
	int no;
	
	String name;
	
	Computer notepad;
	
}