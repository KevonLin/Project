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
	private JTextField tx_pnum;
	private JTextField tx_pname;
	private JTextField tx_wnum;
	private JTextField tx_wname;

	private DefaultTableModel tableModel;

	/**
	 * Create the panel.
	 */
	public LogAssetPnael() {
		setBounds((width - windowsWedth) / 2, (height - windowsHeight) / 2, windowsWedth, windowsHeight);

		JScrollPane scrollPane = new JScrollPane();

		JPanel panel = new JPanel();
		panel.setBorder(null);

		String[] columnName = { "序号", "资产编号", "资产名称", "借用人工号", "借用人姓名", "状态", "时间" };
		tableModel = new DefaultTableModel(new Object[][] {}, columnName) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 4241576413661012589L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		JLabel lb_pnum = new JLabel("资产编号");
		lb_pnum.setHorizontalAlignment(SwingConstants.CENTER);
		lb_pnum.setFont(new Font("宋体", Font.PLAIN, 16));

		tx_pnum = new JTextField();
		tx_pnum.setHorizontalAlignment(SwingConstants.LEFT);
		tx_pnum.setFont(new Font("宋体", Font.PLAIN, 16));
		tx_pnum.setColumns(10);

		JButton btn_query = new JButton("查询");
		btn_query.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SqlQuery sqlQuery = new SqlQuery();
				String pNum = tx_pnum.getText().trim();
				String pName = tx_pname.getText().trim();
				String wNum = tx_wnum.getText().trim();
				String wName = tx_wname.getText().trim();
				String sql;
				boolean rs;
				if (pNum.isEmpty() && pName.isEmpty() && wNum.isEmpty() && wName.isEmpty()) {
					sql = "select * from assetmanage;";
					new SqlQuery().sqlQuery(tableModel, columnName, sql);
				} else {
					if (!pNum.isEmpty() && pName.isEmpty() && wNum.isEmpty() && wName.isEmpty()) {
						sql = "select * from assetmanage where log_pnum = (?);";
						rs = sqlQuery.sqlQuery(tableModel, columnName, sql, pNum);
					} else if (pNum.isEmpty() && !pName.isEmpty() && wNum.isEmpty() && wName.isEmpty()) {
						sql = "select * from assetmanage where log_pname = (?);";
						rs = sqlQuery.sqlQuery(tableModel, columnName, sql, pName);
					} else if (pNum.isEmpty() && pName.isEmpty() && !wNum.isEmpty() && wName.isEmpty()) {
						sql = "select * from assetmanage where log_wnum = (?)";
						rs = sqlQuery.sqlQuery(tableModel, columnName, sql, wNum);
					} else if (pNum.isEmpty() && pName.isEmpty() && wNum.isEmpty() && !wName.isEmpty()) {
						sql = "select * from assetmanage where log_wname = (?)";
						rs = sqlQuery.sqlQuery(tableModel, columnName, sql, wName);
					} else {
						sql = "select * from assetmanage where log_pnum=(?) and log_pname=(?) and log_wnum=(?) and log_name=(?);";
						rs = sqlQuery.sqlQuery(tableModel, columnName, sql, pNum, pName, wNum, wName);
					}
					if (!rs) {
						JOptionPane.showMessageDialog(null, "结果为空");
					}
				}
			}
		});
		btn_query.setHorizontalAlignment(SwingConstants.LEFT);
		btn_query.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_query.setFont(new Font("宋体", Font.PLAIN, 14));

		JLabel lb_pname = new JLabel("产品名称");
		lb_pname.setHorizontalAlignment(SwingConstants.CENTER);
		lb_pname.setFont(new Font("宋体", Font.PLAIN, 16));

		tx_pname = new JTextField();
		tx_pname.setHorizontalAlignment(SwingConstants.LEFT);
		tx_pname.setFont(new Font("宋体", Font.PLAIN, 16));
		tx_pname.setColumns(10);

		JLabel lb_wnum = new JLabel("借用人工号");
		lb_wnum.setHorizontalAlignment(SwingConstants.CENTER);
		lb_wnum.setFont(new Font("宋体", Font.PLAIN, 16));

		tx_wnum = new JTextField();
		tx_wnum.setHorizontalAlignment(SwingConstants.LEFT);
		tx_wnum.setFont(new Font("宋体", Font.PLAIN, 16));
		tx_wnum.setColumns(10);

		tx_wname = new JTextField();
		tx_wname.setHorizontalAlignment(SwingConstants.LEFT);
		tx_wname.setFont(new Font("宋体", Font.PLAIN, 16));
		tx_wname.setColumns(10);

		JLabel lb_wname = new JLabel("借用人姓名");
		lb_wname.setHorizontalAlignment(SwingConstants.CENTER);
		lb_wname.setFont(new Font("宋体", Font.PLAIN, 16));

		JButton btn_query_3 = new JButton("删除");
		btn_query_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vector<Object> data;
				String sql;
				SqlExcute excute = new SqlExcute();
				data = new SqlExcute().getRowData(table);
				sql = "delete from assetmanage where log_pnum = ?";
				excute.sqlExcute(sql, data.get(1));
				JOptionPane.showMessageDialog(null, "操作成功");
			}
		});
		btn_query_3.setHorizontalAlignment(SwingConstants.LEFT);
		btn_query_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_query_3.setFont(new Font("宋体", Font.PLAIN, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addComponent(lb_pnum, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(tx_pnum, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(lb_pname, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(tx_pname, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lb_wnum, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE).addGap(2)
						.addComponent(tx_wnum, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(lb_wname, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(tx_wname, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btn_query, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btn_query_3, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(213, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap(16, Short.MAX_VALUE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE, false)
								.addComponent(tx_pnum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lb_pnum)
								.addComponent(tx_pname, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(lb_pname, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(tx_wnum, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(lb_wnum, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(tx_wname, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(lb_wname, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn_query, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn_query_3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		panel.setLayout(gl_panel);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE))
						.addGap(0)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup()
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 753, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		table = new JTable();
		table.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
		table.setModel(tableModel);
		scrollPane.setViewportView(table);
		setLayout(groupLayout);

		String sql = "select * from assetmanage;";
		new SqlQuery().sqlQuery(tableModel, columnName, sql);
	}

}
