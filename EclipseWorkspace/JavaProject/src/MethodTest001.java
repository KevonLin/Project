
//在EditPlus中，字体颜色为红色的表示一个类的名字，并且这个类是JavaSE类库中自带的
//自定义的类，字体时黑色的，时标识符。

//重点：方法调用、参数传递的时候，实际传递的是变量中啊保存的那个“值”传过去了

public class MethodTest001 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int retValue = sumInt(a,b);
		System.out.println("retValue = " + retValue);
	}
	
	public static int sumInt(int i,int j) {
		int result = i + j;
		int num = 3;
		int retValue = divide(result,num);
		return retValue;
	}
	
	public static int divide(int x,int y) {
		int z = x / y;
		return z;
	}
}
