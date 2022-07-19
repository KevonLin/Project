package week3;

class MyThread2 implements Runnable {
	private String who;

	public MyThread2(String str) {
		who = str;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep((int) (1000 * Math.random()));
			} catch (InterruptedException e) {
				System.out.println(e.toString());
			}
			System.out.println(who + "正在运行");
		}
	}
}

public class DxcRunnable {
	public static void main(String[] args) {
		MyThread2 you = new MyThread2("你");
		MyThread2 she = new MyThread2("她");
		Thread t1 = new Thread(you);
		Thread t2 = new Thread(she);
		t1.start();
		t2.start();
	}
}
