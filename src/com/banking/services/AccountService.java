package com.banking.services;

import com.banking.entity.Account;

public interface AccountService {
	public Account createAccount(int customerId);
	public void depositAmount(int customerId);
	public void withDrawAmount(int customerId);
	public void displayAccounts(int customerId);


}
