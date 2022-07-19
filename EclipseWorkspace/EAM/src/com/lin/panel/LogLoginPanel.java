package com.lin.panel;

import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

import com.lin.dao.SqlExcute;
import com.lin.dao.SqlQuery;

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
	private JTextField tx_usr;

	private DefaultTableModel tableModel;

	/**
	 * Create the panel.
	 */
	public LogLoginPanel() {
		setBounds((width - windowsWedth) / 2, (height - windowsHeight) / 2, windowsWedth, windowsHeight);

		JScrollPane scrollPane = new JScrollPane();

		JPanel panel = new JPanel();

		String[] columnName = { "\u5E8F\u53F7", "\u7528\u6237\u540D", "\u767B\u9646\u65F6\u95F4",
				"\u767B\u9646\u5730\u5740" };
		tableModel = new DefaultTableModel(new Object[][] {}, columnName) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1727274214186284225L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		JLabel lb_usr = new JLabel("用户名");
		lb_usr.setHorizontalAlignment(SwingConstants.CENTER);
		lb_usr.setFont(new Font("宋体", Font.PLAIN, 16));

		tx_usr = new JTextField();
		tx_usr.setHorizontalAlignment(SwingConstants.LEFT);
		tx_usr.setFont(new Font("宋体", Font.PLAIN, 16));
		tx_usr.setColumns(10);

		JButton btn_query = new JButton("查询");
		btn_query.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SqlQuery sqlQuery = new SqlQuery();
				String usr = tx_usr.getText().trim();
				String sql;
				boolean rs;
				if (usr.isEmpty()) {
					sql = "select * from loglogin";
					rs = sqlQuery.sqlQuery(tableModel, columnName, sql);
				} else {
					sql = "select * from loglogin where log_username = (?);";
					rs = sqlQuery.sqlQuery(tableModel, columnName, sql, usr);
				}
				if (!rs) {
					JOptionPane.showMessageDialog(null, "结果为空");
				}
			}
		});
		btn_query.setFont(new Font("宋体", Font.PLAIN, 14));

		JButton btn_del = new JButton("删除");
		btn_del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vector<Object> data;
				String sql;
				SqlExcute excute = new SqlExcute();
				data = new SqlExcute().getRowData(table);
				sql = "delete from loglogin where log_username = ?";
				excute.sqlExcute(sql, data.get(1));
				JOptionPane.showMessageDialog(null, "操作成功");
			}
		});
		btn_del.setFont(new Font("宋体", Font.PLAIN, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap(420, Short.MAX_VALUE)
						.addComponent(lb_usr, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(tx_usr, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(btn_query, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(btn_del).addGap(512)));
		gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup().addContainerGap(17, Short.MAX_VALUE)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
												.addComponent(btn_query, GroupLayout.PREFERRED_SIZE, 27,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(btn_del))
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
												.addComponent(tx_usr, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lb_usr)))
								.addContainerGap()));
		panel.setLayout(gl_panel);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1356,
										Short.MAX_VALUE)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE))
						.addGap(0)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 708, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		table = new JTable();
		table.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
		table.setModel(tableModel);
		table.setBackground(Color.WHITE);
		scrollPane.setViewportView(table);
		setLayout(groupLayout);

		String sql = "select * from loglogin;";
		new SqlQuery().sqlQuery(tableModel, columnName, sql);
	}
}
