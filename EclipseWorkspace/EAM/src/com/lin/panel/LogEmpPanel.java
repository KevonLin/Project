package com.lin.panel;

import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.lin.dao.SqlExcute;
import com.lin.dao.SqlQuery;

import java.awt.Color;
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
 * @date 2022年3月16日 下午7:50:49
 */

public class LogEmpPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1316948188041596389L;

	// 获取屏幕分辨率
	public int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	public int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	// 设置窗体大小
	public int windowsWedth = 1366;
	public int windowsHeight = 768;
	private JTable table;
	private JTextField tx_wnum;
	private JTextField tx_wname;

	private DefaultTableModel tableModel;

	/**
	 * Create the panel.
	 */
	public LogEmpPanel() {
		setBounds((width - windowsWedth) / 2, (height - windowsHeight) / 2, windowsWedth, windowsHeight);

		JScrollPane scrollPane = new JScrollPane();

		JPanel panel = new JPanel();
		panel.setBorder(null);

		String[] columnName = { "\u5E8F\u53F7", "\u5458\u5DE5\u7F16\u53F7", "\u5458\u5DE5\u59D3\u540D", "\u64CD\u4F5C",
				"\u65F6\u95F4" };
		tableModel = new DefaultTableModel(new Object[][] {}, columnName) {

			/**
			 * 
			 */
			private static final long serialVersionUID = 2645712056002285657L;

			@Override
			public boolean isCellEditable(int row, int column) {
					return false;
			}
		};

		JLabel lb_no = new JLabel("员工编号");
		lb_no.setHorizontalAlignment(SwingConstants.CENTER);
		lb_no.setFont(new Font("宋体", Font.PLAIN, 16));

		tx_wnum = new JTextField();
		tx_wnum.setHorizontalAlignment(SwingConstants.LEFT);
		tx_wnum.setFont(new Font("宋体", Font.PLAIN, 16));
		tx_wnum.setColumns(10);

		JLabel lb_name = new JLabel("员工姓名");
		lb_name.setHorizontalAlignment(SwingConstants.CENTER);
		lb_name.setFont(new Font("宋体", Font.PLAIN, 16));

		tx_wname = new JTextField();
		tx_wname.setHorizontalAlignment(SwingConstants.LEFT);
		tx_wname.setFont(new Font("宋体", Font.PLAIN, 16));
		tx_wname.setColumns(10);

		JButton btn_query = new JButton("查询");
		btn_query.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SqlQuery sqlQuery = new SqlQuery();
				String wNum = tx_wnum.getText().trim();
				String wName = tx_wname.getText().trim();
				String sql;
				boolean rs;
				if (wNum.isEmpty() && wName.isEmpty()) {
					sql = "select * from logempmanage;";
					new SqlQuery().sqlQuery(tableModel, columnName, sql);
				} else {
					if (!wNum.isEmpty() && wName.isEmpty()) {
						sql = "select * from logempmanage where log_m_num = (?);";
						rs = sqlQuery.sqlQuery(tableModel, columnName, sql, wNum);
					} else if (wNum.isEmpty() && !wName.isEmpty()) {
						sql = "select * from logempmanage where log_m_name = (?);";
						rs = sqlQuery.sqlQuery(tableModel, columnName, sql, wName);
					} else {
						sql = "select * from logempmanage where log_m_name = (?) and log_m_name = (?);";
						rs = sqlQuery.sqlQuery(tableModel, columnName, sql, wNum, wName);
					}
					if (!rs) {
						JOptionPane.showMessageDialog(null, "结果为空");
					}
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
				sql = "delete from logempmanage where log_m_num = ?";
				excute.sqlExcute(sql, data.get(1));
				JOptionPane.showMessageDialog(null, "操作成功");
			}
		});
		btn_del.setFont(new Font("宋体", Font.PLAIN, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup().addGap(253)
						.addComponent(lb_no, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(tx_wnum, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE).addGap(24)
						.addComponent(lb_name, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(tx_wname, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE).addGap(18)
						.addComponent(btn_query, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(btn_del).addGap(447)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel
				.createSequentialGroup().addGap(14)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btn_query, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
								.addComponent(btn_del, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(tx_wnum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(tx_wname, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
								.addComponent(lb_no, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(lb_name, GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)))
				.addContainerGap()));
		panel.setLayout(gl_panel);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE))
				.addGap(0)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
				groupLayout.createSequentialGroup()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 711, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		table = new JTable();
		table.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
		table.setModel(tableModel);
		table.setBackground(Color.WHITE);
		scrollPane.setViewportView(table);
		setLayout(groupLayout);

		String sql = "select * from logempmanage;";
		new SqlQuery().sqlQuery(tableModel, columnName, sql);
	}

}
