package com.flexon.BankApplication;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class BankUser {
	final static String JDBC_DRIVER ="com.mysql.jdbc.Driver";
	final static String DB_URL ="jdbc:mysql://192.168.99.100:3306/BankDB";
	final static String User = "root";
	final static String Password ="mypwd";
	static Connection conn = null;
	
	  private int accNumber;
	  private String firstName;
	  private String lastName;
	  private String email;
	  private static int balance;
	  private long contactNum;

	  private static Date time;
	  private static String Desc;
	  private static int amount;
	  private static String amountChange;
	public String getFirstName() {
		return firstName;
	  }

	  public void setFirstName(String firstName) {
		this.firstName = firstName;
	  }

	  public String getLastName() {
		return lastName;
	  }

	  public void setLastName(String lastName) {
		this.lastName = lastName;
	  }  
	  
	  public int getAccNumber() {
		return accNumber;
	  }

	  public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	  }

	  public double getbalance() {
		return balance;
	  }

	  public void setBalance(int balance) {
		this.balance = balance;
	  }

	  public String getEmail() {
		return email;
	  }

	  public void setEmail(String email) {
		this.email = email;
	  }

	  public long getContactNum() {
		return contactNum;
	  }

	  public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	  }


	public void getinfo(int input)
	{
	System.out.println("fetching information...");
	try {
	 Class.forName("com.mysql.jdbc.Driver");
	 conn = DriverManager.getConnection(DB_URL,User,Password);
	 Statement stmt =conn.createStatement();
	 
	 String sqlquery = "SELECT * FROM Account WHERE AccountId ='"+input+"';";
	 ResultSet set = stmt.executeQuery(sqlquery);
	
	 while(set.next()) {
  	 accNumber =set.getInt("AccountId");
  	 firstName=set.getString("FirstName");
  	 lastName=set.getString("LastName");
  	 email=set.getString("Email");
  	 balance=set.getInt("Balance");
  	 contactNum=set.getLong("ContactNum");
  	 System.out.println("Customer Name:"+firstName+" "+lastName);
	 System.out.println("Account Number:"+accNumber);
	 System.out.println("Email:"+email);
	 System.out.println("Balance:"+balance);
	 System.out.println("Contact Number:"+contactNum);
    }
	 
	}
	catch(SQLException | ClassNotFoundException e) {
		e.printStackTrace();
	}
	}
	
  public void deposit(double amount,int input) {
	 
	  try{
		  Class.forName("com.mysql.jdbc.Driver");
		  conn = DriverManager.getConnection(DB_URL,User,Password);
		  Statement stmt =conn.createStatement();
		 
		  String sqlquery = "SELECT * FROM Account WHERE AccountId ='"+input+"';";
		  ResultSet set = stmt.executeQuery(sqlquery);
		  while(set.next()) {
			  balance=set.getInt("Balance");
		  }
		  balance += amount;
		  
		  LocalDate Time = LocalDate.now();
		  String Desc = "Deposit";
          
          String sqlinsert1 ="INSERT INTO Activity"
					+ "(Time,Description,Amount,Balance,AccountId)"
					+ "VALUES("+"'"+Time+"','"+Desc+"','"+amount+"','"+balance+"','"+input+"');";
          stmt.executeUpdate(sqlinsert1);
		  
      
		  String sqlupdateBalance = "UPDATE Account SET Balance='"+balance+"'"+" WHERE AccountID='"+input+"';";
		  stmt.executeUpdate(sqlupdateBalance);
		  System.out.println("Successfully Deposited $"+amount+".Now Your Balance is:"+balance);
		  
		
	  }
	  catch(SQLException | ClassNotFoundException e) {
		  e.printStackTrace();
	  }
	  
  }
  
  public void withdraw(double amount,int input) {
	  try{
		  Class.forName("com.mysql.jdbc.Driver");
		  conn = DriverManager.getConnection(DB_URL,User,Password);
		  Statement stmt =conn.createStatement();
		 
		  String sqlquery = "SELECT * FROM Account WHERE AccountId ='"+input+"';";
		  ResultSet set = stmt.executeQuery(sqlquery);
		  while(set.next()) {
			  balance=set.getInt("Balance");
		  }
		  
		  if(amount >= balance) {
			  System.out.println("You have not enough balance to withdraw this much amount");
		  }
		  else {
			  balance -= amount;
			  
			  LocalDate Time = LocalDate.now();
			  String Desc = "Withdrawal";
			  String sqlinsert1 ="INSERT INTO Activity"
						+ "(Time,Description,Amount,Balance,AccountId)"
						+ "VALUES("+"'"+Time+"','"+Desc+"','"+amount+"','"+balance+"','"+input+"');";
	          stmt.executeUpdate(sqlinsert1);
			  
			  String sqlupdateBalance = "UPDATE Account SET Balance='"+balance+"'"+" WHERE AccountID='"+input+"';";
			  stmt.executeUpdate(sqlupdateBalance);
			  
			  System.out.println("Successfully withdrawed $"+amount+".Now Your Balance is:"+balance);
	}
		  
		  
	  }
	  catch(SQLException | ClassNotFoundException e) {
		  e.printStackTrace();
	  }
  }
  
 public static void DeleteUser(int input) {
	try {
	 Class.forName("com.mysql.jdbc.Driver");
	  conn = DriverManager.getConnection(DB_URL,User,Password);
	  Statement stmt =conn.createStatement();
	 
	  String sqlDeletequery1 = "Delete FROM Activity WHERE AccountId='"+input+"';";
	  stmt.executeUpdate(sqlDeletequery1);
	  String sqlDeletequery = "Delete FROM Account WHERE AccountId='"+input+"';";
	  stmt.executeUpdate(sqlDeletequery);
	  
	}
	catch(SQLException | ClassNotFoundException e) {
		e.printStackTrace();
	}
 }

 
