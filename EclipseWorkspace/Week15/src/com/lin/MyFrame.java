package com.lin;

import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.junit.Test;

import com.bean.MyBook;
import com.dao.SqlOperation;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class MyFrame {

	private JFrame frame;
	private JTextField bNum;
	private JTextField bName;
	private JTextField bType;
	private JTextField bAuth;
	private JTextField bPublishing;
	private JTextField bInventory;
	private JTextField pNum;
	private JTextField pName;
	private JTextField pType;
	private JTextField pPhone;
	private JTextField pAddr;
	private JTable table;
	private JTextField log;
	private DefaultTableModel model;

	// private void QueryAll() {
	// String sql = "select b.bNum, bName, bType, bAuth, bPublishing, bInventory,
	// p.pNum, pName, pType, pPhone, pAddr from Book b,BP,Publishing p where b.bNum
	// = BP.bNum and p.pNum=BP.pNum and b.bNum";
	// MyBook result = new SqlOperation().QueryAll(sql);
	// System.out.println(result);
	// model.addRow(new Object[] { result.getbNum(), result.getbName(),
	// result.getbType(), result.getbAuth(),
	// result.getbPublishing(), result.getbInvertory(), result.getpNum(),
	// result.getpName(),
	// result.getpType(), result.getpPhone(), result.getpAddr() });
	// }

	@Test
	public void test1() {
		String sql = "select bType from Book";
		SqlOperation op = new SqlOperation();
		MyBook rsBook = null;
		while (true) {
			rsBook = op.queryForMyBook(sql);
			System.out.println(rsBook);
			if (rsBook == null) {
				break;
			}
		}
	}

	private boolean isExist(String bNum, String pNum) {
		String sql1 = "select * from Book where bNum = ?";
		String sql2 = "select * from Publishing where pNum = ?";
		MyBook book = new SqlOperation().QueryForBook(sql1, bNum);
		MyBook pub = new SqlOperation().QueryForPub(sql2, pNum);
		if (book != null && pub != null) {
			return true;
		}
		return false;
	}

	private boolean bookIsExist(String bNum) {
		String sql = "select * from Book where bNum = ?";
		MyBook book = new SqlOperation().QueryForBook(sql, bNum);
		if (book != null) {
			return true;
		}
		return false;
	}

	private boolean pubIsExist(String pNum) {
		String sql = "select * from Publishing where pNum = ?";
		MyBook pub = new SqlOperation().QueryForPub(sql, pNum);
		if (pub != null) {
			return true;
		}
		return false;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MyFrame window = new MyFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("图书管理系统");
		frame.setBounds(100, 100, 1145, 605);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel bBook = new JPanel();
		bBook.setBorder(
				new TitledBorder(null, "\u56FE\u4E66\u4FE1\u606F", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JPanel publishing = new JPanel();
		publishing.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"\u4F9B\u5E94\u5546\u4FE1\u606F", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JLabel tpNum = new JLabel("\u4F9B\u5E94\u5546\u7F16\u53F7");

		pNum = new JTextField();
		pNum.setColumns(10);

		JLabel tpName = new JLabel("\u4F9B\u5E94\u5546\u540D\u79F0");

		pName = new JTextField();
		pName.setColumns(10);

		JLabel tpType = new JLabel("\u4F9B\u5E94\u5546\u7C7B\u578B");

		pType = new JTextField();
		pType.setColumns(10);

		JLabel tpPhone = new JLabel("\u7535\u8BDD");

		pPhone = new JTextField();
		pPhone.setColumns(10);

		JLabel tpAddr = new JLabel("\u5730\u5740");

		pAddr = new JTextField();
		pAddr.setColumns(10);

		JButton pInsert = new JButton("\u6DFB\u52A0");
		pInsert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (pubIsExist(pNum.getText())) {
					log.setText("出版商号已存在");
					return;
				}
				String sql = "insert into Publishing values (?,?,?,?,?)";
				String sql2 = "insert into BP (pNum) values (?)";
				new SqlOperation().Update(sql, pNum.getText(), pName.getText(), pType.getText(), pPhone.getText(),
						pAddr.getText());
				new SqlOperation().Update(sql2, pNum.getText());
				log.setText("添加成功");
			}
		});

		JButton pQuery = new JButton("查询");
		pQuery.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!pubIsExist(pNum.getText())) {
					log.setText("供应商不存在");
					return;
				}
				String sql = "select * from Publishing where pNum = ?";
				MyBook result = new SqlOperation().QueryForPub(sql, pNum.getText());
				if (model.getRowCount() > 0) {
					model.removeRow(0);
				}
				model.addRow(new Object[] { "", "", "", "", "", "", result.getpNum(), result.getpName(),
						result.getpType(), result.getpPhone(), result.getpAddr() });
				log.setText("查询成功");
			}
		});

		JButton pUpdate = new JButton("\u4FEE\u6539");
		pUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!pubIsExist(pNum.getText())) {
					log.setText("数据不存在");
					return;
				}
				String sql = "update Publishing set pName = ? ,pType = ?, pPhone = ?, pAddr= ? where pNum = ?";
				new SqlOperation().Update(sql, pName.getText(), pType.getText(), pPhone.getText(), pAddr.getText(),
						pNum.getText());
				log.setText("修改成功");
			}
		});

		JButton pDel = new JButton("\u5220\u9664");
		pDel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!pubIsExist(pNum.getText())) {
					log.setText("数据不存在");
					return;
				}
				String sql1 = "update BP set pNum = ? where pNum = ?";
				String sql2 = "delete from Publishing where pNum = ?";
				new SqlOperation().Update(sql1, "", pNum.getText());
				new SqlOperation().Update(sql2, pNum.getText());
				log.setText("删除成功");
			}
		});
		GroupLayout gl_publishing = new GroupLayout(publishing);
		gl_publishing.setHorizontalGroup(gl_publishing.createParallelGroup(Alignment.LEADING).addGroup(gl_publishing
				.createSequentialGroup().addGap(28)
				.addGroup(gl_publishing.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_publishing.createSequentialGroup().addComponent(tpAddr).addGap(33)
								.addComponent(pAddr, GroupLayout.PREFERRED_SIZE, 582, GroupLayout.PREFERRED_SIZE)
								.addGap(28).addComponent(pInsert).addGap(18).addComponent(pQuery).addGap(18)
								.addComponent(pUpdate).addGap(18).addComponent(pDel))
						.addGroup(gl_publishing.createSequentialGroup().addComponent(tpNum).addGap(10)
								.addComponent(pNum, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(tpName).addGap(18)
								.addComponent(pName, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
								.addGap(28).addComponent(tpType).addGap(18)
								.addComponent(pType, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
								.addGap(57).addComponent(tpPhone).addGap(18).addComponent(pPhone)))
				.addContainerGap(96, Short.MAX_VALUE)));
		gl_publishing.setVerticalGroup(gl_publishing.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_publishing.createSequentialGroup().addGap(20)
						.addGroup(gl_publishing.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_publishing.createSequentialGroup().addGap(3).addComponent(tpPhone))
								.addGroup(gl_publishing.createSequentialGroup().addGap(3).addComponent(tpNum))
								.addGroup(gl_publishing.createSequentialGroup().addGap(3).addComponent(tpType))
								.addComponent(pPhone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(pType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_publishing.createSequentialGroup().addGap(3).addComponent(tpName))
								.addComponent(pName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(
										pNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_publishing.createParallelGroup(Alignment.LEADING).addGroup(gl_publishing
								.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
								.addGroup(gl_publishing.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_publishing.createSequentialGroup()
												.addGroup(gl_publishing.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_publishing.createParallelGroup(Alignment.BASELINE)
																.addComponent(pUpdate).addComponent(pQuery)
																.addComponent(pInsert))
														.addComponent(pDel))
												.addContainerGap())
										.addGroup(
												gl_publishing.createSequentialGroup().addComponent(tpAddr).addGap(16))))
								.addGroup(
										gl_publishing.createSequentialGroup().addGap(24)
												.addComponent(pAddr, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addContainerGap()))));
		publishing.setLayout(gl_publishing);

		JPanel result = new JPanel();
		result.setBorder(
				new TitledBorder(null, "\u67E5\u8BE2\u7ED3\u679C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(25)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(result, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(Alignment.LEADING,
										groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(bBook, GroupLayout.DEFAULT_SIZE, 1081, Short.MAX_VALUE)
												.addComponent(publishing, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addContainerGap(23, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(19)
						.addComponent(bBook, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(publishing, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(result, GroupLayout.PREFERRED_SIZE, 277, Short.MAX_VALUE).addContainerGap()));

		JScrollPane scrollPane = new JScrollPane();

		JButton rInsert = new JButton("添加");
		rInsert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isExist(bNum.getText(), pNum.getText())) {
					log.setText("该书号或出版商号已存在");
					return;
				}
				String sql1 = "insert into Book values (?,?,?,?,?,?)";
				String sql2 = "insert into Publishing values (?,?,?,?,?)";
				String sql3 = "insert into BP values (?,?)";
				new SqlOperation().Update(sql1, bNum.getText(), bName.getText(), bType.getText(), bAuth.getText(),
						bPublishing.getText(), bInventory.getText());
				new SqlOperation().Update(sql2, pNum.getText(), pName.getText(), pType.getText(), pPhone.getText(),
						pAddr.getText());
				new SqlOperation().Update(sql3, bNum.getText(), pNum.getText());
				log.setText("添加成功");
			}
		});

		JButton rQuery = new JButton("查询");
		rQuery.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!isExist(bNum.getText(), pNum.getText())) {
					log.setText("书号或者供应商号不存在");
					return;
				}
				String sql = "select b.bNum, bName, bType, bAuth, bPublishing, bInventory, p.pNum, pName, pType, pPhone, pAddr from Book b,BP,Publishing p  where b.bNum = BP.bNum and p.pNum=BP.pNum and b.bNum = ?";
				MyBook result = new SqlOperation().QueryForAll(sql, bNum.getText());
				// if (result == null) {
				// log.setText("数据不存在");
				// return;
				// }
				if (model.getRowCount() > 0) {
					model.removeRow(0);
				}
				model.addRow(new Object[] { result.getbNum(), result.getbName(), result.getbType(), result.getbAuth(),
						result.getbPublishing(), result.getbInvertory(), result.getpNum(), result.getpName(),
						result.getpType(), result.getpPhone(), result.getpAddr() });
				log.setText("查询成功");
			}
		});

		JButton rUpdate = new JButton("修改");
		rUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!isExist(bNum.getText(), pNum.getText())) {
					log.setText("数据不存在");
					return;
				}
				String sql1 = "update Book set bName = ? ,bType = ?, bAuth = ?, bPublishing= ?, bInventory = ? where bNum = ?";
				String sql2 = "update Publishing set pName = ? ,pType = ?, pPhone = ?, pAddr= ? where pNum = ?";
				new SqlOperation().Update(sql1, bName.getText(), bType.getText(), bAuth.getText(),
						bPublishing.getText(), bInventory.getText(), bNum.getText());
				new SqlOperation().Update(sql2, pName.getText(), pType.getText(), pPhone.getText(), pAddr.getText(),
						pNum.getText());
				log.setText("修改成功");
			}
		});

		JButton rDel = new JButton("删除");
		rDel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!isExist(bNum.getText(), pNum.getText())) {
					log.setText("数据不存在");
					return;
				}
				String sql1 = "delete from BP where bNum = ? and pNum = ?";
				String sql2 = "delete from Book where bNum = ?";
				String sql3 = "delete from Publishing where pNum = ?";
				new SqlOperation().Update(sql1, bNum.getText(), pNum.getText());
				new SqlOperation().Update(sql2, bNum.getText());
				new SqlOperation().Update(sql3, pNum.getText());
				log.setText("删除成功");
			}
		});

		log = new JTextField();
		log.setColumns(10);
		GroupLayout gl_result = new GroupLayout(result);
		gl_result.setHorizontalGroup(gl_result.createParallelGroup(Alignment.LEADING).addGroup(gl_result
				.createSequentialGroup().addGap(29)
				.addGroup(gl_result.createParallelGroup(Alignment.LEADING, false).addGroup(gl_result
						.createSequentialGroup().addGap(177)
						.addComponent(rInsert, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE).addGap(91)
						.addComponent(rQuery, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE).addGap(77)
						.addComponent(rUpdate, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE).addGap(81)
						.addComponent(rDel, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1009, Short.MAX_VALUE).addComponent(log))
				.addContainerGap(35, Short.MAX_VALUE)));
		gl_result.setVerticalGroup(gl_result.createParallelGroup(Alignment.TRAILING).addGroup(gl_result
				.createSequentialGroup().addContainerGap(11, Short.MAX_VALUE)
				.addGroup(gl_result.createParallelGroup(Alignment.BASELINE).addComponent(rInsert).addComponent(rDel)
						.addComponent(rUpdate).addComponent(rQuery))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(log, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE).addContainerGap()));

		table = new JTable();
		table.setEnabled(false);
		model = new DefaultTableModel(new Object[][] {},
				new String[] { "\u56FE\u4E66\u7F16\u53F7", "\u56FE\u4E66\u540D\u79F0", "\u56FE\u4E66\u7C7B\u578B",
						"\u4F5C\u8005", "\u51FA\u7248\u793E", "\u5E93\u5B58", "\u4F9B\u5E94\u5546\u7F16\u53F7",
						"\u4F9B\u5E94\u5546\u540D\u79F0", "\u4F9B\u5E94\u5546\u7C7B\u578B", "\u7535\u8BDD",
						"\u5730\u5740" });
		table.setModel(model);
		scrollPane.setViewportView(table);
		result.setLayout(gl_result);

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Point mousepoint;
				mousepoint = e.getPoint(); // 获取鼠标位置
				int rowSelect = table.rowAtPoint(mousepoint); // 此方法返回行号
				table.setRowSelectionInterval(rowSelect, rowSelect); // 设置为选中此行
				List<String> list = new ArrayList<>();
				for (int i = 0; i < table.getColumnCount(); i++) {
					list.add((String) table.getValueAt(rowSelect, i));
				}

				// Iterator<String> iterator = list.iterator();
				// while (iterator.hasNext()) {
				// System.out.println(iterator.next());
				// }

				bNum.setText(list.get(0));
				bName.setText(list.get(1));
				bType.setText(list.get(2));
				bAuth.setText(list.get(3));
				bPublishing.setText(list.get(4));
				bInventory.setText(list.get(5));
				pNum.setText(list.get(6));
				pName.setText(list.get(7));
				pType.setText(list.get(8));
				pPhone.setText(list.get(9));
				pAddr.setText(list.get(10));
			}
		});

		JLabel tbookNum = new JLabel("\u56FE\u4E66\u7F16\u53F7");

		bNum = new JTextField();
		bNum.setColumns(10);

		JLabel tbookName = new JLabel("\u56FE\u4E66\u540D\u79F0");

		JLabel tPublishing = new JLabel("\u51FA\u7248\u793E");

		bPublishing = new JTextField();
		bPublishing.setColumns(10);

		JLabel tbInventory = new JLabel("\u5E93\u5B58");

		bName = new JTextField();
		bName.setColumns(10);

		JLabel tbookType = new JLabel("\u56FE\u4E66\u7C7B\u578B");

		bInventory = new JTextField();
		bInventory.setColumns(10);

		JButton bInsert = new JButton("\u6DFB\u52A0");
		bInsert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (bookIsExist(bNum.getText())) {
					log.setText("该书号已存在");
					return;
				}
				String sql = "insert into Book values (?,?,?,?,?,?)";
				String sql2 = "insert into BP values(? , null)";
				new SqlOperation().Update(sql, bNum.getText(), bName.getText(), bType.getText(), bAuth.getText(),
						bPublishing.getText(), bInventory.getText());
				new SqlOperation().Update(sql2, bNum.getText());
				log.setText("添加成功");
			}
		});

		bType = new JTextField();
		bType.setColumns(10);

		JLabel tbookAuth = new JLabel("\u4F5C\u8005");

		bAuth = new JTextField();
		bAuth.setColumns(10);

		JButton bQuery = new JButton("查询");
		bQuery.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!bookIsExist(bNum.getText())) {
					log.setText("数据不存在");
					return;
				}
				String sql = "select * from Book where bNum = ?";
				MyBook result = new SqlOperation().QueryForBook(sql, bNum.getText());
				if (model.getRowCount() > 0) {
					model.removeRow(0);
				}
				model.addRow(new Object[] { result.getbNum(), result.getbName(), result.getbType(), result.getbAuth(),
						result.getbPublishing(), result.getbInvertory() });
				log.setText("查询成功");
			}
		});

		JButton bUpdate = new JButton("\u4FEE\u6539");
		bUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!bookIsExist(bNum.getText())) {
					log.setText("数据不存在");
					return;
				}
				String sql = "update Book set bName = ? ,bType = ?, bAuth = ?, bPublishing= ?, bInventory = ? where bNum = ?";
				new SqlOperation().Update(sql, bName.getText(), bType.getText(), bAuth.getText(), bPublishing.getText(),
						bInventory.getText(), bNum.getText());
				log.setText("修改成功");
			}
		});

		JButton bDel = new JButton("\u5220\u9664");
		bDel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!bookIsExist(bNum.getText())) {
					log.setText("数据不存在");
					return;
				}
				String sql1 = "update BP set bNum = ? where bNum = ?";
				String sql2 = "delete from Book where bNum = ?";
				new SqlOperation().Update(sql1, "", bNum.getText());
				new SqlOperation().Update(sql2, bNum.getText());
				log.setText("删除成功");
			}
		});
		GroupLayout gl_bBook = new GroupLayout(bBook);
		gl_bBook.setHorizontalGroup(gl_bBook.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_bBook.createSequentialGroup().addGap(28)
						.addGroup(gl_bBook.createParallelGroup(Alignment.LEADING).addComponent(tbookNum)
								.addComponent(tPublishing))
						.addGap(10)
						.addGroup(gl_bBook
								.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_bBook.createSequentialGroup()
										.addComponent(bNum, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
										.addGap(27).addComponent(tbookName).addGap(18)
										.addComponent(bName, GroupLayout.PREFERRED_SIZE, 139,
												GroupLayout.PREFERRED_SIZE)
										.addGap(35).addComponent(tbookType).addGap(18)
										.addComponent(bType, GroupLayout.PREFERRED_SIZE, 138,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
										.addComponent(tbookAuth).addGap(18).addComponent(bAuth,
												GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING,
										gl_bBook.createSequentialGroup()
												.addComponent(bPublishing, GroupLayout.PREFERRED_SIZE, 142,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18).addComponent(tbInventory).addGap(18)
												.addComponent(bInventory, GroupLayout.PREFERRED_SIZE, 144,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
												.addComponent(bInsert).addGap(18).addComponent(bQuery).addGap(19)
												.addComponent(bUpdate).addGap(18).addComponent(bDel)))
						.addGap(95)));
		gl_bBook.setVerticalGroup(gl_bBook.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_bBook.createSequentialGroup().addGap(20)
						.addGroup(gl_bBook.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_bBook.createSequentialGroup().addGap(3).addComponent(tbookNum))
								.addComponent(bNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_bBook.createSequentialGroup().addGap(3).addComponent(tbookName))
								.addComponent(bName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_bBook.createSequentialGroup().addGap(3).addComponent(tbookType))
								.addGroup(gl_bBook.createParallelGroup(Alignment.BASELINE)
										.addComponent(bType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(bAuth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(tbookAuth)))
						.addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
						.addGroup(gl_bBook.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING,
										gl_bBook.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_bBook.createParallelGroup(Alignment.BASELINE)
														.addComponent(bQuery).addComponent(bInsert))
												.addGroup(
														gl_bBook.createParallelGroup(Alignment.BASELINE)
																.addComponent(bDel).addComponent(bUpdate)))
								.addGroup(Alignment.TRAILING, gl_bBook.createParallelGroup(Alignment.LEADING)
										.addComponent(bPublishing, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_bBook.createSequentialGroup().addGap(3).addComponent(tPublishing))
										.addGroup(gl_bBook.createSequentialGroup().addGap(3).addComponent(tbInventory))
										.addComponent(bInventory, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		bBook.setLayout(gl_bBook);
		frame.getContentPane().setLayout(groupLayout);
	}
}
