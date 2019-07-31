package methodExe1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		BankAcc user1 = new BankAcc();
		
		user1.setAccNumber(1);
		user1.setBalance(1000);
		user1.setContactNum(123);
		user1.setCustName("Anjali Tandel");
		user1.setEmail("anjalitandel56@gmail.com");
		int choice = begin();
		double withlimit = 100;
		double depolimit = 100;
		while(true) {
		
			if(choice!=1 && choice!=2 && choice!=3) {
				return;
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
				 user1.deposit(amount);
				 }	
			}
			else if(choice == 2) {
				System.out.println("You have " +withlimit+ " withdrawal limit");
				 Scanner scan = new Scanner(System.in);
				 System.out.println("Enter the amount you want to withdraw");
				 double amount = scan.nextInt();
				 if(amount > withlimit) {
					 System.out.println("Daily limit for withdrawal is 100");
				 }
				 else {
					 withlimit = withlimit-amount;
					 if(withlimit < 0) { 
					 System.out.println("Your limit for today is used");
					 }
					 else {
						 user1.withdraw(amount);
					 }
				}
			}
			else if(choice == 3) {
				System.out.println("Your balance is" + user1.getBalance());
			}
			System.out.println("\n\n\n");
			choice = begin();
		}
		
	
	
	}

public static int begin() {
	System.out.println("What do you want to do today?");
	System.out.println("1. Deposit");
	System.out.println("2. Withdraw");
	System.out.println("3. Check Balance");
	System.out.println("4. Exit");	
	int choice;
	Scanner scan1 = new Scanner(System.in);
	choice = scan1.nextInt();
	return choice;
}

}

