
import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {

	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

	double x = 100; // С��ĺ�����
	double y = 100; // С���������
	boolean right = true;// ����
	// �����ڵķ���

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

		BallGame game = new BallGame();
		game.launchFrame();
	}
}
