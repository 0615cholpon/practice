package Methods;

import java.util.Random;

public class firstLAstName {
	public static void main(String[] args) {
		firstLastNames("Cholpon", "Shabolotova");
		
	}
	public static void firstLastNames(String first, String Last) {
		Random magic = new Random();
		int randomNum = magic.nextInt(100);
		System.out.println(first.toLowerCase() + Last.toLowerCase()+  randomNum);
	}

}
