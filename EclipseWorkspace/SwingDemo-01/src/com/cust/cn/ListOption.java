package com.cust.cn;

import java.awt.Color;

public class ListOption {

	private Color c;
	private String nameString;
	
	
	public ListOption(Color c, String nameString) {
		super();
		this.c = c;
		this.nameString = nameString;
	}
	public Color getC() {
		return c;
	}
	public void setC(Color c) {
		this.c = c;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return nameString;
	}
	
	
}
