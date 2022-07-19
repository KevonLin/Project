package com.lin.frame;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import com.lin.panel.AccountPanel;
import com.lin.panel.AssetPanel;
import com.lin.panel.EmpPanel;
import com.lin.panel.LogPanel;

import java.awt.Component;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年3月15日 下午10:20:34
 */

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8255502374321133666L;
	private static MainFrame frame;

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

		JTabbedPane tabbedPane = new JTabbedPane(SwingConstants.TOP);
		JPanel assstPanel = new AssetPanel();
		JPanel empPanel = new EmpPanel();
		JPanel accountPanel = new AccountPanel();
		JPanel logPanel = new LogPanel();
		tabbedPane.addTab("资产管理", assstPanel);
		tabbedPane.addTab("员工管理", empPanel);
		tabbedPane.addTab("账户管理", accountPanel);
		tabbedPane.addTab("日志管理", logPanel);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
		);
		getContentPane().setLayout(groupLayout);
		getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[] { tabbedPane }));
	}
}
