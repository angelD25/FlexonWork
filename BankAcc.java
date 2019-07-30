package methodExe1;

import java.util.Scanner;

public class BankAcc {
  private int accNumber=123;
  private int balance=0;
  private String custName="Anjali";
  private String email="abc@def.com";
  private long contactNum=510;
  
  
  public int getAccNumber() {
	return accNumber;
  }

  public void setAccNumber(int accNumber) {
	this.accNumber = accNumber;
  }

  public int getBalance() {
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

  
  public void deposit() {
	  Scanner scan2 = new Scanner(System.in);
	  System.out.println("Enter the amount you want to deposit");
	  int amount = scan2.nextInt();
	  if(amount>50)
	  {
	  System.out.println("You cannot deposit more than 50");  
	  }
	  else {
	  balance = balance + amount;
	  System.out.println("The amount added is:" +amount);
	  System.out.println("Your new balance is:" +balance);
	  }
  }
  
  public void withdraw() {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the amount you want to withdraw");
	  int amount = scan.nextInt();
	  if(amount > balance) {
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
