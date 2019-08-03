package classesPack;

public class car {
	public String color;
	public int door;
	public Boolean moonroof= false;
	public int speed;
	
	public void start(String carName) {
		System.out.println(carName + " is started");
	}
	public void stop() {
		System.out.println("Car is stopped");
	}
	public void accelerate() {
		System.out.println("Car is moving");
	}
	public void turnright() {
		System.out.println("Turn right signal");
	}
	public void turnleft() {
		System.out.println("Turn left signal");
	}
	
	car(){
		System.out.println("Car object is created");
		
	}
}
