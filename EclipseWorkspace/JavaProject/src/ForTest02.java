
public class ForTest02 {
	public static void main(String[] args) {
		
		//以下的for循环中的“i”变量的作用域是仅限于当前for循环内部使用
		
		int i = 0;
		
		for(;i<10;i++) {
			System.out.println("i = " + i);
		}
		System.out.println("i = " + i);//10 在for语句中最后false i已经变成10 
		
		//先引用再赋值也可以达到相同效果
		
		int j;
		
		for(j = 0;j < 10;j ++) {
			System.out.println(j);
		}
		System.out.println(j);
	}
}
