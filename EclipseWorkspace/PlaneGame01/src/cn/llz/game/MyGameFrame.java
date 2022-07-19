package cn.llz.game;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;


/**
 * �ɻ���Ϸ������
 * @author Lin
 *
 */
public class MyGameFrame extends JFrame {

	/**
	 * ��ʼ������
	 */
	public void launchFrame() {
		this.setTitle("�ɻ���Ϸ");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(300, 300);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}