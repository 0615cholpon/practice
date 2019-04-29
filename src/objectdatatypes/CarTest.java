package objectdatatypes;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.make = "Toyota";
		//car1.destination = "school";
		car1.mileage = 20;
		car1.sportEdition = true;
		car1.year = 2019;
		System.out.println(car1.mileage);
		car1.drive();
		System.out.println(car1.mileage);
		car1.drive(1200);
		System.out.println(car1.mileage);
		car1.drive("school");
		//System.out.println(car1.destination);
		

	}

}
