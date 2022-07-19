package bak;

import java.awt.Toolkit;

import javax.swing.JPanel;

/** 
* @author Kevonlin
* @Descption 
* @date 2022年3月16日 下午2:55:29 
*/

public class InitPanel {
	// 获取屏幕分辨率
	public int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	public int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	// 设置窗体大小
	public int windowsWedth = 1366;
	public int windowsHeight = 768;
	public InitPanel(JPanel panel) {
		panel.setBounds((width - windowsWedth) / 2, (height - windowsHeight) / 2, windowsWedth, windowsHeight);
	}
}
