package week3;

public class DxcJoin {
	public static void main(String[] args) {
		MyThread you = new MyThread("��");
		MyThread she = new MyThread("��");
		you.start();
		try {
			you.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		she.start();
		try {
			she.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("main����");
	}
}
