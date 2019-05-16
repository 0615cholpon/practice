package wednesdayRecap;

public class Cars {
	public static void main(String[] args) {
		String[] carBrands = {"mercedes", "bmw", "toyota", "ferrari"};
		
		for(int i = 0; i < carBrands.length; i++) {
			
			if(carBrands[i].equalsIgnoreCase("mercedes")) {
				System.out.println("mercedes: Luxury-Comfort");
			}
			else if(carBrands[i].equalsIgnoreCase("bmw")) {
				System.out.println("bmw: Luxury-Sport");
			}
			else if(carBrands[i].equalsIgnoreCase("toyota")) {
				System.out.println("toyota: Reliable-Cheap");
			}else {
				System.out.println("ferrari: Super car-Super Expensive");
			}
		}
		System.out.println();
		
		for(String cars: carBrands) {
			if(cars == "bmw") {
				System.out.println(cars + " : Luxury-Comfort");
			}else if(cars == "mercedes") {
				System.out.println(cars + ": Luxury-Sport");
			}
		}
	}

}
