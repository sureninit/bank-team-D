package com.vastika.teamd.bank.service;

import com.vastika.teamd.bank.model.Account_balance_tbl;
import com.vastika.teamd.bank.model.Account_info_tbl;

public interface BankService {

	int openAccount(Account_info_tbl accountInfo);
	
	int deposit(Account_balance_tbl accountBlance);
}
