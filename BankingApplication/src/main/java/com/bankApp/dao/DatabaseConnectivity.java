package com.bankApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 class DatabaseConnectivity 
 {
	
	public Connection dbConnection()
	{
		Connection conn=null;
		
		String databaseUrl="jdbc:mysql://localhost:3306/bankapp";
		String userName="root";
		String userPassword="mysql";
		
		
		
				try {
					conn=DriverManager.getConnection(databaseUrl, userName, userPassword);
					
				} 
				
				catch (SQLException e) {
					System.out.println("Server Problem!!");
				}
		return conn;	
		
	}

}
