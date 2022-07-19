package cn.llz.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * 飞机游戏主窗口
 * 
 * @author Lin
 *
 */
public class MyGameFrame extends JFrame {

	Image plane = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");

	int planeX = 250, planeY = 250;

	@Override
	public void paint(Graphics g) {// g相当于一个画笔
		super.paint(g);

		g.drawImage(bg, 0, 0, null);
		g.drawImage(plane, 250, 250, null);
		planeX++;

	}

	// 反复重画窗口
	class PaintThread extends Thread {
		@Override
		public void run() {
			super.run();
			while (true) {
				System.out.println("重画窗口");
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 初始化窗口
	 */
	public void launchFrame() {
		this.setTitle("飞机游戏");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(300, 300);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		new PaintThread().start();// 启动重画窗口线程

	}

	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
