/*
 转义字符在普通字符之前，将特殊字符转换为普通字符
 */
public class DataTypeTest03 {
		public static void main(String[] args) {
			char c1 = 'n';
			System.out.println(c1);
			
		//'\n'是一个换行符，属于char数据类型
		//、在Java语言中“\”具有转义功能
			
			char c2 = '\n';
			System.out.print("Hello");
			System.out.print(c2);
			System.out.println("World");
			
			//'\t'是制表符
			char c3 = '\t';
			System.out.print(c1);
			System.out.print(c3);
			System.out.println("Hello World");
			
			//要求在控制台上输出“\”
			//反斜杠将后边的单引号转义ch成不具备特殊含义的普通单引号
		/*	char k = '\'';
			System.out.println(k);
		*/
			
			//第一个\具有转义功能
			char k ='\\';
			System.out.println(k);
			
			//在控制台输出单引号
			//char a = ''；java中不允许这么写
			
			//第一个单引号和第二个单引号配对，最后一个的单引号z找不到另一半
			
			//反向斜杠具有转义功能，将第二个单引号转义为普通字符
			char a = '\'';
			System.out.println(a);
			//输出半角双引号的Hello World！
			System.out.println("\"Hello World!\"");
			
			
			char m = '中';
			System.out.println(m);
			
			//Unicode
			char n = '\u4e2d';
			System.out.println(n);
			//char类型的默认值
		/*	char d = '\u0000';
			System.out.println(d);
		*/
			
		}
}