public static void getHistory(int input) {
	
	try {
		 Class.forName("com.mysql.jdbc.Driver");
		  conn = DriverManager.getConnection(DB_URL,User,Password);
		  Statement stmt =conn.createStatement();
		  
		  String sqlhistory = "SELECT * FROM Activity  WHERE AccountId='"+input+"' ORDER BY ActivityId DESC;";
		  ResultSet set = stmt.executeQuery(sqlhistory);
		  System.out.printf("%5s %25s %15s %20s", "Date", "Description", "Amount", "Final-Balance\n");
		  while(set.next()) {
			  time = set.getDate("Time");
			  Desc = set.getString("Description");
			  amount = set.getInt("Amount");
			  if(Desc.contentEquals("Deposit"))
			  {
				  String stramt=Integer.toString(amount);
				  amountChange = "+".concat(stramt);
			  }else if(Desc.contentEquals("Withdrawal")) {
				  String stramt=Integer.toString(amount);
				  amountChange = "-".concat(stramt);	  
			  }else {
				  String stramt=Integer.toString(amount);
				  amountChange ="".concat(stramt);
			  }
			  balance = set.getInt("Balance");
			  
			  System.out.format("%10s %20s %12s %15d",time,Desc,amountChange,balance,"\n");
		      System.out.println();
		  }
		  
	}
	catch(SQLException | ClassNotFoundException e) {
		e.printStackTrace();
	}
}


 
@SuppressWarnings("finally")
public static String getPassword(int input) {
	String password= null;
	try {
		 Class.forName("com.mysql.jdbc.Driver");
		 conn = DriverManager.getConnection(DB_URL,User,Password);
		 Statement stmt =conn.createStatement();
		
		 String sqlquery = "SELECT Pwd FROM Account WHERE AccountId ='"+input+"';";
		 ResultSet set = stmt.executeQuery(sqlquery);
		
		 while(set.next()) {
			 password = set.getString("Pwd");
	    }
		}
		catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			return password;
		}
}


 
}
