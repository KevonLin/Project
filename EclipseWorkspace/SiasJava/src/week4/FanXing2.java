package week4;

public class FanXing2 {
	public static void main(String[] args) {
		Integer[] num = { 1, 2, 3, 4, 5 };
		String[] str = { "red", "orange", "yellow", "green", "blue" };
		FanXing2.display(num);
		FanXing2.display(str);
	}
	public static <E> void display(E[] list) {
		for(int i=0;i<list.length;i++)
			System.out.println(list[i]+ " ");
		System.out.println();
	}
}
