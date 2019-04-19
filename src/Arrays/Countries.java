package Arrays;

import java.util.Arrays;

public class Countries {
public static void main(String[] args) {
	String [] cities = {"vbnChicago", "New York", "Madison", "Miami", "Washington"};
	System.out.println(Arrays.toString(cities));
	boolean check = true;
for (int k = 0; k < cities.length; k++) {
	if(cities[k].equals("Chicago")) {
		System.out.println("Windy city found!");
		check = false; //we want to have a flag that we found the city
		break;	
	}
	}
	if(check) {
		System.out.println("Windy city not found!");	}
	int cityCounter = 0;
	for (int k = 0; k < cities.length; k++) {
	if(cities[k].equals("Chicago")) {
		cityCounter ++;	 
	}	
}
	// @ least one Chicago in the list:
	// w/h boolean
	
	if(cityCounter > 0) {
	System.out.println("Number of Chicago: " + cityCounter);
}
}
}