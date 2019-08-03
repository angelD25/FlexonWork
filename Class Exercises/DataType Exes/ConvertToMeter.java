//Write a Java program that reads a number in inches, converts it to meters.
//
package DataTypeLink;

public class ConvertToMeter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double inch = 70;
		 double meter = ConvertToMeter(inch);
		System.out.println("The Inches converted to Meter is: "+meter);
	}
	
	public static double ConvertToMeter(double i) {
		double resultmeter = i*0.0254;
		return resultmeter;
	}
}
