//Write a Java program to convert minutes into a number of years and days.
//525600 mins = 1 year
package DataTypeLink;

import java.util.Scanner;

public class ConvertMinToYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of mins");
		float mins = scan.nextFloat();
		 float years = ConvertToYears(mins);
		System.out.println("The Minutes converted to Years is: "+years);
	}
	
	public static float ConvertToYears(float mn) {
		float resultyear = mn/525600;
		return resultyear;
	}


}
