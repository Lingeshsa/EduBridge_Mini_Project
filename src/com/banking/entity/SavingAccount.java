package com.banking.entity;

public class SavingAccount extends Account {
	
	private int savingAccountInterestRate=5;

	

	public SavingAccount(String accountCode, String accountName, String openingDate, String expiryDate, int balance,
			int savingAccountInterestRate) {
		super(accountCode, accountName, openingDate, expiryDate, balance);
		this.savingAccountInterestRate = savingAccountInterestRate;
	}

	public int getSavingAccountInterestRate() {
		return savingAccountInterestRate;
	}

	public void setSavingAccountInterestRate(int savingAccountInterestRate) {
		this.savingAccountInterestRate = savingAccountInterestRate;
	}

	
	
	

}