package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQLConnector {

	  public static void getParticularData() throws SQLException {
		  
		  String url = "jdbc:mysql://localhost:3306/employees";    //JDBC - Java DataBase Connectivity
		  
		  String username = "root";
		  
		  String password = "Jayavivek@879";
		  
		  String query = "select * from employees";
		  
		  //Establising Connection
		  
		 Connection connection =  DriverManager.getConnection(url, username, password);
		  
		 //Create A Statement
		 
		Statement statement = connection.createStatement();
		
		ResultSet result= statement .executeQuery(query);
		
      //For Getting Single Value		
		
		
		result.next();
		
		int emp_no = result.getInt(1);
		
		System.out.println(emp_no);
		
		//For Getting Multiple Value
		
//        while (result.next()) {
//			int emp_no = result.getInt(1);
//			System.out.println(emp_no);
//		}
		
	  }
	  
	  public static void main(String[] args) throws SQLException {
		  getParticularData();
		
	}
}
