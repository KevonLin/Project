package com.table.cn;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MyjTableFrame extends JFrame{

	public MyjTableFrame(){
		setTitle("table标签使用");
		
		String[] headerStrings={"姓名","年龄"};
		String[][] dataStrings={{"李四","23"},{"王五","22"}};
		DefaultTableModel defaultTableModel = new DefaultTableModel(dataStrings, headerStrings);
		JTable table= new JTable(defaultTableModel);
		JScrollPane jScrollPane = new JScrollPane(table);
		add(jScrollPane);
	}
}
