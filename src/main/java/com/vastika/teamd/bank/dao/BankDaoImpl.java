package com.vastika.teamd.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vastika.teamd.bank.model.Account_balance_tbl;
import com.vastika.teamd.bank.model.Account_info_tbl;
import com.vastika.teamd.bank.utl.DBUtil;

public class BankDaoImpl implements BankDaoo {
	
	public static final String SQL="insert into account_info_tbl(account_name,address,mobile_no,unique_id_type)value(?,?,?,?)";
	public static final String DEPOSIT_SQL="insert into account_balance_tbl (deposit_amount,balance,account_info_id) values(?,?,?)";
	@Override
	public int openAccount(Account_info_tbl accountInfo) {
		int deposit=1;
		try(
				Connection con=DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(SQL);){
			ps.setString(1, accountInfo.getAccount_name());
			ps.setString(2,accountInfo.getAddress());
			ps.setLong(3, accountInfo.getMobile());
			ps.setString(4, accountInfo.getUnique_id_type());
			deposit=ps.executeUpdate();
			if(deposit>=1) {
				System.out.println("Account Info added");
			}else
				System.out.println("error in db");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deposit;
	}

	@Override
	public int deposit(Account_balance_tbl accountBlance) {
		int deposit=1;
		try(
				Connection con = DBUtil.getConnection();
				PreparedStatement ps=con.prepareStatement(DEPOSIT_SQL);){
			ps.setLong(1, accountBlance.getDeposit_amount());
			ps.setLong(2, accountBlance.getBalance());
			ps.setLong(3, accountBlance.getAccount_info_id());
			deposit = ps.executeUpdate();
			if(deposit>=1) {
				System.out.println("amount deposit");
			}else
				System.out.println("error in db");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deposit;
	}
	

}
