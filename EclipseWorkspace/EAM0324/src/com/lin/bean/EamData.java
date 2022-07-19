package com.lin.bean;

import java.util.Date;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年3月16日 下午8:55:25
 */

public class EamData {
	// db_account
	private int account_id;
	private String username, password;

	// db_asset
	private int asset_id;
	private String pnum;
	private Date pdate;
	private int presidue;

	// db_assetmanage
	private int assetmanage_id;
	private String am_num, am_pnum, am_pname, am_status, am_wnum, am_name;
	private Date am_datetime;

	// db_emp
	private int emp_id;
	private String wnum, wname, widnum, wphone, wdept;

	// // db_logasm
	// private int logasm_id;
	// private String log_pnum, log_pname, log_wnum, log_wname;
	// private Date log_usetime;
	//
	// // db_logempmanage
	// private int logempmanage_id;
	// private String log_m_num, log_m_name;

	// db_loglogin
	private int loglogin_id;
	private String log_username;
	private Date log_logintime;
	private String log_ipv4;

	public EamData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public EamData(int account_id, String username, String password) {
		super();
		this.account_id = account_id;
		this.username = username;
		this.password = password;
	}



	public EamData(int account_id, String username, String password, int asset_id, String pnum, Date pdate,
			int presidue, int assetmanage_id, String am_num, String am_pnum, String am_pname, String am_status,
			String am_wnum, String am_name, Date am_datetime, int emp_id, String wnum, String wname, String widnum,
			String wphone, String wdept, int loglogin_id, String log_username, Date log_logintime, String log_ipv4) {
		super();
		this.account_id = account_id;
		this.username = username;
		this.password = password;
		this.asset_id = asset_id;
		this.pnum = pnum;
		this.pdate = pdate;
		this.presidue = presidue;
		this.assetmanage_id = assetmanage_id;
		this.am_num = am_num;
		this.am_pnum = am_pnum;
		this.am_pname = am_pname;
		this.am_status = am_status;
		this.am_wnum = am_wnum;
		this.am_name = am_name;
		this.am_datetime = am_datetime;
		this.emp_id = emp_id;
		this.wnum = wnum;
		this.wname = wname;
		this.widnum = widnum;
		this.wphone = wphone;
		this.wdept = wdept;
		this.loglogin_id = loglogin_id;
		this.log_username = log_username;
		this.log_logintime = log_logintime;
		this.log_ipv4 = log_ipv4;
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

	public int getAsset_id() {
		return asset_id;
	}

	public void setAsset_id(int asset_id) {
		this.asset_id = asset_id;
	}

	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}

	public Date getPdate() {
		return pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

	public int getPresidue() {
		return presidue;
	}

	public void setPresidue(int presidue) {
		this.presidue = presidue;
	}

	public int getAssetmanage_id() {
		return assetmanage_id;
	}

	public void setAssetmanage_id(int assetmanage_id) {
		this.assetmanage_id = assetmanage_id;
	}

	public String getAm_num() {
		return am_num;
	}

	public void setAm_num(String am_num) {
		this.am_num = am_num;
	}

	public String getAm_pnum() {
		return am_pnum;
	}

	public void setAm_pnum(String am_pnum) {
		this.am_pnum = am_pnum;
	}

	public String getAm_pname() {
		return am_pname;
	}

	public void setAm_pname(String am_pname) {
		this.am_pname = am_pname;
	}

	public String getAm_status() {
		return am_status;
	}

	public void setAm_status(String am_status) {
		this.am_status = am_status;
	}

	public String getAm_wnum() {
		return am_wnum;
	}

	public void setAm_wnum(String am_wnum) {
		this.am_wnum = am_wnum;
	}

	public String getAm_name() {
		return am_name;
	}

	public void setAm_name(String am_name) {
		this.am_name = am_name;
	}

	public Date getAm_datetime() {
		return am_datetime;
	}

	public void setAm_datetime(Date am_datetime) {
		this.am_datetime = am_datetime;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getWnum() {
		return wnum;
	}

	public void setWnum(String wnum) {
		this.wnum = wnum;
	}

	public String getWname() {
		return wname;
	}

	public void setWname(String wname) {
		this.wname = wname;
	}

	public String getWidnum() {
		return widnum;
	}

	public void setWidnum(String widnum) {
		this.widnum = widnum;
	}

	public String getWphone() {
		return wphone;
	}

	public void setWphone(String wphone) {
		this.wphone = wphone;
	}

	public String getWdept() {
		return wdept;
	}

	public void setWdept(String wdept) {
		this.wdept = wdept;
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
		return "EamData [account_id=" + account_id + ", username=" + username + ", password=" + password + ", asset_id="
				+ asset_id + ", pnum=" + pnum + ", pdate=" + pdate + ", presidue=" + presidue + ", assetmanage_id="
				+ assetmanage_id + ", am_num=" + am_num + ", am_pnum=" + am_pnum + ", am_pname=" + am_pname
				+ ", am_status=" + am_status + ", am_wnum=" + am_wnum + ", am_name=" + am_name + ", am_datetime="
				+ am_datetime + ", emp_id=" + emp_id + ", wnum=" + wnum + ", wname=" + wname + ", widnum=" + widnum
				+ ", wphone=" + wphone + ", wdept=" + wdept + ", loglogin_id=" + loglogin_id + ", log_username="
				+ log_username + ", log_logintime=" + log_logintime + ", log_ipv4=" + log_ipv4 + "]";
	}

	// getter() setter() and constructor

}
