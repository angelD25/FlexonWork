package com.flexon.BankApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class Database {
	final static String JDBC_DRIVER ="com.mysql.jdbc.Driver";
	final static String DB_URL ="jdbc:mysql://192.168.99.100:3306/BankDB";
	final static String User = "root";
	final static String Password ="mypwd";
	static Connection conn = null;
	
	public static void createTable() {
		try {
			  Class.forName("com.mysql.jdbc.Driver");
			  conn = DriverManager.getConnection(DB_URL,User,Password);
			  System.out.println("Creating Your Account");
			  int balance = 50;
			  Statement stmt =conn.createStatement();
			  String sqlcreate ="CREATE TABLE Account"
					  			+"(AccountId INTEGER NOT NULL AUTO_INCREMENT,"
					  			+"FirstName VARCHAR(255),"
					  			+"LastName VARCHAR(255),"
					  			+"Email VARCHAR(255),"
					  			+"Balance INTEGER,"
					  			+"ContactNum BIGINT,"
					  			+"Pwd VARCHAR(255),"
					  			+"PRIMARY KEY(AccountId));";
              stmt.executeUpdate(sqlcreate);
              String sqlcreateactivity ="CREATE TABLE Activity"
			  			+"(ActivityId INTEGER NOT NULL AUTO_INCREMENT,"
			  			+ "Time DATE,"
			  			+ "Description VARCHAR(255),"
			  			+ "Amount INTEGER,"
			  			+ "Balance INTEGER,"
			  			+ "AccountId INTEGER,"
			  			+ "PRIMARY KEY(ActivityId),"
			  			+ "FOREIGN KEY(AccountId) REFERENCES Account(AccountId));";
              stmt.executeUpdate(sqlcreateactivity);
              System.out.println("Account Created");
		}
		catch(SQLException | ClassNotFoundException e) {
			   e.printStackTrace();
		}
	}
	
	public static void CreateNewUser() {
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter Your FirstName:");
		String firstName = scan2.next();
		System.out.println("Enter Your LastName:");
		String lastName = scan2.next();
		System.out.println("Enter Your ContactNum:");
		long contactNum = scan2.nextLong();
		System.out.println("Enter Your Email:");
		String email = scan2.next();
		System.out.println("Enter Your Password:");
		String password = scan2.next();
		String res=null;
		int bal =0;
		try {
			  Class.forName("com.mysql.jdbc.Driver");
			  conn = DriverManager.getConnection(DB_URL,User,Password);
			  System.out.println("Creating a NEW USer Account");
			  int balance = 50;
			  Statement stmt =conn.createStatement();
             
			  String sqlinsert ="INSERT INTO Account"
              					+ "(FirstName,LastName,Email,Balance,ContactNum,Pwd)"
              					+ "VALUES("+"'"+firstName+"','"+lastName+"','"+email+"','"+balance+"','"+contactNum+"','"+password+"');";
              stmt.executeUpdate(sqlinsert);
             
              String sqlgetId = "SELECT * FROM Account ORDER BY AccountId DESC LIMIT 1;"; 
            
              ResultSet set = stmt.executeQuery(sqlgetId);
              while(set.next()) {
            	   res =set.getString("AccountId");
            	   bal =set.getInt("Balance");
              }
              

              LocalDate Time = LocalDate.now();
              String Desc = "Account Created!";
              int amount= 0;
              String sqlinsert1 ="INSERT INTO Activity"
    					+ "(Time,Description,Amount,Balance,AccountId)"
    					+ "VALUES("+"'"+Time+"','"+Desc+"','"+amount+"','"+bal+"','"+res+"');";
              stmt.executeUpdate(sqlinsert1);
              
              System.out.println("Account Created.Your AccountNumber is:"+res);
              System.out.println("Please Remember your AccountNumber for Further Access");
		}
		catch(SQLException | ClassNotFoundException e) {
			   e.printStackTrace();
		}
	}
	
	
	
	
}
