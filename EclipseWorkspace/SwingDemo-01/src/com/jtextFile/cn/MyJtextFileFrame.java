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
		setTitle("文本框组件插入");
		JPanel jPanel = new JPanel();
		
//		JButton jButton = new JButton("确定");
//		jPanel.add(jButton);
		JComboBox<ListOption> colorList = new JComboBox<>();
		colorList.addItem(new ListOption(Color.black,"黑色"));
		colorList.addItem(new ListOption(Color.blue,"蓝色"));
		colorList.addItem(new ListOption(Color.gray,"灰色"));

		jPanel.add(colorList);
		JCheckBox cbx = new JCheckBox("我想订阅邮件通知");
		jPanel.add(cbx);
		JTextField jTextField = new JTextField(15);
		jPanel.add(jTextField);
		add(jPanel);
	}

}
