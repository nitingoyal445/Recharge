package com.Recharge.services;

import java.math.BigDecimal;

import com.Recharge.bean.Balance;
import com.Recharge.bean.Client;
import com.Recharge.repo.RechargeRepo;

public class RechargeServiceImpl implements RechargeService{
	RechargeRepo rechargeRepo;

	public RechargeServiceImpl(RechargeRepo rechargeRepo) {
		super();
		this.rechargeRepo = rechargeRepo;
	}
	Client client;
	Balance balance;
	@Override
	public Client createAccount(String name, String phoneNo, String connection, BigDecimal amount) {
		client=new Client();
		client.setPhoneNo(phoneNo);
		client.setName(name);
		client.setConnection(connection);
		balance=new Balance();
		balance.setAmount(amount);
		client.setBalance(balance);
		rechargeRepo.save(client);
		
		return client;
	}

	@Override
	public Client rechargeAccount(String phoneNo, BigDecimal amount) {
		client=showBalance(phoneNo);
		balance=client.getBalance();
		balance.setAmount(balance.getAmount().add(amount));
		client.setBalance(balance);
		
		return client;
	}

	@Override
	public Client getAccountDetails(String phoneNo) {
		client=rechargeRepo.findOne(phoneNo);
		return client;
	}

	@Override
	public Client showBalance(String phoneNo) {
		
		return rechargeRepo.findOne(phoneNo);
	}

}
