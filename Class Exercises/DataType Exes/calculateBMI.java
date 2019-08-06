//Write a Java program to compute body mass index (BMI).
//formula : 703 x weight (lbs) / [height (in)]2
package DataTypeLink;

import java.util.Scanner;

public class calculateBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double BMI ;
		double height;
		double weight;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter weight in pounds");
		weight = scan.nextDouble();
		System.out.println("Enter height in inches");
		height = scan.nextDouble();
		BMI = 703 * weight/ (height*height);
		System.out.println("The Calculated BMI is: "+BMI);
	}

}
