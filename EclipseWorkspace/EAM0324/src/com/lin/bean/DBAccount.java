package com.lin.bean;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年3月18日 下午8:54:24
 */

public class DBAccount extends EamData{
	private int account_id;
	private String username, password;

	public DBAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DBAccount(int account_id, String username, String password) {
		super();
		this.account_id = account_id;
		this.username = username;
		this.password = password;
	}

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "DBAccount [account_id=" + account_id + ", username=" + username + ", password=" + password + "]";
	}

}
