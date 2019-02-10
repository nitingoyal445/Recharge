package com.Recharge.services;

import java.math.BigDecimal;

import com.Recharge.bean.Client;

public interface RechargeService {
	public Client createAccount(String name,String phoneNo,String connection,BigDecimal amount);
	public Client rechargeAccount(String phoneNo,BigDecimal amount);
	public Client getAccountDetails(String phoneNo);
	public Client showBalance(String phoneNo);

}
