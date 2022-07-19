package bak;

import java.util.Date;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年3月18日 下午8:56:04
 */

public class DBLogLogin {
	private int loglogin_id;
	private String log_username;
	private Date log_logintime;
	private String log_ipv4;

	public DBLogLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DBLogLogin(int loglogin_id, String log_username, Date log_logintime, String log_ipv4) {
		super();
		this.loglogin_id = loglogin_id;
		this.log_username = log_username;
		this.log_logintime = log_logintime;
		this.log_ipv4 = log_ipv4;
	}

	public int getLoglogin_id() {
		return loglogin_id;
	}

	public void setLoglogin_id(int loglogin_id) {
		this.loglogin_id = loglogin_id;
	}

	public String getLog_username() {
		return log_username;
	}

	public void setLog_username(String log_username) {
		this.log_username = log_username;
	}

	public Date getLog_logintime() {
		return log_logintime;
	}

	public void setLog_logintime(Date log_logintime) {
		this.log_logintime = log_logintime;
	}

	public String getLog_ipv4() {
		return log_ipv4;
	}

	public void setLog_ipv4(String log_ipv4) {
		this.log_ipv4 = log_ipv4;
	}

	@Override
	public String toString() {
		return "DBLogLogin [loglogin_id=" + loglogin_id + ", log_username=" + log_username + ", log_logintime="
				+ log_logintime + ", log_ipv4=" + log_ipv4 + "]";
	}

}
