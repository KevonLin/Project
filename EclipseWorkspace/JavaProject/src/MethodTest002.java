
//����һ�³��������������ͼ������
public class MethodTest002 {
	public static void main(String[] agrs) {
		int i = 10;
		method(i);
		System.out.println("main --> " + i);//10
	}
	
	public static void method(int i) {
		i++;
		System.out.println("method -->" + i);//11
	}
}
