package com.lin.panel;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import com.lin.dao.SqlQuery;
import com.lin.utils.GlobalVariables;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年3月31日 下午5:34:39
 */

public class UserMainPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1799152057153480806L;

	// 获取屏幕分辨率
	public int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	public int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	// 设置窗体大小
	public int windowsWedth = 1366;
	public int windowsHeight = 768;
	private JTable table;
	private JTextField tx_no;
	private JTextField tx_name;
	private DefaultTableModel tableModel;

	/**
	 * Create the panel.
	 */
	public UserMainPanel() {
		setBounds((width - windowsWedth) / 2, (height - windowsHeight) / 2, windowsWedth, windowsHeight);

		JScrollPane scrollPane = new JScrollPane();

		JPanel panel = new JPanel();
		panel.setBorder(null);

		String[] columnName = { "\u5E8F\u53F7", "\u8D44\u4EA7\u7F16\u53F7", "\u8D44\u4EA7\u540D\u79F0",
				"\u501F\u7528\u4EBA\u5DE5\u53F7", "\u501F\u7528\u4EBA\u59D3\u540D", "\u72B6\u6001", "\u65F6\u95F4" };
		tableModel = new DefaultTableModel(new Object[][] {}, columnName) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 3644492432214795547L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		JLabel lb_no = new JLabel("资产编号");
		lb_no.setHorizontalAlignment(SwingConstants.CENTER);
		lb_no.setFont(new Font("宋体", Font.PLAIN, 16));

		tx_no = new JTextField();
		tx_no.setHorizontalAlignment(SwingConstants.LEFT);
		tx_no.setFont(new Font("宋体", Font.PLAIN, 16));
		tx_no.setColumns(10);

		JButton btn_query = new JButton("查询");
		btn_query.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SqlQuery query = new SqlQuery();
				String pNum = tx_no.getText().trim();
				String pName = tx_name.getText().trim();
				String sql = null;
				boolean rs = false;
				if (pNum.isEmpty() && pName.isEmpty()) {
					sql = "select * from assetmanage;";
					rs = query.sqlQuery(tableModel, columnName, sql);
				} else {
					if (!pNum.isEmpty() && pName.isEmpty()) {
						sql = "select * from assetmanage where aw_pnum = (?);";
						rs = query.sqlQuery(tableModel, columnName, sql, pNum);
					} else if (pNum.isEmpty() && !pName.isEmpty()) {
						sql = "select * from assetmanage where am_pname = (?);";
						rs = query.sqlQuery(tableModel, columnName, sql, pName);
					} else {
						sql = "select * from assetmanage where aw_pnum = (?) and am_pname = (?);";
						rs = query.sqlQuery(tableModel, columnName, sql, pNum, pName);
					}
				}
				if (!rs) {
					JOptionPane.showMessageDialog(null, "结果为空");
				}
			}
		});
		btn_query.setHorizontalAlignment(SwingConstants.LEFT);
		btn_query.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_query.setFont(new Font("宋体", Font.PLAIN, 14));

		JLabel lb_name = new JLabel("产品名称");
		lb_name.setHorizontalAlignment(SwingConstants.CENTER);
		lb_name.setFont(new Font("宋体", Font.PLAIN, 16));

		tx_name = new JTextField();
		tx_name.setHorizontalAlignment(SwingConstants.LEFT);
		tx_name.setFont(new Font("宋体", Font.PLAIN, 16));
		tx_name.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(326)
						.addComponent(lb_no, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(tx_no, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(lb_name, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(tx_name, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(btn_query, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(462, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap(16, Short.MAX_VALUE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(tx_no, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lb_no)
								.addComponent(tx_name, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(lb_name, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn_query, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		panel.setLayout(gl_panel);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE))
						.addGap(0)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)));

		table = new JTable();
		table.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
		table.setModel(tableModel);
		scrollPane.setViewportView(table);
		setLayout(groupLayout);

		String sql = "select * from assetmanage where am_wnum = (select wnum from accountuser,emp where accountuser.enum=emp.wnum and usr = (?));";
		new SqlQuery().sqlQuery(tableModel, columnName, sql, GlobalVariables.name);
	}

}
