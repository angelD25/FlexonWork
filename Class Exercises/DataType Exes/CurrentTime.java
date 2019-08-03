//Write a Java program that prints the current time in GMT.

package DataTypeLink;


import java.util.Scanner;

public class CurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the timezone offset");
		int timezone =scan.nextInt();
		long totalMilliseconds = System.currentTimeMillis(); //getting total milliseconds
		long totalSeconds = totalMilliseconds/1000;
		long currentseconds = totalSeconds%60;
		long totalMinutes = totalSeconds/60;
		long currentminutes = totalMinutes%60;
		long totalHours = totalMinutes/60;
		long currenthour = ((totalHours+timezone)%24 -11);
		System.out.println("current time is: "+currenthour+":"+currentminutes+":"+currentseconds);
	}

}
