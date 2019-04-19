package Methods;

public class Phone {
	public static void main(String[] args) {
		boolean check = isWeatherSunny("Tuesday");
		if(check) {
			System.out.println("Let's do picnic!");
		}else {
			System.out.println("Let's code!");
		}
		
	}
	// return type method;
	// returns boolean type;
	// method accepts String;
	public static boolean isWeatherSunny(String day) {
		if(day.equalsIgnoreCase("Monday")) {
			//System.out.println(day + " is sunny!");
			return true; // terminates the method
		} 
		//System.out.println(day + " isn't sunny!");
	 return false; // we can use else {} statement
	}

}
