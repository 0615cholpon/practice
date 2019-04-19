package replit;

public class CountAppearance {
	public static void main(String[] args) {
String [] names = {"Cholpon", "James", "Albina", "Albina", "Sam" };
		System.out.println(count_Appearance(names, "Albina"));
//count_Appearance(names, "Albina");
		
		
	}
	public static int count_Appearance(String[] arr, String t) {
		int counter = 0;
		
		for(int i = 0; i < arr.length; i++) {
		//	counter = 0;
			//for(int k = 0; k < arr.length; k++) {
				if(arr[i] == t) {
					counter++;
				}
			}
		
		return counter;
		
	}

}
