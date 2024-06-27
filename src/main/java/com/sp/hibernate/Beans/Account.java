package com.sp.hibernate.Beans;

public class Account {
	private int accountnumner;
	private String first_name;
	private String last_name;
	private long account_balance;
	private String city;
	public int getAccountnumner() {
		return accountnumner;
	}
	public void setAccountnumner(int accountnumner) {
		this.accountnumner = accountnumner;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public long getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(long account_balance) {
		this.account_balance = account_balance;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
