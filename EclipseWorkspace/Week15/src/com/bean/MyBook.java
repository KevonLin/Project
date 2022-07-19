package com.bean;

public class MyBook {
	private String bNum;
	private String bName;
	private String bType;
	private String bAuth;
	private String bPublishing;
	private String bInvertory;
	private String pNum;
	private String pName;
	private String pType;
	private String pPhone;
	private String pAddr;

	public MyBook() {
	}

	public MyBook(String pNum, String pName, String pType, String pPhone, String pAddr) {
		super();
		this.pNum = pNum;
		this.pName = pName;
		this.pType = pType;
		this.pPhone = pPhone;
		this.pAddr = pAddr;
	}

	public MyBook(String bNum, String bName, String bType, String bAuth, String bPublishing, String bInvertory) {
		super();
		this.bNum = bNum;
		this.bName = bName;
		this.bType = bType;
		this.bAuth = bAuth;
		this.bPublishing = bPublishing;
		this.bInvertory = bInvertory;
	}

	public MyBook(String bNum, String bName, String bType, String bAuth, String bPublishing, String bInvertory,
			String pNum, String pName, String pType, String pPhone, String pAddr) {
		super();
		this.bNum = bNum;
		this.bName = bName;
		this.bType = bType;
		this.bAuth = bAuth;
		this.bPublishing = bPublishing;
		this.bInvertory = bInvertory;
		this.pNum = pNum;
		this.pName = pName;
		this.pType = pType;
		this.pPhone = pPhone;
		this.pAddr = pAddr;
	}

	public String getbNum() {
		return bNum;
	}

	public void setbNum(String bNum) {
		this.bNum = bNum;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbType() {
		return bType;
	}

	public void setbType(String bType) {
		this.bType = bType;
	}

	public String getbAuth() {
		return bAuth;
	}

	public void setbAuth(String bAuth) {
		this.bAuth = bAuth;
	}

	public String getbPublishing() {
		return bPublishing;
	}

	public void setbPublishing(String bPublishing) {
		this.bPublishing = bPublishing;
	}

	public String getbInvertory() {
		return bInvertory;
	}

	public void setbInvertory(String bInvertory) {
		this.bInvertory = bInvertory;
	}

	public String getpNum() {
		return pNum;
	}

	public void setpNum(String pNum) {
		this.pNum = pNum;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpType() {
		return pType;
	}

	public void setpType(String pType) {
		this.pType = pType;
	}

	public String getpPhone() {
		return pPhone;
	}

	public void setpPhone(String pPhone) {
		this.pPhone = pPhone;
	}

	public String getpAddr() {
		return pAddr;
	}

	public void setpAddr(String pAddr) {
		this.pAddr = pAddr;
	}

	@Override
	public String toString() {
		return "MyBook [bNum=" + bNum + ", bName=" + bName + ", bType=" + bType + ", bAuth=" + bAuth + ", bPublishing="
				+ bPublishing + ", bInvertory=" + bInvertory + ", pNum=" + pNum + ", pName=" + pName + ", pType="
				+ pType + ", pPhone=" + pPhone + ", pAddr=" + pAddr + "]";
	}

}
