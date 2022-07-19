package bak;

import javax.swing.JPanel;

/** 
* @author Kevonlin
* @Descption 
* @date 2022年3月15日 下午8:48:37 
*/

public class SwitchPanel {
	public SwitchPanel(JPanel from,JPanel to) {
		from.removeAll();
		from.add(to);
		from.repaint();
		from.validate();
	}
}
