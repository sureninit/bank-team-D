package com.vastika.teamd.bank.service;

import com.vastika.teamd.bank.dao.BankDaoImpl;
import com.vastika.teamd.bank.dao.BankDaoo;
import com.vastika.teamd.bank.model.Account_balance_tbl;
import com.vastika.teamd.bank.model.Account_info_tbl;

public class BankServiceImpl implements BankService {

	@Override
	public int openAccount(Account_info_tbl accountInfo) {
		BankDaoo bankDao = new BankDaoImpl();
		return bankDao.openAccount(accountInfo);
		
	}

	@Override
	public int deposit(Account_balance_tbl accountBlance) {
		BankDaoo bankDao = new BankDaoImpl();
		return bankDao.deposit(accountBlance);
		
	}

}
