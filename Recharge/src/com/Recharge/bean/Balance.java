package com.Recharge.bean;

import java.math.BigDecimal;

public class Balance {

	private BigDecimal amount;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Balance [balance=" + amount + "]";
	}
}
