package WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class GuessingTheRandomNUm {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Random random = new Random();
	
	int randomNum = random.nextInt(10);
	System.out.println(randomNum);
	int GuessNumber;
	
	do {  
		System.out.println("Enter your guess number in the range of 0 to 100: ");
		GuessNumber = input.nextInt();


		if(GuessNumber > randomNum) {
			System.out.println("Your guess is too high!");

		}else if (GuessNumber < randomNum) {
			System.out.println("Your guess is too low!");
		}else {
			System.out.println("Congratulations!");
		}
	}while (randomNum != GuessNumber); // if they are not equal ask continuously 
	                                  // from the user!
//Another version:
 while(true) {
	 System.out.println("Enter your guess number in the range of 0 to 100: ");
		GuessNumber = input.nextInt();


		if(GuessNumber > randomNum) {
			System.out.println("Your guess is too high!");

		}else if (GuessNumber < randomNum) {
			System.out.println("Your guess is too low!");
		}else {
			System.out.println("Congratulations!");
			break;
		}
	 
 }

}
}

