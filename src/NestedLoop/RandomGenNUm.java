package NestedLoop;

import java.util.Random;

public class RandomGenNUm {
	public static void main(String[] args) {
		Random randomNum = new Random();
		
		int targetNum = randomNum.nextInt(100); 
		int Attempt = 0;
		
		for (int i = 0; i < 100; i++) {
			Attempt++;
			if(i == targetNum) {
				System.out.println("Number is found!");
				System.out.println("Number of attempts: " + Attempt);
				System.out.println("Target: " + targetNum);
				break;
			}
		}
	}

}
