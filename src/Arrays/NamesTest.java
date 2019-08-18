package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NamesTest {
	//Step1: download the charAandB.txt to your computer
	//Step2: copy & paste it on your project
	//Step3: create a class Names and paste the code snippet to there
	public static void main(String[] args) throws FileNotFoundException {
		//print the names that has the length of 5
		// print all the names but empty lines
		File file = new File("charAandB.txt");
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine()){  
		String name = sc.nextLine().trim();
//		if(name.length() == 5) {
		if(name.isEmpty())
			continue;
	System.out.println(name);

	}
	}
}
