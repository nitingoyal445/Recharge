package com.Recharge.repo;

import java.util.HashMap;

import com.Recharge.bean.Client;

public class RechargeRepoImpl implements RechargeRepo {
	Client client;
	HashMap<String,Client> map=new HashMap<>();
	
	@Override
	public boolean save(Client client) {
		if(map.put(client.getPhoneNo(), client) != null) {
		return true;}
		return false;
	}

	@Override
	public Client findOne(String phoneNo) {
		if(map.containsKey(phoneNo))
		return map.get(phoneNo);
		return null;
	}

}
