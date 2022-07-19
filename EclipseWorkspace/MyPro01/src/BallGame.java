
import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {

	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

	double x = 100; // 小球的横坐标
	double y = 100; // 小球的纵坐标
	boolean right = true;// 方向
	// 画窗口的方法

	public void paint(Graphics g) {
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int) x, (int) y, null);

		if (right)
			x = x + 10;
		else
			x = x - 10;

		if (x > 1080 - 50)
			right = false;

		if (x < 50)
			right = true;

	}

	// 窗口加载
	void launchFrame() {
		setSize(1130, 572);
		setLocation(400, 400);
		setVisible(true);

		// 重画窗口
		while (true) {
			repaint();
			try {
				Thread.sleep(17);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		BallGame game = new BallGame();
		game.launchFrame();
	}
}
