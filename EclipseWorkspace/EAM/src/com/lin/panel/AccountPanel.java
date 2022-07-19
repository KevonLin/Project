package com.lin.panel;

import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.DefaultTableModel;

import com.lin.dao.SqlExcute;
import com.lin.dao.SqlQuery;
import com.lin.frame.InsertFrame;
import com.lin.utils.EncryptUtils;

import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年3月16日 下午6:06:14
 */

public class AccountPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4984151229965214447L;

	// 获取屏幕分辨率
	public int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	public int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	// 设置窗体大小
	public int windowsWedth = 1366;
	public int windowsHeight = 768;
	private JTable accountTable;
	private JTextField tx_name;
	private DefaultTableModel tableModel;

	private JCheckBox checkBox;

	/**
	 * Create the panel.
	 */
	public AccountPanel() {
		setBounds((width - windowsWedth) / 2, (height - windowsHeight) / 2, windowsWedth, windowsHeight);

		JScrollPane scrollPane = new JScrollPane();

		JPanel panel = new JPanel();

		checkBox = new JCheckBox("管理員用戶");

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1356, Short.MAX_VALUE)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1356, Short.MAX_VALUE))
						.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup()
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE).addGap(0)));

		String[] userColumnName = { "序号", "用户名", "密码", "工号" };
		String[] adminColumnName = { "序号", "管理员用户名", "密码" };
		if (checkBox.isSelected()) {
			tableModel = new DefaultTableModel(new Object[][] {}, adminColumnName) {
				/**
				 * 
				 */
				private static final long serialVersionUID = 2709459863418584460L;

				@Override
				public boolean isCellEditable(int row, int column) {
					if (column == 1) {
						return true;
					} else {
						return false;
					}
				}
			};
		} else {
			tableModel = new DefaultTableModel(new Object[][] {}, userColumnName) {

				/**
				 * 
				 */
				private static final long serialVersionUID = 1905811936447772210L;

				@Override
				public boolean isCellEditable(int row, int column) {
					if (column == 2) {
						return true;
					} else {
						return false;
					}
				}
			};
		}

		JButton btn_add = new JButton("添加");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (checkBox.isSelected())
					new InsertFrame(adminColumnName);
				else
					new InsertFrame(userColumnName);
			}
		});
		btn_add.setFont(new Font("宋体", Font.PLAIN, 14));

		JButton btn_del = new JButton("删除");
		btn_del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vector<Object> data;
				String sql;
				SqlExcute excute = new SqlExcute();
				data = new SqlExcute().getRowData(accountTable);
				if (checkBox.isSelected()) {
					sql = "delete from accountadmin where username = ?";
				} else {
					sql = "delete from accountuser where usr = ?";
				}
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
				data = new SqlExcute().getRowData(accountTable);
				if (checkBox.isSelected()) {
					sql = "update accountadmin set `password`= (?) where username = ?;";
				} else {
					sql = "update accountuser set pwd = (?) where usr = ?";
				}
				String pwd = new EncryptUtils().getSHA1Encrypt((String) data.get(2));
				new SqlExcute().sqlExcute(sql, pwd, data.get(1));
				JOptionPane.showMessageDialog(null, "操作成功");
			}
		});
		btn_edit.setFont(new Font("宋体", Font.PLAIN, 14));

		JLabel lb_usr = new JLabel("用户名");
		lb_usr.setHorizontalAlignment(SwingConstants.CENTER);
		lb_usr.setFont(new Font("宋体", Font.PLAIN, 16));

		tx_name = new JTextField();
		tx_name.setHorizontalAlignment(SwingConstants.LEFT);
		tx_name.setFont(new Font("宋体", Font.PLAIN, 16));
		tx_name.setColumns(10);

		JButton btn_query = new JButton("查询");
		btn_query.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				boolean rs;
				String sql;
				SqlQuery sqlQuery = new SqlQuery();
				String usr = tx_name.getText().trim();
				if (usr.isEmpty()) {
					if (checkBox.isSelected()) {
						sql = "select * from accountadmin;";
						new SqlQuery().sqlQuery(tableModel, adminColumnName, sql);
					} else {
						sql = "select * from accountuser;";
						new SqlQuery().sqlQuery(tableModel, userColumnName, sql);
					}
				} else {
					if (checkBox.isSelected()) {
						sql = "select * from accountadmin where username = (?);";
						rs = sqlQuery.sqlQuery(tableModel, adminColumnName, sql, usr);
					} else {
						sql = "select * from accountuser where usr = (?);";
						rs = sqlQuery.sqlQuery(tableModel, userColumnName, sql, usr);
					}
					if (!rs) {
						JOptionPane.showMessageDialog(null, "结果为空");
					}
				}
			}
		});
		btn_query.setFont(new Font("宋体", Font.PLAIN, 14));

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap(319, Short.MAX_VALUE)
						.addComponent(lb_usr, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(tx_name, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(checkBox).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btn_query, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(btn_add).addGap(5)
						.addComponent(btn_del).addGap(5).addComponent(btn_edit).addGap(380)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap(17, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(btn_add)
								.addComponent(btn_query, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(tx_name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lb_usr).addComponent(checkBox))
						.addComponent(btn_del).addComponent(btn_edit))
				.addContainerGap()));
		panel.setLayout(gl_panel);

		checkBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String sql = null;
				if (checkBox.isSelected()) {
					sql = "select * from accountadmin;";
					new SqlQuery().sqlQuery(tableModel, adminColumnName, sql);
				} else {
					sql = "select * from accountuser;";
					new SqlQuery().sqlQuery(tableModel, userColumnName, sql);
				}
			}
		});

		accountTable = new JTable();
		accountTable.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
		accountTable.setBackground(Color.WHITE);
		accountTable.setModel(tableModel);
		scrollPane.setViewportView(accountTable);
		setLayout(groupLayout);

		String sqlAllAccount = "select * from accountuser;";
		new SqlQuery().sqlQuery(tableModel, userColumnName, sqlAllAccount);
	}
}
