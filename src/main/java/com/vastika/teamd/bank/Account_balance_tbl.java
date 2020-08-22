package com.vastika.teamd.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Account_balance_tbl {
	
	public static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/bank_tbl";
	public static final String USER_NAME="root";
	public static final String PASSWORD="1234";

	public static final String SQL="create table account_balance_tbl(deposit_amount varchar(45), withdraw_amount varchar(45), balance_account_info_id int not null auto_increment, primary key(balance_account_info_id))";


	public static void main(String[] args) {
		try(
				Connection con=DriverManager.getConnection(URL, USER_NAME, PASSWORD);
				Statement st = con.createStatement();
				){
			st.executeUpdate(SQL);
			System.out.println("table created.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
