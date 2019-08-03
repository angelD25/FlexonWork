package ExePackage;

public class DoubleDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dbl1 = 20;
		double dbl2 = 80;
		double result;
		result = (dbl1+dbl2)*25;
		System.out.println("The total value is: "+result);
		double rem = result % 40;
		if(rem <= 20) {
			System.out.println("The total is over limit");
		}
		else
		{
			System.out.println("The total is not over limit");
		}

	}

}
