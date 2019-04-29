package objectdatatypes;

public class Car {
	String make;
	int year;
	boolean sportEdition;
	int mileage;
	//String destination;
	
	public void drive() {
		System.out.println(year + " " + make + " is driving");
		mileage += 10;

	}
	public void drive(String desination) {
		System.out.println(year  + make + " is driving " + "to " + desination);
		mileage += 10;
	}
	public void drive(int mile) {
		System.out.println(year + " year "  + make + " is driving " + mileage + " miles");
		mileage= mile;
		
	}
	

}
