package Statics;

public class BestBuy {
	static int numOfComputers;
	String location;
//	public static void m() {       location should be static + location belongs to how many objects u've created!
//		System.out.println(location);
//	}
	static String day = "Monday";
		
	
	static { // static block; It runs first even b4 constructors! 
		System.out.println("First static block!");
		if(day.equals("Saturday")) {
			numOfComputers = 45;
		}else {
		numOfComputers = 50;
	}
	}
	static {
		System.out.println("Second static block!");
	}
public void sell() {
	System.out.println("Computer is sold");
	numOfComputers--;
}
}
