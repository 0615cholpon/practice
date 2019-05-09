package replit;

import java.util.ArrayList;

public class RepeatAll {
	public static void main(String[] args) {
		ArrayList<Boolean> repeat = new ArrayList<Boolean>();
		repeat.add(true);
		repeat.add(false);
		repeatAl(repeat);
		
	}
	public static void repeatAl(ArrayList<Boolean> repeat) {

		for(int i = 0; i < repeat.size(); i++) {
			repeat.add(repeat.get(i));
			
		}
	
		System.out.println(repeat);
		
	}
	

}
