package Assignment;

import java.util.Scanner;

public class PrintNumsInBw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start,end;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Start Num: ");
		start = scan.nextInt();

		System.out.println("Enter End Num: ");
		end = scan.nextInt();
		
		for(int i=start;i<=end;i++) {
			System.out.print(i+" ");
		}
	}

}
