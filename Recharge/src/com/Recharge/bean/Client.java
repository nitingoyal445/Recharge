package com.Recharge.bean;

import java.math.BigDecimal;

public class Client {
	private String name;
	private String phoneNo;
	private String connection;
	private Balance balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getConnection() {
		return connection;
	}
	public void setConnection(String connection) {
		this.connection = connection;
	}
	public Balance getBalance() {
		return balance;
	}
	public void setBalance(Balance balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Client [name=" + name + ", mobileNo=" + phoneNo + ", connection="+connection +",balance=" + balance + "]";
	}
	

}
