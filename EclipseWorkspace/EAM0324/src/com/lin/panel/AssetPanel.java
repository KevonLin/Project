package com.lin.panel;

import java.awt.Toolkit;

import javax.swing.JPanel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

/** 
* @author Kevonlin
* @Descption 
* @date 2022年3月16日 下午2:54:51 
*/

public class AssetPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4281551142617497846L;
	
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
	public AssetPanel() {
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
		table.setBackground(Color.WHITE);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u5E8F\u53F7", "\u4EA7\u54C1\u7F16\u53F7", "\u4EA7\u54C1\u540D\u79F0", "\u5165\u5E93\u65E5\u671F", "\u5E93\u5B58", "\u5907\u6CE8"
			}
		));
		scrollPane.setViewportView(table);
		setLayout(groupLayout);
	}
}
