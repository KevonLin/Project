package com.lin.test;

public class Person {
	private String m_name;
	private String m_phone;
	private String m_email;
	private int m_age;
	private boolean m_male;

	//
	public String getName() {
		return m_name;
	}

	public void setName(String name) {
		m_name = name;
	}

	public String getPhone() {
		return m_phone;
	}

	public void setPhone(String phone) {
		m_phone = phone;
	}

	public String getEmail() {
		return m_email;
	}

	public void setEmail(String email) {
		m_email = email;
	}

	public int getAge() {
		return m_age;
	}

	public void setAge(int age) {
		m_age = age;
	}

	public boolean isMale() {
		return m_male;
	}

	public void setMale(boolean male) {
		m_male = male;
	}
}