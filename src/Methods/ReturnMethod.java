package Methods;



public class ReturnMethod {
	public static void main(String[] args) {
	String date = getDate();
	System.out.println(date);
		
	}
	public static String getDate() {
		System.out.println("Today's date is:");
		return "April 13, 2019";
				
	}

}
