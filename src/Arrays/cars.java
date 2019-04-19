package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class cars {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("How many cars do you have?: ");
		int numberOfCars = input.nextInt();
		input.nextLine();
		
		String []myGarage = new String [numberOfCars];
		int counter = 0;
		
		
		for(int i = 0; i < numberOfCars; i++) {
				System.out.println("Enter car " + (i+1) + ":");
				String carName = input.nextLine();
				myGarage[i] = carName;
				
		if(carName.equalsIgnoreCase("bmw") || carName.equalsIgnoreCase("mercedes")) {
			 counter ++;
			
		    }
		}
		if(counter > 0) {
			System.out.println("You have German car");
		}
		    else {
		    	System.out.println("You don't have German car.");
		
		   System.out.println(Arrays.toString(myGarage));
		
	}
	}
}


