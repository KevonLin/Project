package bak;

import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.lin.utils.JDBCUtils;

/** 
* @author Kevonlin
* @Descption 
* @date 2022年3月29日 下午3:44:21 
*/

public class Test extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1501335550483922044L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
		);
		
		table = new JTable();
		DefaultTableModel tmhavesold = new DefaultTableModel();// 建立默认的JTable模型
		table.setModel(tmhavesold);
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
		
		try {
			Vector<String> columnName = new Vector<String>();// 字段名
			Vector<Vector<Object>> dataVector = new Vector<Vector<Object>>(); // 存储所有数据，里面每个小的Vector是存单行的
			columnName.add("asset_id");
			columnName.add("pnum");
			columnName.add("pname");
			columnName.add("pdate");
			columnName.add("presidue");
			Statement stmt = JDBCUtils.getConnection().createStatement();
			ResultSet executeQuery = stmt
					.executeQuery("select asset_id, pnum, pname, pdate, presidue from asset;");

			while (executeQuery.next()) {
				Vector<Object> vec = new Vector<Object>();// 就是这个存单行的，最后放到上面的大的Vector里面
				for (int i = 1; i <= 5; i++) {
					vec.add(executeQuery.getObject(i));
				}
				dataVector.add(vec);
			}
			
			tmhavesold.setDataVector(dataVector, columnName);// 设定模型数据和字段
			JDBCUtils.closeResource(JDBCUtils.getConnection(), stmt);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		}
		
	}

}
