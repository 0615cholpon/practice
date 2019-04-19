package VATasks;

import replit.rectangleWithempty;

public class WhileAlphabet {
	public static void main(String[] args) throws InterruptedException {
		char letter = 'a';
		while(letter <= 'z') {
			System.out.print(letter + ", ");
			letter++;
			//Thread.sleep(500);
		}
		System.out.println();
		char CapLetter = 'A';
		while(CapLetter <= 'Z') {
			System.out.print(CapLetter + ", ");
			CapLetter++;
			//Thread.sleep(500);
		}
		System.out.println();
		char RevLetter = 'z';
		while(RevLetter >= 'a') {
			System.out.print(RevLetter + ", ");
			RevLetter--;
		}
		System.out.println();
		char CapRevLetter = 'Z';
		while(CapLetter >= 'A') {
			System.out.print(CapLetter + ", ");
			CapLetter--;
		}
	}

}
