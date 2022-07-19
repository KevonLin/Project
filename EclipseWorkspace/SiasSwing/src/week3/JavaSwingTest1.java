package week3;

public class JavaSwingTest1 {

	protected static void createGUI() {
		// TODO Auto-generated method stub
		MyJFrame frame = new MyJFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 700);
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				createGUI();
			}
		});
	}

}
