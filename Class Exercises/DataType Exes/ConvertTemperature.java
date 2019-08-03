//Write a Java program to convert temperature from Fahrenheit to Celsius degree. 
// 1 c = 33.8 F
//1 F = -17.22 c
package DataTypeLink;

public class ConvertTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double fah = 70;
		 double cel = ConvertToCelcius(fah);
		System.out.println("The Temperature converted to Celcius is: "+cel);
	}
	
	public static double ConvertToCelcius(double f) {
		double resultCel = (f-32)*0.55555556;
		return resultCel;
	}

}
