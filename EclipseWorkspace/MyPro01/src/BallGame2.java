
import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame {

	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

	double x = 100; // 小球的横坐标
	double y = 100; // 小球的纵坐标

	double degree = 3.14/3; //弧度 此处为60°
	// 画窗口的方法

	public void paint(Graphics g) {
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int) x, (int) y, null);


		x = x + 10*Math.cos(degree);
		y = y + 10*Math.sin(degree);
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

		BallGame2 game = new BallGame2();
		game.launchFrame();
	}
}
