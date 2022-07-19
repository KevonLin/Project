package week3;

public class DxcJoin {
	public static void main(String[] args) {
		MyThread you = new MyThread("Äã");
		MyThread she = new MyThread("Ëý");
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
		System.out.println("main½áÊø");
	}
}
