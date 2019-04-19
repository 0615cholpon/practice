package ForEachLoop;

public class UppercaseCount {
	public static void main(String[] args) {
		String[] groceries = {"Bread", "Cucumber", "apples", "orange", 
				"cookies", "Cake", "Salt"};
	int counter = 0;
	for(String Grocery: groceries) {
		for (int i =0; i< Grocery.length(); i++) {
			char letter = Grocery.charAt(i);
			if(letter >= 65 && letter <= 90) {
				counter ++;	
			}
		}
		
	}
	System.out.println("Total words starting with upper case: " + counter);
	
	}

}
