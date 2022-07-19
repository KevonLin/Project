package com.lin.panel;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.DefaultTableModel;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年3月16日 下午6:33:31
 */

public class EmpPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1155008105526218166L;
	private JTable table;

	// 获取屏幕分辨率
	public int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	public int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	// 设置窗体大小
	public int windowsWedth = 1366;
	public int windowsHeight = 768;

	/**
	 * Create the panel.
	 */
	public EmpPanel() {
		setBounds((width - windowsWedth) / 2, (height - windowsHeight) / 2, windowsWedth, windowsHeight);
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup()
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1356, Short.MAX_VALUE).addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				groupLayout.createSequentialGroup()
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE).addContainerGap()));

		table = new JTable();
		table.setBackground(Color.WHITE);
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "序号", "工号", "姓名", "身份证号", "电话", "部门" }));
		scrollPane.setViewportView(table);
		setLayout(groupLayout);
	}

}
