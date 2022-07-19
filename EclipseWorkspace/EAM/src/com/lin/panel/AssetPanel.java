package com.lin.panel;

import java.awt.Toolkit;

import javax.swing.JPanel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.lin.dao.SqlExcute;
import com.lin.dao.SqlQuery;
import com.lin.frame.InsertFrame;
import com.lin.frame.LendRepayFrame;
import com.lin.utils.GlobalVariables;

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
	private JTable assetTable;
	private JTextField tx_no;
	private JTextField tx_name;
	private DefaultTableModel tableModel;

	private boolean isSelectRow() {
		if (assetTable.getSelectedRowCount() != 0) {
			return true;
		}
		return false;
	}

	/**
	 * Create the panel.
	 */
	public AssetPanel() {
		setBounds((width - windowsWedth) / 2, (height - windowsHeight) / 2, windowsWedth, windowsHeight);

		JScrollPane scrollPane = new JScrollPane();

		String[] columnName = { "序号", "资产编号", "资产名称", "购置日期", "剩余", "备注" };
		tableModel = new DefaultTableModel(new Object[][] {}, columnName) {
			/**
			 * 
			 */
			private static final long serialVersionUID = -7076258981853706016L;

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

		JLabel lb_no = new JLabel("资产编号");
		lb_no.setHorizontalAlignment(SwingConstants.CENTER);
		lb_no.setFont(new Font("宋体", Font.PLAIN, 16));

		tx_no = new JTextField();
		tx_no.setHorizontalAlignment(SwingConstants.LEFT);
		tx_no.setFont(new Font("宋体", Font.PLAIN, 16));
		tx_no.setColumns(10);

		JButton btn_query = new JButton("查询");
		btn_query.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				SqlQuery sqlQuery = new SqlQuery();
				String txName = tx_name.getText().trim();
				String txNo = tx_no.getText().trim();
				String sql = null;
				if (txName.equals("") && txNo.equals("")) {
					sql = "select * from asset;";
					new SqlQuery().sqlQuery(tableModel, columnName, sql);
				} else {
					boolean rs;
					if (!txNo.isEmpty() && txName.isEmpty()) {
						sql = "select * from asset where pnum = (?);";
						rs = sqlQuery.sqlQuery(tableModel, columnName, sql, txNo);
					} else if (txNo.isEmpty() && !txName.isEmpty()) {
						sql = "select * from asset where pname = (?);";
						rs = sqlQuery.sqlQuery(tableModel, columnName, sql, txName);
					} else {
						sql = "select * from asset where pnum = (?) and pname = (?);";
						rs = sqlQuery.sqlQuery(tableModel, columnName, sql, txNo, txName);
					}
					if (!rs) {
						JOptionPane.showMessageDialog(null, "结果为空");
					}
				}
			}
		});
		btn_query.setFont(new Font("宋体", Font.PLAIN, 14));

		JButton btn_add = new JButton("添加");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new InsertFrame(columnName);
			}
		});
		btn_add.setFont(new Font("宋体", Font.PLAIN, 14));

		JButton btn_del = new JButton("删除");
		btn_del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vector<Object> data;
				String sql;
				SqlExcute excute = new SqlExcute();
				data = new SqlExcute().getRowData(assetTable);
				sql = "delete from asset where pnum = ?";
				excute.sqlExcute(sql, data.get(1));
				JOptionPane.showMessageDialog(null, "操作成功");
			}
		});
		btn_del.setFont(new Font("宋体", Font.PLAIN, 14));

		JButton btn_edit = new JButton("修改");
		btn_edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Vector<Object> data;
				String sql;
				data = new SqlExcute().getRowData(assetTable);
				sql = "update asset set pname = (?), pdate = ?, presidue = ?,pnote = (?) where pnum = (?);";
				new SqlExcute().sqlExcute(sql, data.get(2), data.get(3), data.get(4), data.get(5), data.get(1));
				JOptionPane.showMessageDialog(null, "操作成功");
			}
		});
		btn_edit.setFont(new Font("宋体", Font.PLAIN, 14));

		JLabel lb_name = new JLabel("资产名称");
		lb_name.setHorizontalAlignment(SwingConstants.CENTER);
		lb_name.setFont(new Font("宋体", Font.PLAIN, 16));

		tx_name = new JTextField();
		tx_name.setHorizontalAlignment(SwingConstants.LEFT);
		tx_name.setFont(new Font("宋体", Font.PLAIN, 16));
		tx_name.setColumns(10);

		JButton btn_lend = new JButton("借用");
		btn_lend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isSelectRow()) {
					JOptionPane.showMessageDialog(null, "没有选中资产");
					return;
				}
				Vector<Object> data;
				SqlExcute excute = new SqlExcute();
				// 获取选中行数据
				data = excute.getRowData(assetTable);
				if (excute.isRowNull()) {
					JOptionPane.showMessageDialog(null, "数据为空");
					return;
				}

				GlobalVariables.data[0] = data.get(1);
				GlobalVariables.data[1] = data.get(2);
				GlobalVariables.data[2] = "借出";
				GlobalVariables.isLend = true;

				// 调用员工信息窗口
				new LendRepayFrame();
			}
		});
		btn_lend.setFont(new Font("宋体", Font.PLAIN, 14));

		JButton btn_repay = new JButton("归还");
		btn_repay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isSelectRow()) {
					JOptionPane.showMessageDialog(null, "没有选中资产");
					return;
				}
				Vector<Object> data;
				SqlExcute excute = new SqlExcute();
				// 获取选中行数据
				data = excute.getRowData(assetTable);
				if (excute.isRowNull()) {
					JOptionPane.showMessageDialog(null, "数据为空");
					return;
				}

				GlobalVariables.data[0] = data.get(1);
				GlobalVariables.data[1] = data.get(2);
				GlobalVariables.data[2] = "归还";
				GlobalVariables.isLend = false;

				// 调用员工信息窗口
				new LendRepayFrame();
			}
		});
		btn_repay.setFont(new Font("宋体", Font.PLAIN, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(186).addComponent(lb_no)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(tx_no, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lb_name, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE).addGap(10)
						.addComponent(tx_name, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE).addGap(28)
						.addComponent(btn_query, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(btn_add).addGap(4)
						.addComponent(btn_del).addPreferredGap(ComponentPlacement.RELATED).addComponent(btn_edit)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(btn_lend)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(btn_repay)
						.addContainerGap(118, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap(12, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel
						.createParallelGroup(Alignment.LEADING).addGroup(gl_panel.createSequentialGroup().addGap(3)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lb_name, GroupLayout.PREFERRED_SIZE, 19,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(tx_no, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lb_no)))
						.addComponent(tx_name, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addComponent(btn_add)
						.addComponent(btn_query, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn_del).addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btn_edit).addComponent(btn_lend).addComponent(btn_repay)))
				.addContainerGap()));
		panel.setLayout(gl_panel);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE))
						.addGap(0)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE).addGap(0)));

		assetTable = new JTable();
		assetTable.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
		assetTable.setBackground(Color.WHITE);

		assetTable.setModel(tableModel);
		scrollPane.setViewportView(assetTable);

		setLayout(groupLayout);

		String sql = "select * from asset;";
		new SqlQuery().sqlQuery(tableModel, columnName, sql);

	}

}
