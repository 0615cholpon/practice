package Arrays;

import java.util.Arrays;

public class StringArrayforColors {
	public static void main(String[] args) {
		//Create String Array for the colors;
		
		String [] colors = {"white", "blue", "red", "black"};
		
	
		for(int i = 0; i < colors.length; i++) {
			 if(colors[i].length() >= 4) {
				 System.out.println(colors[i]);
				 
			 }
			
			
		}
		
		
	}

}
