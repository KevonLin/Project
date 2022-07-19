package com.Jframe.cn;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.table.cn.MyjTableFrame;

public class MainFrame {


	private static void createGUI()
	{
		MyjTableFrame frame = new MyjTableFrame();
//		frame.getContentPane().setLayout(new FlowLayout());
//		setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		//���ô���ͼ����ʾ
		ImageIcon imageIcon = new ImageIcon("images\\shu.png");
		Image image = imageIcon.getImage();
		frame.setIconImage(image);
		
		
		//���ô�����Ļ������ʾ
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				createGUI();
			}
		});

	}

	
}
