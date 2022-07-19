package com.lin.panel;

import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

import java.awt.Color;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年3月16日 下午7:50:28
 */

public class LogPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2533346334228504622L;

	// 获取屏幕分辨率
	public int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	public int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	// 设置窗体大小
	public int windowsWedth = 1366;
	public int windowsHeight = 768;

	/**
	 * Create the panel.
	 */
	public LogPanel() {
		setBounds((width - windowsWedth) / 2, (height - windowsHeight) / 2, windowsWedth, windowsHeight);
		
		JPanel logLoginPanel = new LogLoginPanel();
		logLoginPanel.setBackground(Color.WHITE);
		JPanel logempPanel = new LogEmpPanel();
		logempPanel.setBackground(Color.WHITE);
		JPanel logAssetPnael = new LogAssetPnael();
		logAssetPnael.setBackground(Color.WHITE);
		
		JTabbedPane tabbedPane = new JTabbedPane(SwingConstants.TOP);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
		);
		
		tabbedPane.addTab("资产管理日志", logAssetPnael);
		tabbedPane.addTab("员工管理日志", logempPanel);
		tabbedPane.addTab("登录日志", logLoginPanel);
		
		setLayout(groupLayout);
	}
}
