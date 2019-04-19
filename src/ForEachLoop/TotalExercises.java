package ForEachLoop;

import java.util.Scanner;

public class TotalExercises {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the word: ");
String word = input.nextLine();

String container = "";
int counter = 0;

for(int i = 0; i < word.length(); i++) {
	counter = 0;
	char letter = word.charAt(i);
	if(!container.contains(letter + "")) {
		for(int j = 0; j < word.length(); j++) {
			if(letter == word.charAt(j)) {
				counter++;
			}
		}
		System.out.print(letter + ":" + counter + " ");
		container += letter;
	}
	
}
}

}

	

