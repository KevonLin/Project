package com.lin.panel;

import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/** 
* @author Kevonlin
* @Descption 
* @date 2022年3月16日 下午7:51:23 
*/

public class LogAssetPnael extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1226437662717402337L;
	
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
	public LogAssetPnael() {
		setBounds((width - windowsWedth) / 2, (height - windowsHeight) / 2, windowsWedth, windowsHeight);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1376, Short.MAX_VALUE)
					.addGap(0))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u5E8F\u53F7", "\u8D44\u4EA7\u7F16\u53F7", "\u8D44\u4EA7\u540D\u79F0", "\u501F\u7528\u4EBA\u5DE5\u53F7", "\u501F\u7528\u4EBA\u59D3\u540D", "\u501F\u7528/\u5F52\u8FD8\u65F6\u95F4"
			}
		));
		scrollPane.setViewportView(table);
		setLayout(groupLayout);
	}

}
