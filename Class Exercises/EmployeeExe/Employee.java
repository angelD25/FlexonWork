package Assignment;

public class Employee {

	private static String Name;
	private static String Company;
	private static String Location;
	
	public static void greet(String nm) {
		System.out.println("Hello "+nm);
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
}
