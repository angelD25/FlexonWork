package classesPack;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car car1 =new car();
		car1.color = "black";
		car1.door = 4;
		car1.moonroof  = true;
		car1.speed = 65;
		
		System.out.println(car1.color);
		car1.start("BMW");
		
	}

}
