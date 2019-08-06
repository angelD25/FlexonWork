// Write a Java program to takes the user for a distance (in meters) and the 
// time was taken (as three numbers: hours, minutes, seconds), and 
// display the speed, in meters per second, kilometers per hour and miles per hour 
// (hint: 1 mile = 1609 meters). 

package DataTypeLink;

import java.util.Scanner;

public class CalculateDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double meters;
		double hours;
		double minutes;
		double seconds;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter distance in meters: ");
		meters = scan.nextDouble();
		System.out.println("Enter the hour: ");
		hours = scan.nextDouble();
		System.out.println("Enter the minutes: ");
		minutes = scan.nextDouble();
		System.out.println("Enter the seconds: ");
		seconds = scan.nextDouble();
		
	    double timeseconds = (hours*3600) + (minutes*60) + (seconds);
	    double mps = meters / timeseconds;
	    double kmph = (meters/1000.0f) / (timeseconds/3600.0f);
	    double mph = kmph /1.609f;
	    System.out.println("Your speed in meters/second is: "+mps);
	    System.out.println("Your speed in kilo-meters/hours is: "+kmph);
	    System.out.println("Your speed in meters/hour is: "+mph);	
	}

}
