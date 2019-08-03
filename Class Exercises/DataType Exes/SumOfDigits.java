//Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
package DataTypeLink;

import java.util.Scanner;

public class SumOfDigits {

	public static int sumDigits(int num) {
		int number = 0;
		while(num > 0) {
			number += num % 10;
			num /= 10;
		}
		return number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String choice="y";
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Enter n for exit and y for new trail");
		choice=scan.nextLine();*/
		Scanner scan = new Scanner(System.in);
		do {
		System.out.println("Enter your number between 1 and 1000");
		num = scan.nextInt();	
		if(num>1 && num < 1000)
		{
			int sum = sumDigits(num);
			System.out.println("The sum of the digits is: "+sum);
		}
		else
		{
			System.out.println("Enter the valid Number please");
		}
		System.out.println("Enter no for exit and yes for new trail");
		int cho;
		cho= scan.nextInt();
		if(cho == 0) {
			System.out.println("GoodBye!");
			break;
		}
		else {}
		}while(choice == "y");
	
		
	}

}
