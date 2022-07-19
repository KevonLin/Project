
import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame {

	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

	double x = 100; // С��ĺ�����
	double y = 100; // С���������

	double degree = 3.14/3; //���� �˴�Ϊ60��
	// �����ڵķ���

	public void paint(Graphics g) {
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int) x, (int) y, null);


		x = x + 10*Math.cos(degree);
		y = y + 10*Math.sin(degree);
	}

	// ���ڼ���
	void launchFrame() {
		setSize(1130, 572);
		setLocation(400, 400);
		setVisible(true);

		// �ػ�����
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
