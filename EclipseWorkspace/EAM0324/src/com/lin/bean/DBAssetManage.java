package com.lin.bean;

import java.util.Date;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年3月18日 下午8:55:30
 */

public class DBAssetManage {
	private int assetmanage_id;
	private String am_num, am_pnum, am_pname, am_status, am_wnum, am_name;
	private Date am_datetime;

	public DBAssetManage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DBAssetManage(int assetmanage_id, String am_num, String am_pnum, String am_pname, String am_status,
			String am_wnum, String am_name, Date am_datetime) {
		super();
		this.assetmanage_id = assetmanage_id;
		this.am_num = am_num;
		this.am_pnum = am_pnum;
		this.am_pname = am_pname;
		this.am_status = am_status;
		this.am_wnum = am_wnum;
		this.am_name = am_name;
		this.am_datetime = am_datetime;
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

	@Override
	public String toString() {
		return "DBAssetManage [assetmanage_id=" + assetmanage_id + ", am_num=" + am_num + ", am_pnum=" + am_pnum
				+ ", am_pname=" + am_pname + ", am_status=" + am_status + ", am_wnum=" + am_wnum + ", am_name="
				+ am_name + ", am_datetime=" + am_datetime + "]";
	}

}
