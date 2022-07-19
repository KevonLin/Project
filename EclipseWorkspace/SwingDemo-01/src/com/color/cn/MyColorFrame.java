package com.color.cn;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MyColorFrame extends JFrame{

	public MyColorFrame(){
		setTitle("��ɫ��ǩ����");
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new FlowLayout());
		
		
		jPanel.add(makeJlabel("1", Color.RED));
		jPanel.add(makeJlabel("2", Color.GRAY));
		jPanel.add(makeJlabel("3", Color.BLUE));
		jPanel.add(makeJlabel("4", Color.DARK_GRAY));
		
		add(jPanel);
		
	}
	
	
	public Component makeJlabel(String txt,Color c){
		JLabel a1 = new JLabel(txt);
		a1.setOpaque(true);//����Ϊ��͸����Ĭ������Ϊ͸��
		//���ñ�����ɫ
		a1.setBackground(c);
		//����jlabe��ѳߴ�
		a1.setPreferredSize(new Dimension(60, 30));
		a1.setHorizontalAlignment(JLabel.CENTER);
		return a1;
		
	}
	
}
