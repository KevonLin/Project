package com.lin.panel;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.DefaultTableModel;

import com.lin.dao.SqlExcute;
import com.lin.dao.SqlQuery;
import com.lin.frame.InsertFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;

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
	private JTable empTable;

	// 获取屏幕分辨率
	public int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	public int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	// 设置窗体大小
	public int windowsWedth = 1366;
	public int windowsHeight = 768;
	private JTextField tx_wnum;
	private JTextField tx_wname;

	private DefaultTableModel tableModel;
	private JTextField tx_dept;

	/**
	 * Create the panel.
	 */
	public EmpPanel() {
		setBounds((width - windowsWedth) / 2, (height - windowsHeight) / 2, windowsWedth, windowsHeight);
		JScrollPane scrollPane = new JScrollPane();
		String[] columnName = { "序号", "工号", "姓名", "身份证号", "电话", "部门" };
		tableModel = new DefaultTableModel(new Object[][] {}, columnName) {
			/**
			 * 
			 */
			private static final long serialVersionUID = -197585584899613643L;

			@Override
			public boolean isCellEditable(int row, int column) {
				if (column == 0 || column == 1) {
					return false;
				} else {
					return true;
				}
			}
		};
		JPanel panel = new JPanel();

		JLabel lb_no = new JLabel("工号");
		lb_no.setHorizontalAlignment(SwingConstants.CENTER);
		lb_no.setFont(new Font("宋体", Font.PLAIN, 16));

		tx_wnum = new JTextField();
		tx_wnum.setHorizontalAlignment(SwingConstants.LEFT);
		tx_wnum.setFont(new Font("宋体", Font.PLAIN, 16));
		tx_wnum.setColumns(10);

		JButton btn_query = new JButton("查询");
		btn_query.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SqlQuery query = new SqlQuery();
				String wNum = tx_wnum.getText().trim();
				String wName = tx_wname.getText().trim();
				String wDept = tx_dept.getText().trim();
				String sql = null;
				boolean rs = false;
				if (wNum.isEmpty() && wName.isEmpty() && wDept.isEmpty()) {
					sql = "select * from emp;";
					rs = query.sqlQuery(tableModel, columnName, sql);
				} else {
					if (!wNum.isEmpty() && wName.isEmpty() && wDept.isEmpty()) {
						sql = "select * from emp where wnum = (?)";
						rs = query.sqlQuery(tableModel, columnName, sql, wNum);
					} else if (wNum.isEmpty() && !wName.isEmpty() && wDept.isEmpty()) {
						sql = "select * from emp where wname = (?)";
						rs = query.sqlQuery(tableModel, columnName, sql, wName);
					} else if (wNum.isEmpty() && wName.isEmpty() && !wDept.isEmpty()) {
						sql = "select * from emp where wdept = (?)";
						rs = query.sqlQuery(tableModel, columnName, sql, wDept);
					} else {
						sql = "select * from emp where wnum = (?) and wname = (?) and wdept = (?)";
						rs = query.sqlQuery(tableModel, columnName, sql, wNum, wNum, wDept);
					}
				}
				if (!rs) {
					JOptionPane.showMessageDialog(null, "结果为空");
				}
			}
		});
		btn_query.setFont(new Font("宋体", Font.PLAIN, 14));

		JButton btn_add = new JButton("添加");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new InsertFrame(columnName);
			}
		});
		btn_add.setFont(new Font("宋体", Font.PLAIN, 14));

		JButton btn_del = new JButton("删除");
		btn_del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vector<Object> data;
				String sql;
				String handle = "解雇";
				SqlExcute excute = new SqlExcute();
				data = excute.getRowData(empTable);
				sql = "delete from emp where wnum = ?";
				excute.sqlExcute("SET FOREIGN_KEY_CHECKS=0;");
				excute.sqlExcute(sql, data.get(1));
				excute.sqlExcute("SET FOREIGN_KEY_CHECKS=1;");
				sql = "insert into logempmanage (log_m_num,log_m_name,log_m_handle,log_m_date) values ((?),(?),(?),current_timestamp);";
				excute.sqlExcute(sql, data.get(1), data.get(2), handle);
				JOptionPane.showMessageDialog(null, "操作成功");
			}
		});
		btn_del.setFont(new Font("宋体", Font.PLAIN, 14));

		JButton btn_edit = new JButton("修改");
		btn_edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vector<Object> data;
				String sql;
				data = new SqlExcute().getRowData(empTable);
				sql = "update asset set wname=(?),widnum=(?),wphone=(?),wdept=(?);";
				new SqlExcute().sqlExcute(sql, data.get(2), data.get(3), data.get(4), data.get(5), data.get(1));
				JOptionPane.showMessageDialog(null, "操作成功");
			}
		});
		btn_edit.setFont(new Font("宋体", Font.PLAIN, 14));

		JLabel lb_name = new JLabel("姓名");
		lb_name.setHorizontalAlignment(SwingConstants.CENTER);
		lb_name.setFont(new Font("宋体", Font.PLAIN, 16));

		tx_wname = new JTextField();
		tx_wname.setHorizontalAlignment(SwingConstants.LEFT);
		tx_wname.setFont(new Font("宋体", Font.PLAIN, 16));
		tx_wname.setColumns(10);

		JLabel lb_dept = new JLabel("部门");
		lb_dept.setHorizontalAlignment(SwingConstants.CENTER);
		lb_dept.setFont(new Font("宋体", Font.PLAIN, 16));

		tx_dept = new JTextField();
		tx_dept.setHorizontalAlignment(SwingConstants.LEFT);
		tx_dept.setFont(new Font("宋体", Font.PLAIN, 16));
		tx_dept.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_panel.createSequentialGroup().addGap(64).addComponent(lb_no)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(tx_wnum, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE).addGap(20)
						.addComponent(lb_name, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(tx_wname, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE).addGap(32)
						.addComponent(lb_dept, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE).addGap(4)
						.addComponent(tx_dept, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE).addGap(37)
						.addComponent(btn_query, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(btn_add).addGap(5)
						.addComponent(btn_del).addGap(5).addComponent(btn_edit).addGap(93)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel
				.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup().addGap(3).addComponent(lb_dept,
										GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
								.addComponent(tx_dept, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(btn_del)
										.addComponent(btn_edit).addGroup(Alignment.TRAILING,
												gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(btn_add)
														.addComponent(btn_query, GroupLayout.PREFERRED_SIZE, 27,
																GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_panel.createSequentialGroup().addGap(12)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(tx_wnum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lb_no)
										.addComponent(tx_wname, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
										.addComponent(lb_name, GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))))
				.addContainerGap()));
		panel.setLayout(gl_panel);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1356, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE))
				.addGap(0)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
				groupLayout.createSequentialGroup()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 702, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		empTable = new JTable();
		empTable.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
		empTable.setBackground(Color.WHITE);
		empTable.setModel(tableModel);
		scrollPane.setViewportView(empTable);
		setLayout(groupLayout);

		String sql = "select * from emp;";
		new SqlQuery().sqlQuery(tableModel, columnName, sql);
	}
}
