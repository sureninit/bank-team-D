package com.vastika.teamd.bank.controller;

import java.util.Scanner;

import com.vastika.teamd.bank.model.Account_balance_tbl;
import com.vastika.teamd.bank.model.Account_info_tbl;
import com.vastika.teamd.bank.service.BankService;
import com.vastika.teamd.bank.service.BankServiceImpl;

public class BankController {

	public void BankAccountInfo(Scanner input) {
		System.out.println("Enter name:");
		String name = input.nextLine();
		System.out.println("Enter address:");
		String address = input.nextLine();
		System.out.println("Enter mobile:");
		long mobile = input.nextLong();
		System.out.println("Enter unique id type:");
		String id_type = input.next();

		Account_info_tbl accountInfo = new Account_info_tbl();
		accountInfo.setAccount_name(name);
		accountInfo.setAddress(address);
		accountInfo.setMobile(mobile);
		accountInfo.setUnique_id_type(id_type);
		
		BankService bankService = new BankServiceImpl();
		int open = bankService.openAccount(accountInfo);

	}
	
	public void amountDeposit(Scanner input) {
		Account_balance_tbl accountBalance= new Account_balance_tbl();
		System.out.println("Enter deposit amount");
		int deposite = input.nextInt();
		System.out.println("Enter id:");
		int id=input.nextInt();
		accountBalance.setAccount_info_id(id);
		accountBalance.setDeposit_amount(deposite);
		BankService bankService = new BankServiceImpl();
		int dep = bankService.deposit(accountBalance);
			
			
	
	}

}
