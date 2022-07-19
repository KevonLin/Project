package com.lin.frame;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import com.lin.bean.EamData;
import com.lin.dao.SqlExcute;
import com.lin.dao.SqlQuery;
import com.lin.utils.EncryptUtils;
import com.lin.utils.GlobalVariables;
import com.lin.utils.JDBCUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

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

	// 管理员用户和普通用户
	private boolean isAdmin = false;

	private JTextField txt_username;
	private JPasswordField txt_password;

	private JCheckBox checkBox;

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
				EncryptUtils enc = new EncryptUtils();
				String rs_pwd;

				if (usr.isEmpty() || pwd.isEmpty()) {
					JOptionPane.showMessageDialog(null, "账号或密码为空");
				} else {
					// 判断是否联网
					boolean isOnline = new JDBCUtils().isOnline();
					if (!isOnline) {
						JOptionPane.showMessageDialog(null, "无法连接到服务器");
						return;
					}

					EamData rs = new EamData();
					try {
						if (checkBox.isSelected()) {
							rs = SqlQuery.getInstance("select username,password from accountadmin where username = (?)",
									usr);
						} else {
							rs = SqlQuery.getInstance("select usr,pwd from accountuser where usr = (?)", usr);
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(rs==null) {
						JOptionPane.showMessageDialog(null, "账号或密码错误");
						return;
					}
					if (checkBox.isSelected()) {
						rs_pwd = rs.getPassword();
					} else {
						rs_pwd = rs.getPwd();
					}
					
					// 密码SHA1加密转换
					pwd = enc.getSHA1Encrypt(pwd);
					if (pwd.equals(rs_pwd)) {
						// 记录日志
						String ip = new JDBCUtils().getIPv4();
						String sql = "insert into loglogin (log_username,log_logintime,log_ipv4) values ((?), current_timestamp, (?));";
						new SqlExcute().sqlExcute(sql, usr, ip);

						// AdminFlag
						if (checkBox.isSelected()) {
							isAdmin = true;
						}

						// 传递username
						GlobalVariables.name = usr;

						f.dispose();
						Image icon = Toolkit.getDefaultToolkit().getImage(".\\img\\eam_logo.png");
						if (isAdmin)
							f = new AdminFrame();
						else
							f = new UserFrame();
						f.setIconImage(icon);
						f.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "账号或密码错误");
					}
				}
			}
		});

		checkBox = new JCheckBox("管理员登录");
		checkBox.setBackground(Color.WHITE);

		GroupLayout gl_login = new GroupLayout(login);
		gl_login.setHorizontalGroup(gl_login.createParallelGroup(Alignment.TRAILING).addGroup(gl_login
				.createSequentialGroup().addContainerGap(82, Short.MAX_VALUE)
				.addGroup(
						gl_login.createParallelGroup(Alignment.LEADING).addComponent(labe_usr).addComponent(label_pwd))
				.addGap(18)
				.addGroup(gl_login.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_login.createSequentialGroup().addComponent(btn_login).addGap(18)
								.addComponent(checkBox))
						.addComponent(txt_password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(txt_username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(60)));
		gl_login.setVerticalGroup(gl_login.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
				gl_login.createSequentialGroup().addGap(85)
						.addGroup(gl_login.createParallelGroup(Alignment.BASELINE)
								.addComponent(labe_usr, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addComponent(txt_username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_login.createParallelGroup(Alignment.BASELINE).addComponent(label_pwd).addComponent(
								txt_password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
						.addGap(44).addGroup(gl_login.createParallelGroup(Alignment.BASELINE).addComponent(btn_login)
								.addComponent(checkBox))
						.addContainerGap(67, Short.MAX_VALUE)));
		login.setLayout(gl_login);

		// 回车锁定登录按钮
		this.getRootPane().setDefaultButton(btn_login);

		this.setVisible(true);
	}

}
