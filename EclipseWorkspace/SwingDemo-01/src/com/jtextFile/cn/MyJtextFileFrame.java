package com.jtextFile.cn;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.cust.cn.ListOption;

public class MyJtextFileFrame extends JFrame{

	public MyJtextFileFrame() {
		setTitle("�ı����������");
		JPanel jPanel = new JPanel();
		
//		JButton jButton = new JButton("ȷ��");
//		jPanel.add(jButton);
		JComboBox<ListOption> colorList = new JComboBox<>();
		colorList.addItem(new ListOption(Color.black,"��ɫ"));
		colorList.addItem(new ListOption(Color.blue,"��ɫ"));
		colorList.addItem(new ListOption(Color.gray,"��ɫ"));

		jPanel.add(colorList);
		JCheckBox cbx = new JCheckBox("���붩���ʼ�֪ͨ");
		jPanel.add(cbx);
		JTextField jTextField = new JTextField(15);
		jPanel.add(jTextField);
		add(jPanel);
	}

}
