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
		
		setTitle("�Զ��崰��");
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		makeJlable();
		addJbutton();
	}
	public void makeJlable(){
		JLabel jLabel = new JLabel();
		jLabel.setText("��һ����ǩ");
		
		add(jLabel);
		//�������壬�Ӵּ��ֺŴ�С
		jLabel.setFont(new Font("����",Font.BOLD,14));
		//�����������ɫ
		jLabel.setForeground(Color.RED);
		//���ñ�ǩ��һ������ɫ
		jLabel.setOpaque(true);
		jLabel.setBackground(Color.BLUE);
		jLabel.setToolTipText("��ʾ��http://www.baidu.com");
	}
	public void addJbutton(){
		ImageIcon imageIcon = new ImageIcon("images\\shu.png");
		JButton jButton = new JButton("ȷ��");
		Image image2 = imageIcon.getImage();
		Image scaledInstance = image2.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		jButton.setIcon(new ImageIcon(scaledInstance));
		add(jButton);
	}
}
