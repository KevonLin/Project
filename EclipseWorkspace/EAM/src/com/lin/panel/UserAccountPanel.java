package com.lin.panel;

import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.lin.dao.SqlExcute;
import com.lin.dao.SqlQuery;
import com.lin.utils.EncryptUtils;
import com.lin.utils.GlobalVariables;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年3月31日 下午5:34:55
 */

public class UserAccountPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6076293533326603883L;

	// 获取屏幕分辨率
	public int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	public int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	// 设置窗体大小
	public int windowsWedth = 1366;
	public int windowsHeight = 768;
	private JTable tableEmp;
	private JPanel panel1;
	private JPanel panel2;
	private JScrollPane scrollPane2;
	private JTable tableAccount;
	private JButton btn_edittel;

	/**
	 * Create the panel.
	 */
	public UserAccountPanel() {
		setBounds((width - windowsWedth) / 2, (height - windowsHeight) / 2, windowsWedth, windowsHeight);

		String[] recordName = { "序号", "工号", "姓名", "身份证号", "电话", "部门" };
		DefaultTableModel recordMode = new DefaultTableModel(new Object[][] {}, recordName) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 8346177606384246266L;

			@Override
			public boolean isCellEditable(int row, int column) {
				if (column == 4) {
					return true;
				} else {
					return false;
				}
			}
		};

		String[] accountName = { "序号", "用户名", "密码" };
		DefaultTableModel accountModel = new DefaultTableModel(new Object[][] {}, accountName) {
			/**
			 * 
			 */
			private static final long serialVersionUID = -5088984452907629524L;

			@Override
			public boolean isCellEditable(int row, int column) {
				if (column == 2) {
					return true;
				} else {
					return false;
				}
			}
		};

		panel1 = new JPanel();
		panel1.setBorder(
				new TitledBorder(null, "\u6211\u7684\u4FE1\u606F", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		panel2 = new JPanel();
		panel2.setBorder(
				new TitledBorder(null, "\u6211\u7684\u8D26\u6237", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1356, Short.MAX_VALUE)
						.addComponent(panel1, GroupLayout.DEFAULT_SIZE, 1356, Short.MAX_VALUE))
				.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(panel1, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel2, GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE).addContainerGap()));

		scrollPane2 = new JScrollPane();

		JButton btn_editpwd = new JButton("修改");
		btn_editpwd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vector<Object> data;
				String sql;
				data = new SqlExcute().getRowData(tableAccount);
				sql = "update accountuser set pwd = (?) where usr = ?";
				String pwd = new EncryptUtils().getSHA1Encrypt((String) data.get(2));
				new SqlExcute().sqlExcute(sql, pwd, data.get(1));
				JOptionPane.showMessageDialog(null, "操作成功");
			}
		});
		GroupLayout gl_panel2 = new GroupLayout(panel2);
		gl_panel2.setHorizontalGroup(gl_panel2.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING,
						gl_panel2.createSequentialGroup().addContainerGap(1269, Short.MAX_VALUE)
								.addComponent(btn_editpwd).addContainerGap())
				.addGroup(Alignment.TRAILING, gl_panel2.createSequentialGroup()
						.addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 1326, Short.MAX_VALUE).addGap(1)));
		gl_panel2.setVerticalGroup(gl_panel2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel2.createSequentialGroup().addComponent(btn_editpwd)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE).addContainerGap()));

		tableAccount = new JTable();
		tableAccount.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
		tableAccount.setModel(accountModel);
		scrollPane2.setViewportView(tableAccount);
		panel2.setLayout(gl_panel2);

		JScrollPane scrollPane1 = new JScrollPane();

		tableEmp = new JTable();
		tableEmp.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
		tableEmp.setModel(recordMode);
		tableEmp.setBackground(Color.WHITE);
		scrollPane1.setViewportView(tableEmp);

		btn_edittel = new JButton("修改");
		btn_edittel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vector<Object> data;
				String sql;
				data = new SqlExcute().getRowData(tableEmp);
				sql = "update emp set wphone=(?) where wnum=(?);";
				new SqlExcute().sqlExcute(sql, data.get(4), data.get(1));
				JOptionPane.showMessageDialog(null, "操作成功");
			}
		});

		GroupLayout gl_panel1 = new GroupLayout(panel1);
		gl_panel1.setHorizontalGroup(gl_panel1.createParallelGroup(Alignment.TRAILING)
				.addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 1344, Short.MAX_VALUE)
				.addGroup(gl_panel1.createSequentialGroup().addContainerGap(1277, Short.MAX_VALUE)
						.addComponent(btn_edittel).addContainerGap()));
		gl_panel1.setVerticalGroup(gl_panel1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel1.createSequentialGroup().addComponent(btn_edittel)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)));
		panel1.setLayout(gl_panel1);
		setLayout(groupLayout);

		String sqlRecord = "select emp_id,wnum,wname,widnum,wphone,wdept from emp,accountuser where emp.wnum = accountuser.enum and accountuser.usr = (?);";
		new SqlQuery().sqlQuery(recordMode, recordName, sqlRecord, GlobalVariables.name);

		String sqlAccount = "select * from accountuser where usr = (?)";
		new SqlQuery().sqlQuery(accountModel, accountName, sqlAccount, GlobalVariables.name);
	}
}
