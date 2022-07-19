package bak;

import java.util.Date;

/**
 * @author Kevonlin
 * @Descption
 * @date 2022年3月18日 下午8:54:49
 */

public class DBAsset {
	private int asset_id;
	private String pnum;
	private String pname;
	private Date pdate;
	private int presidue;

	public DBAsset() {
		super();
		// TODO Auto-generated constructor stub
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

	public DBAsset(int asset_id, String pnum, String pname, Date pdate, int presidue) {
		super();
		this.asset_id = asset_id;
		this.pnum = pnum;
		this.pname = pname;
		this.pdate = pdate;
		this.presidue = presidue;
	}

}
