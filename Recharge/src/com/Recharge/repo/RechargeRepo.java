package com.Recharge.repo;

import com.Recharge.bean.Client;

public interface RechargeRepo {
	public boolean save(Client client);
	public Client findOne(String phoneNo);
	
}
