package com.lin.frame;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import com.lin.panel.UserAccountPanel;
import com.lin.panel.UserMainPanel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Component;

import javax.swing.SwingConstants;

/** 
* @author Kevonlin
* @Descption 
* @date 2022年3月31日 下午5:14:54 
*/

public class UserFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 363962546195230788L;
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
				@Override
				public void run() {
					try {
						Image icon = Toolkit.getDefaultToolkit().getImage(".\\img\\eam_logo.png");
						frame = new UserFrame();
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
	public UserFrame() {
		setTitle("EAM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setFont(new Font("微软雅黑", Font.PLAIN, 16));
		setBounds((width - windowsWedth) / 2, (height - windowsHeight) / 2, windowsWedth, windowsHeight);

		JTabbedPane tabbedPane = new JTabbedPane(SwingConstants.TOP);
		JPanel userMainPanel = new UserMainPanel();
		JPanel userAccountPanel = new UserAccountPanel();
		tabbedPane.addTab("我的借用", userMainPanel);
		tabbedPane.addTab("我的账户", userAccountPanel);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup()
						.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE).addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(tabbedPane,
				GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE));
		getContentPane().setLayout(groupLayout);
		getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[] { tabbedPane }));
	}
}
