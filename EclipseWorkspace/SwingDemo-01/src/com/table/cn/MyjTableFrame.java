package com.table.cn;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MyjTableFrame extends JFrame{

	public MyjTableFrame(){
		setTitle("table��ǩʹ��");
		
		String[] headerStrings={"����","����"};
		String[][] dataStrings={{"����","23"},{"����","22"}};
		DefaultTableModel defaultTableModel = new DefaultTableModel(dataStrings, headerStrings);
		JTable table= new JTable(defaultTableModel);
		JScrollPane jScrollPane = new JScrollPane(table);
		add(jScrollPane);
	}
}
