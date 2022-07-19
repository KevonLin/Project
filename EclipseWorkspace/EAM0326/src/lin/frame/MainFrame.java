package lin.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/** 
* @author Kevonlin
* @Descption 
* @date 2022年3月26日 下午3:27:10 
*/

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 98299118882757878L;
	private JPanel contentPane;
	private static JFrame frame;
	

	// 获取屏幕分辨率
	public int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	public int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	// 设置窗体大小
	public int windowsWedth = 1366;
	public int windowsHeight = 768;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Image icon = Toolkit.getDefaultToolkit().getImage(".\\img\\eam_logo.png");
					frame = new MainFrame();
					frame.setIconImage(icon);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("EAM");
//		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setFont(new Font("微软雅黑", Font.PLAIN, 16));
		setBounds((width - windowsWedth) / 2, (height - windowsHeight) / 2, windowsWedth, windowsHeight);
	}

}
