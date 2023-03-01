package com.banking.entity;

public class SavingMaxAccount extends SavingAccount {
	
	private int fdInterestRate=7;

	public SavingMaxAccount(String accountCode, String accountName, String openingDate, String expiryDate, int balance,
			int savingAccountInterestRate, int fdInterestRate) {
		super(accountCode, accountName, openingDate, expiryDate, balance, savingAccountInterestRate);
		this.fdInterestRate = fdInterestRate;
	}
}
