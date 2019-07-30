package methodExe1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		BankAcc user1 = new BankAcc();
		
		user1.accNumber = 1;
		user1.balance = 1000;
		user1.contactNum = 123;
		user1.custName = "Anjali Tandel";
		user1.email="anjalitandel56@gmail.com";
		
		int choice = begin();
		
		while(true) {
			if(choice!=1 && choice!=2 && choice!=3) {
				return;
			}
			else if(choice == 1){
				user1.deposit();
			}
			else if(choice == 2) {
				user1.withdraw();
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

