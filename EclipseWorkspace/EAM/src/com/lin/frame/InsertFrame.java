package com.lin.frame;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.lin.dao.SqlExcute;
import com.lin.utils.EncryptUtils;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年4月9日 下午8:23:07
 */

public class InsertFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8095325691365400116L;
	// private static JFrame frame;
	private DefaultTableModel tableModel;

	// 获取屏幕分辨率
	public int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	public int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	// 设置窗体大小
	public int windowsWedth = 726;
	public int windowsHeight = 408;
	private JTable insertTable;

	private static Image icon = Toolkit.getDefaultToolkit().getImage(".\\img\\eam_logo.png");
	private static final String ASSET = "资产编号";
	private static final String EMP = "工号";
	private static final String USER = "用户名";
	private static final String ADMIN = "管理员用户名";

	/**
	 * Create the frame.
	 */
	public InsertFrame(String[] columnName) {
		getContentPane().setBackground(Color.WHITE);
		setTitle("EAM");
		setIconImage(icon);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setFont(new Font("微软雅黑", Font.PLAIN, 16));
		setBounds((width - windowsWedth) / 2, (height - windowsHeight) / 2, windowsWedth, windowsHeight);

		insertTable = new JTable();
		tableModel = new DefaultTableModel(new Object[][] {}, columnName) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 6252012974713785753L;

			@Override
			public boolean isCellEditable(int row, int column) {
				if (column == 0) {
					return false;
				} else {
					return true;
				}
			}
		};
		tableModel.addRow(new Vector<>());

		JScrollPane scrollPane = new JScrollPane();

		JButton btn_verify = new JButton("确认");
		btn_verify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vector<Object> data;
				String sql;
				SqlExcute excute = new SqlExcute();
				data = excute.getRowData(insertTable);
				if(excute.isRowNull()) {
					JOptionPane.showMessageDialog(null, "数据为空");
					return;
				}
				Object[] values = new Object[columnName.length - 1];
				for (int i = 1; i < data.size(); i++) {
					values[i - 1] = data.get(i);
				}
				String name = columnName[1];
				if (name.equals(ASSET)) {
					sql = "insert into asset (pnum,pname,pdate,presidue,pnote) values ((?),(?),(?),(?),(?));";
					excute.sqlExcute(sql, values);
				} else if (name.equals(EMP)) {
					sql = "insert into emp (wnum,wname,widnum,wphone,wdept) values ((?),(?),(?),(?),(?));";
					excute.sqlExcute(sql, values);
					sql = "insert into logempmanage (log_m_num,log_m_name,log_m_handle,log_m_date) values ((?),(?),(?),current_timestamp);";
					excute.sqlExcute(sql, data.get(1), data.get(2), "录用");
				} else if (name.equals(ADMIN)) {
					Object username = data.get(1);
					String password = (String) data.get(2);
					String passwordsh1 = new EncryptUtils().getSHA1Encrypt(password);
					sql = "insert into accountadmin (username,`password`) values ((?),(?));";
					excute.sqlExcute(sql, username, passwordsh1);
				} else if (name.equals(USER)) {
					Object usr = data.get(1);
					String pwd = (String) data.get(2);
					String pwdsh1 = new EncryptUtils().getSHA1Encrypt(pwd);
					Object eNum = data.get(3);
					sql = "insert into accountuser (usr,pwd,enum) values ((?),(?),(?));";
					excute.sqlExcute(sql, usr, pwdsh1, eNum);
				}
				JOptionPane.showMessageDialog(null, "操作成功");
				dispose();
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup().addGap(319).addComponent(btn_verify).addContainerGap(344,
						Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(btn_verify).addGap(12)));

		insertTable.setModel(tableModel);
		insertTable.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
		scrollPane.setViewportView(insertTable);
		getContentPane().setLayout(groupLayout);

		setVisible(true);
	}
}
