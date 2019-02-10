package com.Recharge.main;

import java.math.BigDecimal;

import com.Recharge.repo.RechargeRepoImpl;
import com.Recharge.services.RechargeServiceImpl;

public class ClientMain {

	public static void main(String[] args) {
		RechargeRepoImpl recrepo=new RechargeRepoImpl();
		RechargeServiceImpl recser=new RechargeServiceImpl(recrepo);
		System.out.println(recser.createAccount("nitin", "7351117070", "prepaid", new BigDecimal(1000)));
		System.out.println(recser.createAccount("naman", "9690095195", "postpaid", new BigDecimal(2000)));
		System.out.println(recser.rechargeAccount("7351117070", new BigDecimal(500)));
		System.out.println(recser.getAccountDetails("9690095195"));
		
	}

}
