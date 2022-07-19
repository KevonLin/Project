package week3;

@SuppressWarnings("serial")
public class MyJFrame extends JFrame {
	public MyJFrame() {
		setTitle("������");
		JPanel panel = new JPanel();
		JTextPane jTextPane = new JTextPane();
		panel.add(jTextPane);
		panel.add(AddButton("1"));
		panel.add(AddButton("2"));
		panel.add(AddButton("3"));
		add(panel);
	}

	public Component AddButton(String txt) {
		JButton btn = new JButton(txt);
		btn.setPreferredSize(new Dimension(60, 40));
		return btn;
	}
}
