package methodExe1;

import java.util.Scanner;

public class BankAcc {
  private int accNumber=123;
  private double balance=0;
  private String custName="Anjali";
  private String email="abc@def.com";
  private long contactNum=510;
  
  
  public int getAccNumber() {
	return accNumber;
  }

  public void setAccNumber(int accNumber) {
	this.accNumber = accNumber;
  }

  public double getBalance() {
	return balance;
  }

  public void setBalance(int balance) {
	this.balance = balance;
  }

  public String getCustName() {
	return custName;
  }

  public void setCustName(String custName) {
	this.custName = custName;
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

  
  public void deposit(double amount) {
	  balance = balance + amount;
	  System.out.println("The amount added is:" +amount);
	  System.out.println("Your new balance is:" +balance);
	  
  }
  
  public void withdraw(double amount) {
	  if(amount >= balance) {
	  System.out.println("You have not enough balance to withdraw this much amount");
	  }
	  else {
	  balance = balance - amount;
	  System.out.println("The amount duducted is: "+amount);
	  System.out.println("Your new balance is:" +balance);
	  }
  }
  
  public void printInfo() {
	  System.out.println("Customer name : "+this.getCustName());
	  System.out.println("Account number : "+this.getAccNumber());
	  System.out.println("Balace : "+this.getBalance());
	  System.out.println("Customer email : "+this.getEmail());
	  System.out.println("Customer phone number : "+this.getContactNum());
  }
}
