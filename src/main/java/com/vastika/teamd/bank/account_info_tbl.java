package com.vastika.teamd.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class account_info_tbl {


	public static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/bank_tbl";
	public static final String USER_NAME="root";
	public static final String PASSWORD="1234";

	public static final String SQL="create table account_info_tbl(id int not null, account_name varchar(45), address varchar(45), mobile_no varchar(45), unique_id_type varchar(45))";


	public static void main(String[] args) {
		try(
				Connection con=DriverManager.getConnection(URL, USER_NAME, PASSWORD);
				Statement st = con.createStatement();
				){
			st.executeUpdate(SQL);
			System.out.println("account_info table created.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
