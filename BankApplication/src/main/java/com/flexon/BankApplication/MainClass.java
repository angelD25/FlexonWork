package com.flexon.BankApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.SQLException;

public class MainClass {
	
	public static void main(String[] args) {
		Database db = new Database();
		Scanner scan = new Scanner(System.in);
		System.out.println("New user? Select 1.Create Account  2.Existing User");
		int option;
		option = scan.nextInt();
		if(option == 1) 
		{
			System.out.println("Okay ! Let's create a new account");
			//db.createTable();
			db.CreateNewUser();	
		}
		else
		{
			BankUser user1=new BankUser();
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter Your AccountId");
			int input = scan1.nextInt();
			System.out.println("Enter Your Password");
			String pwd = scan1.next();
			
			
			String password=user1.getPassword(input) ;
			boolean compare = pwd.contentEquals(password);
			if(compare = true) {
			TransactionProcess(user1,input);
			}
			else {
				System.out.println("Your Username and Password doesn't match. Please try again!");
			}
		}
	}
	
	
	public static int begin() {
		System.out.println("Welcome to Our Bank. What do you want to do today?");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check Bank Details");
		System.out.println("4. Delete Account");
		System.out.println("5. Get History");
		System.out.println("6. Exit");	
		int choice;
		Scanner scan1 = new Scanner(System.in);
		choice = scan1.nextInt();
		return choice;
	}
	
	
	public static void TransactionProcess(BankUser user1,int input) {
		
		double withlimit = 100;
		double depolimit = 100;
		int choice = begin();
		while(true) {
			if(choice!=1 && choice!=2 && choice!=3 && choice!=4 && choice!=5) {
				System.out.println("Thank you for having business with us!");
				break;
			}
			
			
			else if(choice == 1){
				Scanner scan2 = new Scanner(System.in);
				System.out.println("Enter the amount you want to deposit");
				double amount = scan2.nextInt();
				
				depolimit = depolimit - amount;
				 if(depolimit < 0)
				 {
				 System.out.println("You can deposit upto 100 daily ");  
				 }
				 else
				 {
				 user1.deposit(amount,input);
				 }	
			}
			
			
			
			else if(choice == 2) {
				Scanner scan2 = new Scanner(System.in);
				System.out.println("You have " +withlimit+ " withdrawal limit");
				 
				System.out.println("Enter the amount you want to withdraw");
				double amount = scan2.nextInt();
				
				if(amount > withlimit) {
					 System.out.println("Daily limit for withdrawal is 100");
				 }
				else {
					 withlimit = withlimit-amount;
					 if(withlimit < 0) { 
					 System.out.println("Your limit for today is used");
					 }
					 else {
						 user1.withdraw(amount,input);
					 }
				}
			}
			
			else if(choice == 3) {
				user1.getinfo(input);
			}
			
			
			else if(choice == 4) {
				Scanner scan = new Scanner(System.in);
				System.out.println("Are you Sure you want to remove your account?1/0");
				int option = scan.nextInt();
				
				if(option == 1) 
				{
				user1.DeleteUser(input);
				System.out.println("It is very sad to see you going. Your Account is Deleted Successfully");
				break;
				}
				else
				{
					System.out.println("Not Deleted");
				}
			}
			
			else if(choice == 5) {
				user1.getHistory(input);
			}
			
			System.out.println("\n\n\n");
			choice = begin();
		}
	}
		
}
