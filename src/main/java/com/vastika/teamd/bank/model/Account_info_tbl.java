package com.vastika.teamd.bank.model;

public class Account_info_tbl {
	private int id;
	private String account_name;
	private String address;
	private long mobile;
	private String unique_id_type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getUnique_id_type() {
		return unique_id_type;
	}
	public void setUnique_id_type(String unique_id_type) {
		this.unique_id_type = unique_id_type;
	}
	
	

}
