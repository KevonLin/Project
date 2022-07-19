package com.lin.frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.lin.dao.SqlExcute;
import com.lin.dao.SqlQuery;
import com.lin.utils.GlobalVariables;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年4月15日 下午4:00:33
 */

public class LendRepayFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 122306970663172611L;
	private JPanel empPanel;
	private DefaultTableModel tableModel;

	// 获取屏幕分辨率
	public int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	public int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	// 设置窗体大小
	// public int windowsWedth = 1366;
	// public int windowsHeight = 768;
	public int windowsWedth = 726;
	public int windowsHeight = 408;
	private JTable lrTable;

	/**
	 * Create the frame.
	 */
	public LendRepayFrame() {
		setTitle("EAM");
		// setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setFont(new Font("微软雅黑", Font.PLAIN, 16));
		setBounds((width - windowsWedth) / 2, (height - windowsHeight) / 2, windowsWedth, windowsHeight);
		empPanel = new JPanel();

		JScrollPane scrollPane = new JScrollPane();

		String[] columnName = { "序号", "工号", "姓名", "身份证号", "电话", "部门" };
		tableModel = new DefaultTableModel(new Object[][] {}, columnName) {
			/**
			 * 
			 */
			private static final long serialVersionUID = -197585584899613643L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		lrTable = new JTable();
		lrTable.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
		lrTable.setBackground(Color.WHITE);
		lrTable.setModel(tableModel);
		scrollPane.setViewportView(lrTable);

		setContentPane(empPanel);

		JButton button = new JButton("确定");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object[] lrData = new Object[5];
				SqlExcute excute = new SqlExcute();
				String sql;
				// 获取asset数据
				lrData[0] = GlobalVariables.data[0];
				lrData[1] = GlobalVariables.data[1];

				// 获取emp点击行数据
				Vector<Object> data = excute.getRowData(lrTable);
				if (excute.isRowNull()) {
					return;
				}
				lrData[2] = data.get(1);
				lrData[3] = data.get(2);

				// 获取status数据
				lrData[4] = GlobalVariables.data[2];

				// System.out.println(lrData[0] + " " + lrData[1] + " " + lrData[2] + " " +
				// lrData[3] + " " + lrData[4]);

				// 插入logasm表
				sql = "insert into assetmanage (am_pnum,am_pname,am_wnum,am_wname,am_status,am_datetime) values ((?),(?),(?),(?),(?),current_timestamp);";
				excute.sqlExcute(sql, lrData);
				// 更新asset表，相应剩余数量-1
				if (GlobalVariables.isLend) {
					sql = "update asset set presidue = presidue-1 where pnum = (?);";
				} else {
					sql = "update asset set presidue = presidue+1 where pnum = (?);";
				}
				excute.sqlExcute(sql, lrData[0]);
				// 提示操作成功
				JOptionPane.showMessageDialog(null, "操作成功");
				dispose();
			}
		});
		GroupLayout gl_empPanel = new GroupLayout(empPanel);
		gl_empPanel.setHorizontalGroup(gl_empPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, gl_empPanel.createSequentialGroup().addContainerGap(331, Short.MAX_VALUE)
						.addComponent(button).addGap(322)));
		gl_empPanel.setVerticalGroup(gl_empPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_empPanel.createSequentialGroup()
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(button)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		empPanel.setLayout(gl_empPanel);

		String sql = "select * from emp;";
		new SqlQuery().sqlQuery(tableModel, columnName, sql);

		setVisible(true);
	}
}
