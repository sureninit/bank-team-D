package com.vastika.teamd.bank.utl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/bank_tbl";
	public static final String USER_NAME="root";
	public static final String PASSWORD="1234";
	
	public static Connection getConnection() throws SQLException {
	//Class.forName(DRIVER_NAME);
		return DriverManager.getConnection(URL,USER_NAME,PASSWORD);
	}
	
}
