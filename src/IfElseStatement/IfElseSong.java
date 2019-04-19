package IfElseStatement;

import java.util.Random;
import java.util.Scanner;

public class IfElseSong {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Random random = new Random();
		int randomNumber =random.nextInt();
		int remainder = randomNumber%2;
		boolean popular;
		
		
		
		String nameOfSong;
		System.out.println("Please enter your favorite song: ");
		nameOfSong = input.nextLine();
		
		int lengthOfSong = nameOfSong.length();
	  
		
		if(lengthOfSong > 10) {
		System.out.println(nameOfSong);		
		}else {
		System.out.println("Not valid name!");
		}
		
		if (remainder == 0) {
			popular = true;
			System.out.println("Hit Song!");
			}
		else {  
			popular = false;
				System.out.println("Ok song!");
			}
		
		
		
		
		
	}

}
