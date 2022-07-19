package com.MyFrame.cn;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{


	public MyFrame(){
		
		setTitle("自定义窗体");
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		makeJlable();
		addJbutton();
	}
	public void makeJlable(){
		JLabel jLabel = new JLabel();
		jLabel.setText("第一个标签");
		
		add(jLabel);
		//设置字体，加粗及字号大小
		jLabel.setFont(new Font("宋体",Font.BOLD,14));
		//设置字体的颜色
		jLabel.setForeground(Color.RED);
		//设置标签的一个背景色
		jLabel.setOpaque(true);
		jLabel.setBackground(Color.BLUE);
		jLabel.setToolTipText("提示：http://www.baidu.com");
	}
	public void addJbutton(){
		ImageIcon imageIcon = new ImageIcon("images\\shu.png");
		JButton jButton = new JButton("确认");
		Image image2 = imageIcon.getImage();
		Image scaledInstance = image2.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		jButton.setIcon(new ImageIcon(scaledInstance));
		add(jButton);
	}
}
