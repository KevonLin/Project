package com.lin;

import java.awt.EventQueue;

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
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MyFrame {

	private JFrame frame;
	private JTextField BookNum;
	private JTextField BookName;
	private JTextField BookType;
	private JTextField BookAuth;
	private JTextField publishing;
	private JTextField inventory;
	private JTextField pNum;
	private JTextField pName;
	private JTextField pType;
	private JTextField pPhone;
	private JTextField pAddr;
	private JTextField bookType;
	private JTable tableResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
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
		frame.setBounds(100, 100, 862, 605);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel bBook = new JPanel();
		bBook.setBorder(new TitledBorder(null, "\u56FE\u4E66\u4FE1\u606F", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel bPublishing = new JPanel();
		bPublishing.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u4F9B\u5E94\u5546\u4FE1\u606F", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
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
		
		JButton pQuery = new JButton("\u67E5\u627E");
		
		JButton pUpdate = new JButton("\u4FEE\u6539");
		
		JButton pDel = new JButton("\u5220\u9664");
		GroupLayout gl_bPublishing = new GroupLayout(bPublishing);
		gl_bPublishing.setHorizontalGroup(
			gl_bPublishing.createParallelGroup(Alignment.LEADING)
				.addGap(0, 775, Short.MAX_VALUE)
				.addGroup(gl_bPublishing.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_bPublishing.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_bPublishing.createSequentialGroup()
							.addComponent(tpNum)
							.addGap(10)
							.addComponent(pNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(38)
							.addComponent(tpName)
							.addGap(18)
							.addComponent(pName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(83)
							.addComponent(tpType)
							.addGap(18)
							.addComponent(pType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(76)
							.addComponent(tpPhone)
							.addGap(18)
							.addComponent(pPhone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_bPublishing.createSequentialGroup()
							.addComponent(tpAddr)
							.addGap(18)
							.addComponent(pAddr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(248)
							.addComponent(pInsert)
							.addGap(18)
							.addComponent(pQuery)
							.addGap(18)
							.addComponent(pUpdate)
							.addGap(27)
							.addComponent(pDel)))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		gl_bPublishing.setVerticalGroup(
			gl_bPublishing.createParallelGroup(Alignment.LEADING)
				.addGap(0, 120, Short.MAX_VALUE)
				.addGroup(gl_bPublishing.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_bPublishing.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_bPublishing.createSequentialGroup()
							.addGap(3)
							.addComponent(tpNum))
						.addComponent(pNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_bPublishing.createSequentialGroup()
							.addGap(3)
							.addComponent(tpName))
						.addComponent(pName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_bPublishing.createSequentialGroup()
							.addGap(3)
							.addComponent(tpType))
						.addComponent(pType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_bPublishing.createSequentialGroup()
							.addGap(3)
							.addComponent(tpPhone))
						.addComponent(pPhone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(gl_bPublishing.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_bPublishing.createSequentialGroup()
							.addGap(4)
							.addComponent(tpAddr))
						.addGroup(gl_bPublishing.createSequentialGroup()
							.addGap(1)
							.addComponent(pAddr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(pInsert)
						.addComponent(pQuery)
						.addComponent(pUpdate)
						.addComponent(pDel))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		bPublishing.setLayout(gl_bPublishing);
		
		JPanel result = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(result, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(bPublishing, GroupLayout.PREFERRED_SIZE, 775, GroupLayout.PREFERRED_SIZE)
						.addComponent(bBook, GroupLayout.PREFERRED_SIZE, 775, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(46, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(bBook, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(bPublishing, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(result, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		
		JComboBox boxType = new JComboBox();
		
		bookType = new JTextField();
		bookType.setColumns(10);
		
		JLabel textBookType = new JLabel("\u4E66\u7C4D\u7C7B\u578B");
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_result = new GroupLayout(result);
		gl_result.setHorizontalGroup(
			gl_result.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_result.createSequentialGroup()
					.addGroup(gl_result.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_result.createSequentialGroup()
							.addGap(39)
							.addComponent(textBookType)
							.addGap(18)
							.addComponent(bookType, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
							.addGap(58)
							.addComponent(boxType, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_result.createSequentialGroup()
							.addGap(29)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 698, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		gl_result.setVerticalGroup(
			gl_result.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_result.createSequentialGroup()
					.addContainerGap(16, Short.MAX_VALUE)
					.addGroup(gl_result.createParallelGroup(Alignment.BASELINE)
						.addComponent(bookType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textBookType)
						.addComponent(boxType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE))
		);
		
		tableResult = new JTable();
		scrollPane.setViewportView(tableResult);
		result.setLayout(gl_result);
		
		JLabel tbookNum = new JLabel("\u56FE\u4E66\u7F16\u53F7");
		
		BookNum = new JTextField();
		BookNum.setColumns(10);
		
		JLabel tbookName = new JLabel("\u56FE\u4E66\u540D\u79F0");
		
		JLabel tPublishing = new JLabel("\u51FA\u7248\u793E");
		
		publishing = new JTextField();
		publishing.setColumns(10);
		
		JLabel tInventory = new JLabel("\u5E93\u5B58");
		
		BookName = new JTextField();
		BookName.setColumns(10);
		
		JLabel tbookType = new JLabel("\u56FE\u4E66\u7C7B\u578B");
		
		inventory = new JTextField();
		inventory.setColumns(10);
		
		JButton bInsert = new JButton("\u6DFB\u52A0");
		
		BookType = new JTextField();
		BookType.setColumns(10);
		
		JLabel tbookAuth = new JLabel("\u4F5C\u8005");
		
		BookAuth = new JTextField();
		BookAuth.setColumns(10);
		
		JButton bQuery = new JButton("\u67E5\u627E");
		
		JButton bUpdate = new JButton("\u4FEE\u6539");
		
		JButton bDel = new JButton("\u5220\u9664");
		GroupLayout gl_bBook = new GroupLayout(bBook);
		gl_bBook.setHorizontalGroup(
			gl_bBook.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_bBook.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_bBook.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_bBook.createSequentialGroup()
							.addComponent(tbookNum)
							.addGap(10)
							.addComponent(BookNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(38)
							.addComponent(tbookName)
							.addGap(18)
							.addComponent(BookName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(83)
							.addComponent(tbookType)
							.addGap(18)
							.addComponent(BookType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(76)
							.addComponent(tbookAuth)
							.addGap(18)
							.addComponent(BookAuth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_bBook.createSequentialGroup()
							.addComponent(tPublishing)
							.addGap(18)
							.addComponent(publishing, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(66)
							.addComponent(tInventory)
							.addGap(18)
							.addComponent(inventory, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(74)
							.addComponent(bInsert)
							.addGap(18)
							.addComponent(bQuery)
							.addGap(18)
							.addComponent(bUpdate)
							.addGap(27)
							.addComponent(bDel)))
					.addContainerGap(54, Short.MAX_VALUE))
		);
		gl_bBook.setVerticalGroup(
			gl_bBook.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_bBook.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_bBook.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_bBook.createSequentialGroup()
							.addGap(3)
							.addComponent(tbookNum))
						.addComponent(BookNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_bBook.createSequentialGroup()
							.addGap(3)
							.addComponent(tbookName))
						.addComponent(BookName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_bBook.createSequentialGroup()
							.addGap(3)
							.addComponent(tbookType))
						.addComponent(BookType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_bBook.createSequentialGroup()
							.addGap(3)
							.addComponent(tbookAuth))
						.addComponent(BookAuth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(gl_bBook.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_bBook.createSequentialGroup()
							.addGap(4)
							.addComponent(tPublishing))
						.addGroup(gl_bBook.createSequentialGroup()
							.addGap(1)
							.addComponent(publishing, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_bBook.createSequentialGroup()
							.addGap(4)
							.addComponent(tInventory))
						.addGroup(gl_bBook.createSequentialGroup()
							.addGap(1)
							.addComponent(inventory, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(bInsert)
						.addComponent(bQuery)
						.addComponent(bUpdate)
						.addComponent(bDel))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		bBook.setLayout(gl_bBook);
		frame.getContentPane().setLayout(groupLayout);
	}
}
