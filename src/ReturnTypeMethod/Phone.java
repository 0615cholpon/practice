package ReturnTypeMethod;

public class Phone {
	public static void main(String[] args) {
	boolean day = isWeatherSunny("Monday");
	
		if(day) {
			System.out.println("Let's go to school and study!");
		}else {
			System.out.println("Let's sleep!");
		}	
	}
	public static boolean isWeatherSunny(String day) { 
	// Function is only to check whether the weather is sunny or not
	// If we want to develop  our method then it should be in the main method
		if(day.equals("Tuesday")) {
			return true;
		}
		return false;
	}

}
