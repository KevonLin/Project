package com.lin.panel;

import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年3月16日 下午7:50:28
 */

public class LogLoginPanel extends JPanel {

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
	private JTable table;

	/**
	 * Create the panel.
	 */
	public LogLoginPanel() {
		setBounds((width - windowsWedth) / 2, (height - windowsHeight) / 2, windowsWedth, windowsHeight);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1356, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u5E8F\u53F7", "\u7528\u6237\u540D", "\u767B\u9646\u65F6\u95F4"
			}
		));
		table.setBackground(Color.WHITE);
		scrollPane.setViewportView(table);
		setLayout(groupLayout);
	}
}
