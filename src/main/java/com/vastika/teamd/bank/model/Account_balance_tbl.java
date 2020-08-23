package com.vastika.teamd.bank.model;

public class Account_balance_tbl {
	private long deposit_amount;
	private long withdraw_amount;
	private long balance;
	private int account_info_id;
	public long getDeposit_amount() {
		return deposit_amount;
	}
	public void setDeposit_amount(long deposit_amount) {
		this.deposit_amount = deposit_amount;
	}
	public long getWithdraw_amount() {
		return withdraw_amount;
	}
	public void setWithdraw_amount(long withdraw_amount) {
		this.withdraw_amount = withdraw_amount;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public int getAccount_info_id() {
		return account_info_id;
	}
	public void setAccount_info_id(int account_info_id) {
		this.account_info_id = account_info_id;
	}
	
}
