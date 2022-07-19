package com.lin.bean;

import java.util.Date;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年3月16日 下午8:55:25
 */

public class EamData {
	// db_admin
	private int admin_id;
	private String username, password;

	// db_usr
	private int usr_id;
	private String usr, pwd, eNum;

	// db_asset
	private int asset_id;
	private String pnum;
	private String pname;
	private Date pdate;
	private int presidue;
	private String pnote;

	// db_assetmanage
	private int assetmanage_id;
	private String am_num, am_pnum, am_pname, am_status, am_wnum, am_name;
	private Date am_datetime;

	// db_emp
	private int emp_id;
	private String wnum, wname, widnum, wphone, wdept;

	// db_logasm
	private int logasm_id;
	private String log_pnum, log_pname, log_wnum, log_wname;
	private Date log_usetime;

	// db_logempmanage
	private int logempmanage_id;
	private String log_m_num, log_m_name;

	// db_loglogin
	private int loglogin_id;
	private String log_username;
	private Date log_logintime;
	private String log_ipv4;

	public EamData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
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

	public int getUsr_id() {
		return usr_id;
	}

	public void setUsr_id(int usr_id) {
		this.usr_id = usr_id;
	}

	public String getUsr() {
		return usr;
	}

	public void setUsr(String usr) {
		this.usr = usr;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String geteNum() {
		return eNum;
	}

	public void seteNum(String eNum) {
		this.eNum = eNum;
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

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
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

	public String getPnote() {
		return pnote;
	}

	public void setPnote(String pnote) {
		this.pnote = pnote;
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

	public int getLogasm_id() {
		return logasm_id;
	}

	public void setLogasm_id(int logasm_id) {
		this.logasm_id = logasm_id;
	}

	public String getLog_pnum() {
		return log_pnum;
	}

	public void setLog_pnum(String log_pnum) {
		this.log_pnum = log_pnum;
	}

	public String getLog_pname() {
		return log_pname;
	}

	public void setLog_pname(String log_pname) {
		this.log_pname = log_pname;
	}

	public String getLog_wnum() {
		return log_wnum;
	}

	public void setLog_wnum(String log_wnum) {
		this.log_wnum = log_wnum;
	}

	public String getLog_wname() {
		return log_wname;
	}

	public void setLog_wname(String log_wname) {
		this.log_wname = log_wname;
	}

	public Date getLog_usetime() {
		return log_usetime;
	}

	public void setLog_usetime(Date log_usetime) {
		this.log_usetime = log_usetime;
	}

	public int getLogempmanage_id() {
		return logempmanage_id;
	}

	public void setLogempmanage_id(int logempmanage_id) {
		this.logempmanage_id = logempmanage_id;
	}

	public String getLog_m_num() {
		return log_m_num;
	}

	public void setLog_m_num(String log_m_num) {
		this.log_m_num = log_m_num;
	}

	public String getLog_m_name() {
		return log_m_name;
	}

	public void setLog_m_name(String log_m_name) {
		this.log_m_name = log_m_name;
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

}
