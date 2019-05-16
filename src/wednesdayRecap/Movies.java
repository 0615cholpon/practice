package wednesdayRecap;

import java.util.Arrays;

public class Movies {
	public static void main(String[] args) {
		String[]shows = new String[5];
		shows[0] = "Friends";
		shows[1] = "Doctor Who";
		shows[2] = "Greys Anatomy"; 
		shows[3] = "Game of Thrones";
		shows[4] = "Prison Break";
		
		Arrays.sort(shows);
		System.out.println("Sorted list of shows:");
		for (int i = 0; i < shows.length; i++) {

			System.out.println("#" + i + " " + shows[i]);
		}
	}
}

