package lin.frame;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6865002264453035195L;

	private final JPanel login;
	private static JFrame f;
	private static Image icon;

	// 获取屏幕宽高
	public int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	public int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	// 设置宽高
	public int windowsWedth = 428;
	public int windowsHeight = 328;

	private JTextField txt_username;
	private JPasswordField txt_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					icon = Toolkit.getDefaultToolkit().getImage(".\\img\\eam_logo.png");
					f = new LoginFrame();
					f.setIconImage(icon);
					f.setResizable(false);
					f.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setTitle("EAM");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 自适应
		setBounds((width - windowsWedth) / 2, (height - windowsHeight) / 2, windowsWedth, windowsHeight);

		login = new JPanel();
		login.setBackground(Color.WHITE);
		setContentPane(login);

		JLabel labe_usr = new JLabel("用户名");
		labe_usr.setFont(new Font("微软雅黑", Font.PLAIN, 16));

		JLabel label_pwd = new JLabel("密   码");
		label_pwd.setFont(new Font("微软雅黑", Font.PLAIN, 16));

		txt_username = new JTextField();
		txt_username.setFont(new Font("Arial", Font.PLAIN, 16));
		txt_username.setColumns(16);

		txt_password = new JPasswordField();
		txt_password.setFont(new Font("Arial", Font.PLAIN, 16));
		txt_password.setColumns(16);

		JButton btn_login = new JButton("登录");
		btn_login.setBackground(Color.WHITE);
		btn_login.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		btn_login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String usr = String.valueOf(txt_username.getText().trim());
				String pwd = String.valueOf(txt_password.getPassword());
				if (usr.equals("") || pwd.equals("")) {
					JOptionPane.showMessageDialog(null, "账号或密码为空");
				} else {
					DBAccount rs = new DBAccount();
					try {
						rs = SQLQuery.getInstance(rs, "select * from account where username = ?", usr);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
//					String sql = "select * from account where username = ?";
//					DBAccount rs = new SqlOperation().queryForUsrPwd(sql, usr);
					if (rs == null) {
						JOptionPane.showMessageDialog(null, "账号或密码错误");
						return;
					}
					String rs_pwd = rs.getPassword();
					if (pwd.equals(rs_pwd)) {
						f.dispose();
						Image icon = Toolkit.getDefaultToolkit().getImage(".\\img\\eam_logo.png");
						JFrame jf = new MainFrame();
						jf.setIconImage(icon);
						jf.setVisible(true);
					}
				}
			}
		});

		GroupLayout gl_login = new GroupLayout(login);
		gl_login.setHorizontalGroup(gl_login.createParallelGroup(Alignment.TRAILING).addGroup(gl_login
				.createSequentialGroup().addContainerGap(72, Short.MAX_VALUE)
				.addGroup(gl_login.createParallelGroup(Alignment.LEADING).addGroup(gl_login.createSequentialGroup()
						.addGroup(gl_login
								.createParallelGroup(Alignment.LEADING).addComponent(labe_usr).addComponent(label_pwd))
						.addGap(18)
						.addGroup(gl_login.createParallelGroup(Alignment.LEADING)
								.addComponent(txt_password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(txt_username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_login.createSequentialGroup().addGap(105).addComponent(btn_login)))
				.addGap(60)));
		gl_login.setVerticalGroup(gl_login.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_login.createSequentialGroup().addGap(85)
						.addGroup(gl_login.createParallelGroup(Alignment.BASELINE)
								.addComponent(labe_usr, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addComponent(txt_username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_login.createParallelGroup(Alignment.BASELINE).addComponent(label_pwd).addComponent(
								txt_password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
						.addGap(45)
						.addComponent(btn_login, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(56)));
		login.setLayout(gl_login);

		// 回车锁定登录按钮
		this.getRootPane().setDefaultButton(btn_login);

		this.setVisible(true);
	}

}
