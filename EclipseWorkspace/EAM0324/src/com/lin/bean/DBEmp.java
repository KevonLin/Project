package com.lin.bean;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年3月18日 下午8:55:44
 */

public class DBEmp {
	private int emp_id;
	private String wnum, wname, widnum, wphone, wdept;

	public DBEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DBEmp(int emp_id, String wnum, String wname, String widnum, String wphone, String wdept) {
		super();
		this.emp_id = emp_id;
		this.wnum = wnum;
		this.wname = wname;
		this.widnum = widnum;
		this.wphone = wphone;
		this.wdept = wdept;
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

	@Override
	public String toString() {
		return "DBEmp [emp_id=" + emp_id + ", wnum=" + wnum + ", wname=" + wname + ", widnum=" + widnum + ", wphone="
				+ wphone + ", wdept=" + wdept + "]";
	}

}
